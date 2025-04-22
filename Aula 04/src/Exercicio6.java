import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Advinhe o numero (entre 1 e 10): ");

        int x = gerador.nextInt(10) + 1;
        int numero = entrada.nextInt();

        while(numero != x){
            if(numero < x){
                System.out.println("Errou! Tente um numero maior");
            }
            else if(numero > x){
                System.out.println("Errou! Tente um numero menor");
            }
            numero = entrada.nextInt();
        }
        System.out.println("Acertou agora!");
    }
}