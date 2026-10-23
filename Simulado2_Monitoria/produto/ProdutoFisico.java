package produto;

public class ProdutoFisico extends Produto implements Entregavel {
    private double pesoKg;

    public ProdutoFisico(String codigo, String nome, double precoBase, int estoque, double pesoKg) {
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + getPrecoBase() * 0.10;
    }

    @Override
    public double calcularFrete(String cep) {
        return 15.0 + 2.0 * pesoKg;
    }

    @Override
    public int prazoEntregaDias() {
        return 12; // sem CEP no contrato do método; veja a observação abaixo
    }

    public double getPesoKg() { return pesoKg; }
}