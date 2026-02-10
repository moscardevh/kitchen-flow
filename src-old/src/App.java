import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {      
        ArrayList<MenuItem> menu = new ArrayList<>();
        
        // Pizzas
        menu.add(new MenuItem("Marguerita", 79.90, "Pizza", "pizza", "mussarela", "tomate", "manjericão"));
        menu.add(new MenuItem("Bacon", 82.90, "Pizza", "pizza", "mussarela", "muito bacon"));
        
        // Bebidas
        menu.add(new MenuItem("Coca-Cola", 8.90, "Bebida", "drink", "refrigerante", "gelada"));
        menu.add(new MenuItem("Suco Laranja", 12.90, "Bebida", "drink", "natural", "fresco"));
        
        // Sobremesas
        menu.add(new MenuItem("Pudim", 15.90, "Sobremesa", "sobremesa", "leite", "chocolate", "doce"));
        menu.add(new MenuItem("Sorvete", 10.90, "Sobremesa", "sobremesa", "creme", "frio"));

        for (int i = 0; i < menu.size(); i++) {
            menu.get(i).displayMenuItemInfo();
            System.out.println("---");
        }
        
        System.out.println("Total de itens no menu: " + menu.size());
    }
}
