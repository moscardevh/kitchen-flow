import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> itens;
    private String nomeRestaurante;  

    public Menu(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(MenuItem item) {
        this.itens.add(item);
    }
    
    public void listarTodos() {
        for (MenuItem item : this.itens) {
            item.displayMenuItemInfo();
        }
    }
}

