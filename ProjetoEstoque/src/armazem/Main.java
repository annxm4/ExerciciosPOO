package armazem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int id, estoque;
        String produto;
        double preco;
        System.out.println("ID: ");
        id = ler.nextInt();

        System.out.println("Nome do produto: ");
        produto = ler.nextLine();
        produto = ler.nextLine();

        System.out.println("Estoque inicial: ");
        estoque = ler.nextInt();

        System.out.println("Preço: ");
        preco = ler.nextDouble();

        estoque e1 = new estoque(id, produto, estoque, preco);

        System.out.println("Digite a quantidade para acrescentar: ");
        int qtde = ler.nextInt();
        e1.acrescimoEstoque(qtde);

        System.out.println("Digite a quantidade para baixar: ");
        qtde = ler.nextInt();
        e1.acrescimoEstoque(qtde);

        System.out.println(e1.consultaEstoque());



        /* estoque e1 = new estoque(1,"Arroz",10, 25);
        estoque e2 = new estoque(2,"Feijão",10, 5.65);
        estoque e3 = new estoque(3,"Batata",10, 16);

        e1.acrescimoEstoque(100);
        System.out.println(e1.consultaEstoque());

        e2.baixaEstoque(7);
        System.out.println(e2.consultaEstoque());

        e3.totalEstoque();
        System.out.println(e3.consultaEstoque());
        System.out.println(e3.totalEstoque()); */
    }
}