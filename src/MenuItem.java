import java.util.ArrayList;

public class MenuItem {
    protected String name;
    protected double price;
    protected ArrayList<String> ingredients;
    protected String category;

    public MenuItem(String name, double price, String category, String... ingredients) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.ingredients = new ArrayList<>();
        for (String ing : ingredients) {
            this.ingredients.add(ing);
        }
    }
public String getIngredientList() {
    String ingredients = "";
    for (int i = 0; i < this.ingredients.size(); i++) {
        if (i > 0) ingredients += " , ";
        ingredients += this.ingredients.get(i);
    }
    return ingredients;
}
    public int getIngredientCount() {
        return ingredients.size();
        
    }
    public String getName() {
    return name;
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
    }
}