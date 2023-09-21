package br.com.banco;

     public class ContaCorrente extends Conta {
         double limite;

         public ContaCorrente(long n, double l) {
             super(n);
             if (l > 0)
                 limite = l;
         }
         public void alterarLimite(double l){
             if (l>0)
                 limite = l;
         }
         public double consultarLimite(){
             return limite;
         }
         public boolean sacar(double v){
             if (v>0 && ((saldo + limite - v ) >= 0) ){
                 saldo = saldo - v;
                 return true;
             }
             else
                 return false;
         }
         public double consultarSaldoTotal(){
             return(saldo + limite);
         }
     } // Fim da classe Conta Corrente.
