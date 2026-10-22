public class Pessoa{
    private String nome;
    private int cpf;
    private String email;

    public Pessoa(String nome, int cpf, String email){
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
    }

    public String toString(){
        return "Nome:" + nome + "\n CPF:" + cpf;
    }
}