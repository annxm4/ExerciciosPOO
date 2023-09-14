package br.com.escola;

public class Aluno {

    private String nome;
    private String ra;
    private float notaAv1;
    private float notaAv2;

    public Aluno(String nome, String ra, float notaAv1, float notaAv2) {
        this.nome = nome;
        this.ra = ra;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public Aluno() {
    }

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public float getNotaAv1() {
        return notaAv1;
    }

    public float getNotaAv2() {
        return notaAv2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNotaAv1(float notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(float notaAv2) {
        this.notaAv2 = notaAv2;
    }
}
