public class ClienteVip extends Cliente{
    private double percentualDesconto;

    public ClienteVip(String nome, int cpf, String email, String endereco, double percentualDesconto){
        super(nome, cpf, email, endereco);
        this.percentualDesconto=percentualDesconto;

    }

    @Override 
    public String toString(){
        return super.toString()+ "\n Vip(10%)";
    }
}