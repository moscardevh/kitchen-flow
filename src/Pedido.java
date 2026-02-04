import java.util.ArrayList;

public class Pedido {
    private int numeroPedido;
    private String nomeCliente;
    private String statusAtual;
    private ArrayList<MenuItem> itens;

    public Pedido(int numeroPedido, String nomeCliente) {
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.statusAtual = "PENDENTE";
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(MenuItem item) {
        this.itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (MenuItem item : this.itens) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayInfo() {
        System.out.println("Pedido #" + this.numeroPedido);
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Status: " + this.statusAtual);
        System.out.println("Itens:");
        for (MenuItem item : this.itens) {
            item.displayMenuItemInfo();
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}
