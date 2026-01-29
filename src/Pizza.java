import java.util.ArrayList;

public class Pizza {
    private String nome;
    private ArrayList<String> ingredientes = new ArrayList<>();

public Pizza(String nome, String... ingredientes) {
    this.nome = nome;
    for (String ing : ingredientes) {
        this.ingredientes.add(ing);
    }
}
    public String getIngredientList() {
        String ingredients = "";
        for (int i = 0; i <ingredientes.size(); i++) {
            if (i > 0) ingredients += " , ";
            ingredients += ingredientes.get(i);
        } 
        return ingredients;
    }

    public int getIngredientCount() {
        return ingredientes.size();
        
    }

    public void displayPizzaInfo() {
        System.out.println("Pizza: " + this.nome);
        System.out.println("Ingredientes: " + this.getIngredientList());
    }
    public String getNome() {
    return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
        this.nome = nome;
        }
    }
}
