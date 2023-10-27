import java.util.ArrayList;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa p1;
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1>Cadastrar\n<2>Vizualizar\n<3>Excluir\n<4>Saída"));
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
                    String cpf = JOptionPane.showInputDialog("Digite o CPF: ");
                    p1 = new Pessoa(nome, idade, cpf);
                    pessoas.add(p1);
                    break;

                case 2:
                    int i = 0;
                    for (Pessoa contato : pessoas) {
                        JOptionPane.showMessageDialog(null, i + " " + contato.getNome() + contato.getCpf() + " " + contato.getIdade(), "Pessoas", JOptionPane.DEFAULT_OPTION);
                        i++;
                    }
                    break;

                case 3:
                    String buscar = JOptionPane.showInputDialog("Nome para excluir: ");
                    int j;
                    for (j = 0; j < pessoas.size(); j++) {

                        if (pessoas.get(j).getNome().equals(buscar)) {

                            pessoas.remove(j);
                            JOptionPane.showMessageDialog(null, "Removido com sucesso", "Pessoas", JOptionPane.DEFAULT_OPTION);
                        }
                    }
                    break;

                case 4:
                    break;
            }


         } while(opcao!= 4);
    }

}
