import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {      
        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Marguerita", 79.90, "Pizza", "mussarela", "tomate", "manjericão"));
        menu.add(new MenuItem("Bacon", 82.90, "Pizza", "mussarela", "muito bacon"));
        menu.add(new MenuItem("Baiana", 76.90, "Pizza", "calabresa sadia moída", "pimenta calabresa em flocos", "cebola"));
        menu.add(new MenuItem("A moda da casa", 82.90, "Pizza", "presunto sadia", "legítimo Catupiry", "mussarela", "parmesão"));
        menu.add(new MenuItem("Peperonni", 84.90, "Pizza", "mussarela", "peperonni sadia"));
        menu.add(new MenuItem("Siciliana", 85.90, "Pizza", "mussarela", "champignon", "bacon"));
        menu.add(new MenuItem("Abacaxi com chocolate", 77.90, "Pizza", "abacaxi", "chocolate", "leite condensado"));

        for (int i = 0; i < menu.size(); i++) {
            menu.get(i).displayMenuItemInfo();
            System.out.println("Tenho " + menu.size() + " pizzas cadastradas no meu menu!");
        }
    }
}
