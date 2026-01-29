import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Pizzas: Marguerita, Bacon, Baiana, A moda da casa, Peperonni, Siciliana, Abacaxi com chocolate

        ArrayList<Pizza> menu = new ArrayList<>();
        menu.add(new Pizza("Marguerita", "mussarela", "rodelas de tomate", "manjericão fresco", "parmesão"));
        menu.add(new Pizza("Bacon", "mussarela", "muito bacon"));
        menu.add(new Pizza("Baiana", "calabresa sadia moída", "pimenta calabresa em flocos", "cebola"));
        menu.add(new Pizza("A moda da casa", "presunto sadia", "legítimo Catupiry", "mussarela", "parmesão"));
        menu.add(new Pizza("Peperonni", "mussarela", "peperonni sadia"));
        menu.add(new Pizza("Siciliana", "mussarela", "champignon", "bacon"));
        menu.add(new Pizza("Abacaxi com chocolate", "abacaxi", "chocolate", "leite condensado"));

        for (int i = 0; i < menu.size(); i++) {
            menu.get(i).displayPizzaInfo();
            System.out.println("Tenho " + menu.size() + " pizzas cadastradas no meu menu!");
        }
    }
}
