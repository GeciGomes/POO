
package pedido;

import excecao.PagamentoRecusadoException;
import pagamento.Pagamento;
import pessoa.Cliente;
import pessoa.ClienteVip;

public class Pedido {
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;
    private String cep;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho, String cep) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.cep = cep;
    }

    public void finalizar(Pagamento pagamento) {
        try {
            double subtotal = carrinho.calcularTotal() + carrinho.calcularFreteTotal(cep);

            if (cliente instanceof ClienteVip) {
                // O desconto do cliente VIP é aplicado sobre o total com frete.
                double desc = ((ClienteVip) cliente).getPercentualDesconto();
                subtotal -= subtotal * desc;
            }

            double valorFinal = pagamento.calcularValorFinal(subtotal);
            pagamento.exibirComprovante(subtotal);

            // Como chegou até aqui, o pagamento foi aprovado.
            cliente.adicionarPontos((int) (valorFinal / 10));
        } catch (PagamentoRecusadoException e) {
            System.out.println("Pagamento recusado");
        } finally {
            System.out.println("Pedido encerrado");
        }
    }
}