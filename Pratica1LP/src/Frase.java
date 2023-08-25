import java.util.Scanner;
public class Frase {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);

        String frase;

        System.out.println("Digite uma frase: ");
        frase = sacnner.nextLine();

        int contadorVogais = 0;

        for( int i = 0; i < frase.length(); i++){
            char caractere = Character.toLowerCase(frase.charAt(i));

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u')
                contadorVogais++;

        }
        System.out.println("Número de vogais na frase: " + contadorVogais);
    }

}
