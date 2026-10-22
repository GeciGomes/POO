public class Cliente extends Pessoa{
    private String endereco;
    private int pontosFidelidade;

    public Cliente(String nome, int cpf, String email, String endereco){
        super(nome, cpf, email);
        this.endereco=endereco;
        this.pontosFidelidade=0;
    }

    public void adicionarPontos(int pontos){
        this.pontosFidelidade+=pontos;
    }
}
