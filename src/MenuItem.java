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
}