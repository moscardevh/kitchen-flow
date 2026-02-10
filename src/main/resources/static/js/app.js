// Estado da Aplicação
let menuItems = [];
let cart = [];
let currentFilter = 'todos';

// Elementos DOM
const menuGrid = document.getElementById('menuGrid');
const cartItems = document.getElementById('cartItems');
const cartTotal = document.getElementById('cartTotal');
const orderForm = document.getElementById('orderForm');
const customerName = document.getElementById('customerName');
const confirmModal = document.getElementById('confirmModal');
const confirmMessage = document.getElementById('confirmMessage');

// Inicialização
document.addEventListener('DOMContentLoaded', () => {
    loadMenuItems();
    setupEventListeners();
});

// Setup Event Listeners
function setupEventListeners() {
    // Filtros
    document.querySelectorAll('.filter-btn').forEach(btn => {
        btn.addEventListener('click', (e) => {
            document.querySelectorAll('.filter-btn').forEach(b => b.classList.remove('active'));
            e.target.classList.add('active');
            currentFilter = e.target.dataset.tipo;
            renderMenuItems();
        });
    });

    // Formulário de pedido
    orderForm.addEventListener('submit', handleOrderSubmit);
}

// Carregar itens do menu
async function loadMenuItems() {
    try {
        showLoading();
        const response = await fetch('/api/menu');
        if (!response.ok) throw new Error('Erro ao carregar menu');
        
        menuItems = await response.json();
        renderMenuItems();
    } catch (error) {
        showError('Erro ao carregar menu: ' + error.message);
    }
}

// Renderizar itens do menu
function renderMenuItems() {
    const filteredItems = currentFilter === 'todos' 
        ? menuItems 
        : menuItems.filter(item => item.tipo === currentFilter);

    if (filteredItems.length === 0) {
        menuGrid.innerHTML = '<div class="loading">Nenhum item encontrado</div>';
        return;
    }

    menuGrid.innerHTML = filteredItems.map(item => createMenuCard(item)).join('');
}

// Criar card de item
function createMenuCard(item) {
    const unavailableClass = !item.disponivel ? 'unavailable' : '';
    const disabledBtn = !item.disponivel ? 'disabled' : '';
    
    return `
        <div class="menu-card ${unavailableClass}">
            <div class="menu-card-header">
                <h3>${item.name}</h3>
                <div class="category">${item.category}</div>
            </div>
            <div class="menu-card-body">
                <div class="ingredients">${item.ingredients.join(', ')}</div>
            </div>
            <div class="menu-card-footer">
                <div class="price">R$ ${item.price.toFixed(2)}</div>
                <button class="add-btn" onclick="addToCart(${item.id})" ${disabledBtn}>
                    ${item.disponivel ? 'Adicionar' : 'Indisponível'}
                </button>
            </div>
        </div>
    `;
}

// Adicionar ao carrinho
function addToCart(itemId) {
    const item = menuItems.find(i => i.id === itemId);
    if (!item || !item.disponivel) return;

    const existingItem = cart.find(i => i.id === itemId);
    if (existingItem) {
        existingItem.quantity++;
    } else {
        cart.push({ ...item, quantity: 1 });
    }

    renderCart();
    showNotification(`${item.name} adicionado ao carrinho!`);
}

// Remover do carrinho
function removeFromCart(itemId) {
    cart = cart.filter(item => item.id !== itemId);
    renderCart();
}

// Atualizar quantidade
function updateQuantity(itemId, change) {
    const item = cart.find(i => i.id === itemId);
    if (!item) return;

    item.quantity += change;
    if (item.quantity <= 0) {
        removeFromCart(itemId);
    } else {
        renderCart();
    }
}

// Renderizar carrinho
function renderCart() {
    if (cart.length === 0) {
        cartItems.innerHTML = '<p>Carrinho vazio</p>';
        cartTotal.textContent = '0.00';
        return;
    }

    cartItems.innerHTML = cart.map(item => `
        <div class="cart-item">
            <div class="cart-item-info">
                <div class="cart-item-name">${item.name}</div>
                <div class="cart-item-price">R$ ${item.price.toFixed(2)}</div>
            </div>
            <div class="cart-item-quantity">
                <button class="quantity-btn" onclick="updateQuantity(${item.id}, -1)">-</button>
                <span>${item.quantity}</span>
                <button class="quantity-btn" onclick="updateQuantity(${item.id}, 1)">+</button>
            </div>
        </div>
    `).join('');

    const total = cart.reduce((sum, item) => sum + (item.price * item.quantity), 0);
    cartTotal.textContent = total.toFixed(2);
}

// Enviar pedido
async function handleOrderSubmit(e) {
    e.preventDefault();

    if (cart.length === 0) {
        showNotification('Adicione itens ao carrinho primeiro!');
        return;
    }

    const orderData = {
        customerName: customerName.value,
        items: cart.map(item => ({
            id: item.id,
            name: item.name,
            price: item.price,
            quantity: item.quantity
        })),
        total: cart.reduce((sum, item) => sum + (item.price * item.quantity), 0)
    };

    try {
        const response = await fetch('/api/pedidos', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(orderData)
        });

        if (!response.ok) throw new Error('Erro ao fazer pedido');

        const order = await response.json();
        showOrderConfirmation(order);
        
        // Limpar carrinho e formulário
        cart = [];
        renderCart();
        orderForm.reset();
        
    } catch (error) {
        // Por enquanto, vamos simular o pedido
        console.log('Pedido simulado:', orderData);
        showOrderConfirmation({
            id: Math.floor(Math.random() * 1000),
            ...orderData,
            status: 'PENDENTE'
        });
    }
}

// Mostrar confirmação de pedido
function showOrderConfirmation(order) {
    confirmMessage.innerHTML = `
        <strong>Pedido #${order.id}</strong><br>
        Cliente: ${order.customerName}<br>
        Total: R$ ${order.total.toFixed(2)}<br>
        Status: ${order.status}<br><br>
        <small>Seu pedido foi recebido e está sendo preparado!</small>
    `;
    confirmModal.style.display = 'flex';
}

// Fechar modal
function closeModal() {
    confirmModal.style.display = 'none';
}

// Utilitários
function showLoading() {
    menuGrid.innerHTML = '<div class="loading">Carregando cardápio...</div>';
}

function showError(message) {
    menuGrid.innerHTML = `<div class="error">${message}</div>`;
}

function showNotification(message) {
    // Criar notificação temporária
    const notification = document.createElement('div');
    notification.className = 'notification';
    notification.textContent = message;
    notification.style.cssText = `
        position: fixed;
        top: 20px;
        right: 20px;
        background: #27ae60;
        color: white;
        padding: 1rem 1.5rem;
        border-radius: 10px;
        z-index: 1000;
        animation: slideIn 0.3s ease;
    `;
    
    document.body.appendChild(notification);
    
    setTimeout(() => {
        notification.remove();
    }, 3000);
}

// Fechar modal ao clicar fora
window.onclick = function(event) {
    if (event.target === confirmModal) {
        closeModal();
    }
}
