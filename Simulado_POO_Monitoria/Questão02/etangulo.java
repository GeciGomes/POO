public class Retangulo {

    // Atributos
    private double largura;
    private double altura;

    // Construtor padrão (inicializa ambos os atributos com 1.0)
    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }

    // Construtor com parâmetros
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método que calcula e retorna a área
    public double calcularArea() {
        return largura * altura;
    }

    // Método que verifica se é um quadrado
    public boolean isQuadrado() {
        return largura == altura;
    }

    // Método main para teste
    public static void main(String[] args) {
        // Instancia um objeto Retangulo 5x5
        Retangulo r = new Retangulo(5.0, 5.0);

        // Verificação se é quadrado
        if (r.isQuadrado()) {
            System.out.println("O retângulo é um quadrado!");
        } else {
            System.out.println("O retângulo não é um quadrado.");
        }

        // Impressão da área
        System.out.println("Área do retângulo: " + r.calcularArea());
    }
}