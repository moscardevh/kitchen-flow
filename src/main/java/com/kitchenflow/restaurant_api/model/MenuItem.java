package com.kitchenflow.restaurant_api.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menu_items")
public class MenuItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private double price;
    
    @ElementCollection
    @CollectionTable(name = "menu_item_ingredients")
    private List<String> ingredients = new ArrayList<>();
    
    @Column(nullable = false)
    private String category;
    
    @Column(name = "tipo")
    private String tipo; // "pizza", "drink", "sobremesa"
    
    @Column(name = "disponivel")
    private boolean disponivel = true;

    // Construtor padrão (JPA exige)
    public MenuItem() {}
    
    public MenuItem(String name, double price, String category, String tipo, String... ingredients) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.tipo = tipo;
        this.ingredients = new ArrayList<>();
        for (String ing : ingredients) {
            this.ingredients.add(ing);
        }
    }
    
    public String getIngredientList() {
        StringBuilder ingredientList = new StringBuilder();
        for (int i = 0; i < this.ingredients.size(); i++) {
            if (i > 0) ingredientList.append(" , ");
            ingredientList.append(this.ingredients.get(i));
        }
        return ingredientList.toString();
    }
    
    public int getIngredientCount() {
        return ingredients.size();
    }
    
    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public List<String> getIngredients() { return ingredients; }
    public void setIngredients(List<String> ingredients) { this.ingredients = ingredients; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }
    public void setIndisponivel() { this.disponivel = false; }
}
