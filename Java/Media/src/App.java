import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String nomeProf, nomeTurma, nomeAluno = "", nomeDisciplina;
        int qtdAlunos, qtdAvaliacao, qtdNotas = 1;
        Double notas = 0.0, media = 0.0, notaAluno = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("|Informe o nome do Professor: ");
        nomeProf = sc.next();
        System.out.print("|Informe a turma: ");
        nomeTurma = sc.next();
        System.out.print("|Informe a disciplina: ");
        nomeDisciplina = sc.next();
        System.out.print("|Informe a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();
        System.out.print("|Informe a quantidade de avaliações: ");
        qtdAvaliacao = sc.nextInt();
        for (int i = 1; i <= qtdAlunos; i++) {
            System.out.print("|Informe o nome do Aluno: ");
            String novoAluno = sc.next();
            nomeAluno = nomeAluno + " " + novoAluno;
            for (int j = 1; j <= qtdAvaliacao; j++) {
                System.out.print("|Informe a nota do Aluno: ");
                notaAluno = sc.nextDouble();
                notas += notaAluno;
                media = notas / qtdAvaliacao;
            }
        }
        /*  System.out.println("A média do aluno " + novoAluno + "FOI" + media);*/
        System.out.print("|-------Relatorio--------");
        System.out.print("\n|Nome do professor: " + nomeProf);
        System.out.print("\n|Turma: " + nomeTurma);
        System.out.print("\n|Disciplina: " + nomeDisciplina);
        System.out.print("\n|Quantidade de Alunos: " + qtdAlunos);
        System.out.print("\n|Quantidade de Avaliações: " + qtdAvaliacao);
        System.out.print("\n|Nomes: " + nomeAluno);
        System.out.print("\n|Media dos Alunos foi: " + media);
    }
}