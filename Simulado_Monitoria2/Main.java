import excecao.EstoqueInsuficienteException;
import pagamento.PagamentoCartao;
import pagamento.PagamentoPix;
import pedido.CarrinhoDeCompras;
import pedido.Pedido;
import pessoa.ClienteVip;
import produto.Assinatura;
import produto.ProdutoDigital;
import produto.ProdutoFisico;

public class Main {
    public static void main(String[] args) {
        ClienteVip cliente = new ClienteVip("Ana", "111", "ana@mail.com", "Rua A", 0.10);
        System.out.println(cliente);

        ProdutoFisico teclado = new ProdutoFisico("F01", "Teclado", 100.0, 3, 0.8);
        ProdutoDigital ebook = new ProdutoDigital("D01", "E-book Java", 50.0, 999, 12);
        Assinatura stream = new Assinatura("S01", "Streaming", 20.0, 999, 6);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionar(ebook);
        carrinho.adicionar(stream);
        try {
            carrinho.adicionar(teclado, 1);
            // Coloquei uma quantidade maior que o estoque para testar a exceção.
            carrinho.adicionar(teclado, 10);
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        Pedido pedido = new Pedido(cliente, carrinho, "60000-000");

        System.out.println("--- Tentativa 1: Pix ---");
        pedido.finalizar(new PagamentoPix());

        System.out.println("--- Tentativa 2: Cartão 6x, limite baixo ---");
        pedido.finalizar(new PagamentoCartao(6, 100.0));

        // Os pontos só são somados quando o pagamento é aprovado.
        System.out.println("Pontos: " + cliente.getPontosFidelidade());
    }
}
