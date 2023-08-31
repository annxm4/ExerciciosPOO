package emprego;

public class faculdade {

        private String nome;
        private double salario;
        private int horasAula;


        double getGastos(){

            return this.salario + (this.horasAula * 40);

        }

        public String getInfo(){
            return "Nome: " + this.nome + " com salário " + getGastos();
        }


        public static void main(String[] args) {

            faculdade professor = new faculdade();

            professor.nome = "Anna";
            professor.salario = 2000;
            professor.horasAula = 6;

            System.out.println("Gastos: " + professor.getInfo());
            System.out.println("Informações: " + professor.getGastos());

        }
    }

