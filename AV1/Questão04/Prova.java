public class Prova {

    // Atributos
    private String nome;
    private String matricula;
    private char[] respostas;

    // Construtor
    public Prova(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.respostas = new char[6];
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Armazena as 6 respostas do aluno
    public void respostaAluno(char[] resposta) {
        if (resposta != null && resposta.length == 6) {
            for (int i = 0; i < 6; i++) {
                this.respostas[i] = resposta[i];
            }
        }
    }

    // Retorna a quantidade de acertos
    public int acertos(char[] gabarito) {
        int contAcertos = 0;
        if (gabarito != null && gabarito.length == 6) {
            for (int i = 0; i < 6; i++) {
                if (this.respostas[i] == gabarito[i]) {
                    contAcertos++;
                }
            }
        }
        return contAcertos;
    }

    // Retorna a nota total (Q1-Q3 = 1pt, Q4-Q6 = 2pts)
    public double nota(char[] gabarito) {
        double notaTotal = 0.0;
        if (gabarito != null && gabarito.length == 6) {
            for (int i = 0; i < 6; i++) {
                if (this.respostas[i] == gabarito[i]) {
                    if (i < 3) {
                        notaTotal += 1.0;
                    } else {
                        notaTotal += 2.0;
                    }
                }
            }
        }
        return notaTotal;
    }

    // DESAFIO: maior
    public double maior(Prova outra, char[] gabarito) {
        int acertosAtual = this.acertos(gabarito);
        int acertosOutra = outra.acertos(gabarito);

        if (acertosAtual > acertosOutra) {
            return this.nota(gabarito);
        } else if (acertosOutra > acertosAtual) {
            return outra.nota(gabarito);
        } else {
            return -1.0; // Empate nos acertos
        }
    }
}