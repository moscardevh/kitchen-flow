package com.kitchenflow.restaurant_api.config;

import com.kitchenflow.restaurant_api.model.MenuItem;
import com.kitchenflow.restaurant_api.repository.MenuItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(MenuItemRepository repository) {
        return args -> {
            // Limpar dados anteriores
            repository.deleteAll();
            
            // Pizzas
            repository.save(new MenuItem("Marguerita", 79.90, "Pizza", "pizza", "mussarela", "tomate", "manjericão"));
            repository.save(new MenuItem("Bacon", 82.90, "Pizza", "pizza", "mussarela", "muito bacon"));
            repository.save(new MenuItem("Baiana", 76.90, "Pizza", "pizza", "calabresa sadia moída", "pimenta calabresa", "cebola"));
            
            // Bebidas
            repository.save(new MenuItem("Coca-Cola", 8.90, "Bebida", "drink", "refrigerante", "gelada"));
            repository.save(new MenuItem("Suco Laranja", 12.90, "Bebida", "drink", "natural", "fresco"));
            
            // Sobremesas
            repository.save(new MenuItem("Pudim", 15.90, "Sobremesa", "sobremesa", "leite", "chocolate", "doce"));
            repository.save(new MenuItem("Sorvete", 10.90, "Sobremesa", "sobremesa", "creme", "frio"));
            
            System.out.println("🍕 Database populated with sample menu items!");
        };
    }
}
