# Kitchen Flow

🍕 **Sistema completo para gestão de restaurantes** - Desenvolvido em Java com foco em aprendizado prático!

## 🎯 Visão do Projeto

Sistema profissional para gestão de restaurantes/negócios de comida com:
- **CRM** para clientes
- **Chatbot** para WhatsApp  
- **Controle de pedidos** automatizado
- **Gestão de estoque**
- **Ponto eletrônico** (futuro)

## 📋 Fluxo Principal
1. Cliente faz pedido via WhatsApp
2. Chatbot atende e processa pedido
3. Sistema cria pedido automaticamente
4. Pedido exportado para produção (impressão/display)

---

## 🚀 Status Atual (v0.2)

### ✅ **Funcionalidades Implementadas:**
- **MenuItem genérico** com suporte a múltiplas categorias
- **Sistema de preços** integrado
- **Classe Menu** para gerenciamento profissional
- **Saída formatada** com categoria, ingredientes e preços
- **Arquitetura escalável** para diferentes tipos de estabelecimentos

### 🎓 **Conceitos Java Aprendidos:**
- Herança e polimorfismo
- Encapsulamento e construtores
- Palavra-chave `this` e escopo de variáveis
- Refatoração e boas práticas
- Estrutura de projetos orientada a objetos

### 📊 **Evolução do Código:**
```java
// v0.1: Classe específica
public class Pizza { ... }

// v0.2: Sistema genérico e escalável
public class MenuItem { ... }
public class Menu { ... }
```

---

## 🛠️ Como Executar

### Pré-requisitos:
- JDK 17+ (testado com JDK 25)

### Execução:
```bash
cd src/
javac *.java
java App
```

### Saída Esperada:
```
Pizza: Marguerita
Ingredientes: mussarela, tomate, manjericão
Preço: R$ 79.9
```

---

## 🗺️ Roadmap

### 🚧 **Próximos Passos:**
- [ ] Sistema de pedidos
- [ ] Tratamento de exceções
- [ ] Chatbot básico
- [ ] Integração WhatsApp API
- [ ] Interface de produção

### 🎯 **Objetivo de Aprendizado:**
Cada conceito Java é aplicado em um contexto real de negócio, construindo um sistema profissional enquanto aprendemos!

---

## 📚 Metodologia

**Aprendizado prático** - Cada conceito aplicado ao projeto real  
**Problemas reais** - Desafios do dia a dia de restaurantes  
**Progressão natural** - Do simples ao complexo  
**Código funcional** - Sistema utilizável a cada fase
