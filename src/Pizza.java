public class Pizza {
    String nome;
    String ingrediente1;
    String ingrediente2;
    String ingrediente3;
    String ingrediente4;

    // Constructor for pizzas with 4 ingredients
    public Pizza(String nome, String ing1, String ing2, String ing3, String ing4) {
        this.nome = nome;
        this.ingrediente1 = ing1;
        this.ingrediente2 = ing2;
        this.ingrediente3 = ing3;
        this.ingrediente4 = ing4;
    }

    // Constructor for pizzas with 3 ingredients
    public Pizza(String nome, String ing1, String ing2, String ing3) {
        this.nome = nome;
        this.ingrediente1 = ing1;
        this.ingrediente2 = ing2;
        this.ingrediente3 = ing3;
        this.ingrediente4 = "";
    }

    // Constructor for pizzas with 2 ingredients
    public Pizza(String nome, String ing1, String ing2) {
        this.nome = nome;
        this.ingrediente1 = ing1;
        this.ingrediente2 = ing2;
        this.ingrediente3 = "";
        this.ingrediente4 = "";
    }

    // Constructor for pizza with just name
    public Pizza(String nome) {
        this.nome = nome;
        this.ingrediente1 = "";
        this.ingrediente2 = "";
        this.ingrediente3 = "";
        this.ingrediente4 = "";
    }

    public String getIngredientList() {
        String ingredients = "";
        if (!ingrediente1.isEmpty()) ingredients += ingrediente1;
        if (!ingrediente2.isEmpty()) ingredients += ", " + ingrediente2;
        if (!ingrediente3.isEmpty()) ingredients += ", " + ingrediente3;
        if (!ingrediente4.isEmpty()) ingredients += ", " + ingrediente4;
        return ingredients;
    }

    public int getIngredientCount() {
        int count = 0;
        if (!ingrediente1.isEmpty()) count++;
        if (!ingrediente2.isEmpty()) count++;
        if (!ingrediente3.isEmpty()) count++;
        if (!ingrediente4.isEmpty()) count++;
        return count;
    }

    public void displayPizzaInfo() {
        System.out.println("Pizza: " + this.nome);
        System.out.println("Ingredientes: " + this.getIngredientList());
    }
}
