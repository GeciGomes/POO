public class Main{
    public static void main(String[] args){
        ClienteVip d1= new ClienteVip("Davi", 9999999, "DaviRodrigues@gmail.com", "Fatima2", 0.10);
        System.out.println(d1);

        ClienteVip c = new ClienteVip("Ana", 111, "ana@mail.com", "Rua A", 0.10);
        System.out.println(c);

        Cliente v = new Cliente("Ana", 111, "ana@mail.com", "Rua A");
        System.out.println(v);
    }
}