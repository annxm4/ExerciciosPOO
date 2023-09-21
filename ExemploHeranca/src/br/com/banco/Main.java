package br.com.banco;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(1247,1000);
        c1.depositar(50);
        c1.sacar(500);
        System.out.println("Saldo: " + c1.consultarSaldo());
        System.out.println("Saldo + limite: " + c1.consultarSaldoTotal());

    }
}