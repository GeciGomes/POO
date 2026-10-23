import java.util.ArrayList;

public class GestaoPedidos {

    // Atributo: Lista dinâmica de pedidos
    private ArrayList<String> pedidos;

    // Construtor: Inicializa a lista vazia
    public GestaoPedidos() {
        this.pedidos = new ArrayList<>();
    }

    // Adiciona um item ao final da lista
    public void adicionarPedido(String item) {
        this.pedidos.add(item);
    }

    // Remove e retorna o item na primeira posição (0) ou "Fila Vazia"
    public String proximoPedido() {
        if (this.pedidos.isEmpty()) {
            return "Fila Vazia";
        }
        return this.pedidos.remove(0);
    }

    // Retorna a quantidade total de pedidos pendentes
    public int quantidadePendentes() {
        return this.pedidos.size();
    }

    // Percorre e imprime todos os pedidos atuais
    public void listarPedidos() {
        if (this.pedidos.isEmpty()) {
            System.out.println("Nenhum pedido pendente.");
        } else {
            System.out.println("--- Pedidos Pendentes ---");
            for (int i = 0; i < this.pedidos.size(); i++) {
                System.out.println((i + 1) + ". " + this.pedidos.get(i));
            }
        }
    }

    // Lógica principal
    public static void main(String[] args) {
        GestaoPedidos gestao = new GestaoPedidos();

        // 1. Adiciona 3 pedidos diferentes
        gestao.adicionarPedido("Hambúrguer Artesanal");
        gestao.adicionarPedido("Pizza Margherita");
        gestao.adicionarPedido("Suco de Laranja");

        System.out.println("Lista inicial de pedidos:");
        gestao.listarPedidos();

        System.out.println();

        // 2. Remova o primeiro pedido
        String atendido = gestao.proximoPedido();
        System.out.println("Pedido removido/atendido: " + atendido);

        System.out.println();

        // 3. Exibe quantos pedidos ainda restam no sistema
        System.out.println("Quantidade de pedidos pendentes: " + gestao.quantidadePendentes());

        System.out.println("\nLista atualizada de pedidos:");
        gestao.listarPedidos();
    }
}