package pagamento;

import excecao.PagamentoRecusadoException;

public class PagamentoCartao implements Pagamento {
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite) {
        this.parcelas = parcelas;
        this.limite = limite;
    }

    @Override
    public double calcularValorFinal(double valor) {
        double total = valor;
        if (parcelas > 3) {
            total += valor * 0.08;
        }
        if (total > limite) {
            throw new PagamentoRecusadoException("Limite excedido: R$ " + total + " > R$ " + limite);
        }
        return total;
    }

    @Override
    public String getDescricao() { return "Cartão em " + parcelas + "x"; }

    public int getParcelas() { return parcelas; }
    public double getLimite() { return limite; }
}
