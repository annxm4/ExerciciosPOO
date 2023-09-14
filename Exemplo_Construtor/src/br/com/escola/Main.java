package br.com.escola;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        aluno1.setRa("12345678");
        aluno1.setNotaAv1(48);
        aluno1.setNotaAv2(50);
        System.out.printf("Aluno1:" + aluno1.getNome() + "\n" + aluno1.getRa());

        Aluno aluno2 = new Aluno("Anna", "123444");
        System.out.printf("Aluno2:" + aluno2.getNome() + "\n" + aluno2.getRa());

        Aluno aluno3 = new Aluno("Anna", "123444");
        System.out.printf("Aluno3:" + aluno3.getNome() + "\n" + aluno3.getRa() + (aluno3.getNotaAv1() + aluno3.getNotaAv2()));


    }
}