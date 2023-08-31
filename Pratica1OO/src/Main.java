import notas.aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a nota da AV1: ");
        double notaAV1 = scanner.nextDouble();

        System.out.print("Digite a nota da AV2: ");
        double notaAV2 = scanner.nextDouble();

        System.out.print("Digite o curso do aluno: ");
        scanner.nextLine(); // Consumir a nova linha pendente
        String curso = scanner.nextLine();

        System.out.print("Digite o período do aluno: ");
        String periodo = scanner.nextLine();

        aluno aluno = new aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);

        aluno.avaliarAluno();

        if (aluno.getNotaAV1() + aluno.getNotaAV2() < 60) {
            System.out.print("Digite a nota da AE: ");
            double notaAE = scanner.nextDouble();
            aluno.alteraNotaAE(notaAE);
            aluno.avaliarRecuperacao(notaAE);
        }
    }
}