package pessoa;

public class ClienteVip extends Cliente {
    private double percentualDesconto; // 0.10 = 10%

    public ClienteVip(String nome, String cpf, String email, String endereco, double percentualDesconto) {
        super(nome, cpf, email, endereco);
        this.percentualDesconto = percentualDesconto;
    }

    public double getPercentualDesconto() { return percentualDesconto; }
    public void setPercentualDesconto(double p) { this.percentualDesconto = p; }

    @Override
    public String toString() {
        return super.toString() + " | VIP (10%)";
    }
}