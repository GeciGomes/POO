public class TesteProva {

    public static void main(String[] args) {
        // Gabarito oficial da prova
        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'A'};

        // Criando e preenchendo Aluno 1
        Prova aluno1 = new Prova("João Silva", "2023001");
        char[] respostasAluno1 = {'A', 'B', 'C', 'D', 'A', 'E'};
        aluno1.respostaAluno(respostasAluno1);

        // Criando e preenchendo Aluno 2
        Prova aluno2 = new Prova("Maria Souza", "2023002");
        char[] respostasAluno2 = {'A', 'B', 'E', 'D', 'E', 'A'};
        aluno2.respostaAluno(respostasAluno2);

        // Exibindo resultados do Aluno 1
        System.out.println("=== ALUNO 1 ===");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Acertos: " + aluno1.acertos(gabarito));
        System.out.println("Nota: " + aluno1.nota(gabarito));

        System.out.println();

        // Exibindo resultados do Aluno 2
        System.out.println("=== ALUNO 2 ===");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Acertos: " + aluno2.acertos(gabarito));
        System.out.println("Nota: " + aluno2.nota(gabarito));

        System.out.println();

        // Testando o DESAFIO
        System.out.println("=== RESULTADO DO DESAFIO ===");
        double maiorNota = aluno1.maior(aluno2, gabarito);
        if (maiorNota == -1.0) {
            System.out.println("Houve empate na quantidade de acertos!");
        } else {
            System.out.println("A nota do aluno com maior número de acertos é: " + maiorNota);
        }
    }
}