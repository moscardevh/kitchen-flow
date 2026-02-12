package com.kitchenflow.restaurant_api.service;

import com.kitchenflow.restaurant_api.model.MenuItem;
import com.kitchenflow.restaurant_api.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MenuItemService {
    
    @Autowired
    private MenuItemRepository repository;
    
    // Retorna todos os itens do menu
    public List<MenuItem> getAllMenuItems() {
        return repository.findAll();
    }
    
    // Salva item com validações
    public MenuItem saveMenuItem(MenuItem menuItem) {
        if (menuItem.getPrice() <= 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        return repository.save(menuItem);
    }

    // Busca por ID
    public Optional<MenuItem> findById(Long id) {
        return repository.findById(id);
    }

    public List<MenuItem> getMenuItemsByTipo(String tipo){
        return repository.findByTipo(tipo);
    }
    
    // Retorna itens disponíveis
    public List<MenuItem> getAvailableMenuItems() {
        return repository.findByDisponivelTrue();
    }
    
    // Deleta item por ID
    public void deleteMenuItem(Long id) {
        if (!repository.existsById(id)) {
            throw new IllegalArgumentException("Item não encontrado com ID: " + id);
        }
        repository.deleteById(id);
    }
}