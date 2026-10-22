public class Livro {

    private String titulo;
    private double preco;
    private Autor autor; // Atributo do tipo Autor (Composição)

    // Construtor que recebe título, preço e um objeto Autor
    public Livro(String titulo, double preco, Autor autor) {
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Método para exibir detalhes do livro
    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Livro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor.getNome());
        System.out.printf("Preço: R$ %.2f\n", preco);
    }
}