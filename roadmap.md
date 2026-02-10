# Kitchen Flow - Roadmap do Projeto

## 🎯 Visão Geral do Projeto

### 1 - O que é Kitchen Flow?
O Kitchen Flow é um app web que facilita a vida de quem tem um restaurante, seja caseiro trabalhando com iFood 99 e etc, ou profissional. Ele integra os pedidos (iFood, WhatsApp, 99 etc) e cria o pedido no sistema, repassando este para cozinha (display em monitor ou papel impresso).

### 2 - Para quem é?
- **Donos de restaurantes (compradores)**: Gerenciam todo o sistema
- **Funcionários que atendem clientes (usuário final)**: Normalmente este tem que cuidar de clientes físicos e também virtuais (nosso maior foco é fazer a estrutura do online ser perfeita a ponto do funcionário apenas conferir se necessário, e dar liberdade para ele mesmo adicionar a essa estrutura pedidos no caso de um cliente estar fisicamente no lugar)

### 3 - Problema que resolve?
- Centralizar pedidos de múltiplas plataformas
- Automatizar atendimento e organização da cozinha
- Reduzir erros e atrasos na comunicação
- Facilitar gestão do restaurante

## 🏗️ Estrutura Técnica

### Backend (Totalmente a seu critério)
- **Java 25** + **Spring Boot 4.0.2**
- **JPA/Hibernate** para banco de dados
- **H2 Database** (desenvolvimento) → **PostgreSQL** (produção)
- **REST API** para comunicação

### Frontend
- **HTML5** + **CSS3** + **JavaScript Vanilla**
- **Design responsivo** para mobile e desktop
- **Interface intuitiva** para funcionários

### Integrações Futuras
- **WhatsApp Bot** para atendimento automatizado
- **APIs de delivery** (iFood, 99Food, Rappi)
- **Sistema de impressão** para cozinha

## 🚀 Funcionalidades por Fase

### Fase 1: ✅ Menu e API REST (Concluída)
- [x] MenuItem Entity com JPA
- [x] API REST completa (CRUD)
- [x] Frontend básico com cards
- [x] Integração frontend ↔ backend

### Fase 2: 🔄 Sistema de Pedidos (Em andamento)
- [ ] Pedido Entity com relacionamentos
- [ ] PedidoItem Entity (tabela intermediária)
- [ ] Endpoints completos de pedidos
- [ ] Validação e regras de negócio

### Fase 3: 📱 Interface Visual Avançada
- [ ] Dashboard para cozinha
- [ ] Sistema de status de pedidos
- [ ] Histórico de pedidos
- [ ] Relatórios simples

### Fase 4: 🤖 WhatsApp Integration
- [ ] Chatbot para atendimento
- [ ] Processamento de mensagens
- [ ] Criação automática de pedidos
- [ ] Confirmações para clientes

### Fase 5: 🚀 Produção
- [ ] Deploy em nuvem
- [ ] Banco PostgreSQL
- [ ] Sistema de autenticação
- [ ] Performance e otimização

## 📚 Tecnologias a Aprender

### Nível 1: Fundamentos Essenciais
1. **Java Básico e POO** ✅ (dominado)
2. **HTML Básico** 📚 (em aprendizado)
3. **CSS Básico** 📚 (em aprendizado)
4. **JavaScript Básico** 📚 (em aprendizado)

### Nível 2: Prioridade Máxima
1. **REST API** 🚀 (em andamento)
2. **Spring Boot** 🚀 (em andamento)
3. **Java Avançado** 🚀 (em andamento)

### Nível 3: Expansão
1. **Python** 📚 (para WhatsApp bot)
2. **CSS Avançado** 📚 (design profissional)
3. **JavaScript Avançado** 📚 (interações complexas)

### Ordem Sugerida (seu critério final)
1. **Concluir Spring Boot + REST API** (prioridade #1)
2. **Sistema de Pedidos completo** (prioridade #2)
3. **Frontend profissional** (prioridade #3)
4. **WhatsApp Bot** (prioridade #4)
5. **Deploy e produção** (prioridade #5)

## 🎯 Objetivos de Aprendizado

### Imediatos (Próximas 2-3 semanas)
- Dominar relacionamentos JPA
- Criar sistema de pedidos completo
- Integrar frontend com sistema de pedidos

### Médio Prazo (1-2 meses)
- Desenvolver frontend profissional
- Implementar WhatsApp bot básico
- Fazer primeiro deploy

### Longo Prazo (3-6 meses)
- Sistema completo e profissional
- Múltiplos clientes restaurantes
- Portfolio para vagas de emprego

---

## 📝 Notas
- **Foco principal:** Estrutura online perfeita
- **Funcionário:** Apenas confere e adiciona se necessário
- **Cliente físico:** Flexibilidade para pedido manual
- **Cliente online:** Sistema totalmente automatizado
