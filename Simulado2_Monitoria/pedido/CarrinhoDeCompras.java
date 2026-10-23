package pedido;

import excecao.EstoqueInsuficienteException;
import produto.Entregavel;
import produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens = new ArrayList<>();

    public void adicionar(Produto p) {
        itens.add(p);
    }

    public void adicionar(Produto p, int quantidade) throws EstoqueInsuficienteException {
        // Confiro o estoque antes de colocar os itens no carrinho.
        if (quantidade > p.getEstoque()) {
            throw new EstoqueInsuficienteException(p.getNome(), p.getEstoque());
        }
        for (int i = 0; i < quantidade; i++) {
            itens.add(p);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : itens) {
            // Cada tipo de produto calcula o próprio preço final.
            total += p.calcularPrecoFinal();
        }
        return total;
    }

    public double calcularFreteTotal(String cep) {
        double frete = 0;
        for (Produto p : itens) {
            // Só os produtos que podem ser entregues têm frete.
            if (p instanceof Entregavel) {
                frete += ((Entregavel) p).calcularFrete(cep);
            }
        }
        return frete;
    }

    public List<Produto> getItens() { return itens; }
}
