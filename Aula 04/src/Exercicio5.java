import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int x = gerador.nextInt(10)+1;

        System.out.println("Advinhe o numero (entre 1 e 10)");
        int y = entrada.nextInt();

        while (x != y){
            System.out.println("Numero errado, tente novamente");
            y = entrada.nextInt();
        }

        System.out.println("Numero certo");

        entrada.close();
    }
}