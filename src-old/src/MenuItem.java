import java.util.ArrayList;

public class MenuItem {
    protected String name;
    protected double price;
    protected ArrayList<String> ingredients;
    protected String category;
    protected String tipo; // "pizza", "drink", "sobremesa"
    protected boolean disponivel = true;

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
        String ingredientList = "";
        for (int i = 0; i < this.ingredients.size(); i++) {
            if (i > 0) ingredientList += " , ";
            ingredientList += this.ingredients.get(i);
        }
        return ingredientList;
    }
    public int getIngredientCount() {
        return ingredients.size();
        
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    public void displayMenuItemInfo() {
        System.out.println(category + ": " + name);
        System.out.println("Ingredientes: " + getIngredientList());
        if (price > 0) {
            System.out.println("Preço: R$ " + price);
        }
        System.out.println("Disponível: " + (disponivel ? "SIM" : "NÃO"));
    }
    
    // Métodos para controle de disponibilidade
    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void setIndisponivel() {
        this.disponivel = false;
    }
    
    // Getters/Setters para tipo
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}