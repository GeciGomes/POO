public class MainLivro {

    public static void main(String[] args) {
        // 1. Instancia um objeto Autor
        Autor autor1 = new Autor("Machado de Assis", "Brasileira");

        // 2. Instancia um objeto Livro passando o autor criado
        Livro livro1 = new Livro("Dom Casmurro", 39.90, autor1);

        // 3. Chama o método para exibir os detalhes
        livro1.exibirDetalhes();
    }
}