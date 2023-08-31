package notas;
    public class aluno {
        private String nome;
        private String matricula;
        private double notaAV1;
        private double notaAV2;
        private double notaAE;
        private String curso;
        private String periodo;

        public aluno(String nome, String matricula, double notaAV1, double notaAV2, String curso, String periodo) {
            this.nome = nome;
            this.matricula = matricula;
            this.notaAV1 = notaAV1;
            this.notaAV2 = notaAV2;
            this.notaAE = 0;
            this.curso = curso;
            this.periodo = periodo;
        }


        public double getNotaAV1() {
            return notaAV1;
        }

        public double getNotaAV2() {
            return notaAV2;
        }

        public double getNotaAE() {
            return notaAE;
        }


        public void alteraNotaAV1(double novaNota) {
            notaAV1 = novaNota;
        }

        public void alteraNotaAV2(double novaNota) {
            notaAV2 = novaNota;
        }

        public void alteraNotaAE(double novaNota) {
            notaAE = novaNota;
        }

        public void avaliarAluno() {
            double totalNotas = notaAV1 + notaAV2;
            if (totalNotas >= 60) {
                System.out.println(nome + " foi Aprovado.");
            } else {
                System.out.println(nome + " está em Recuperação.");
            }
        }

        public void avaliarRecuperacao(double notaAE) {
            double totalNotas = notaAV1 + notaAV2 + notaAE;
            if (totalNotas >= 60) {
                System.out.println(nome + " foi Aprovado na Recuperação.");
            } else {
                System.out.println(nome + " foi Reprovado na Recuperação.");
            }
        }

        public String getNome() {
            return nome;
        }

        public String getMatricula() {
            return matricula;
        }
    }
