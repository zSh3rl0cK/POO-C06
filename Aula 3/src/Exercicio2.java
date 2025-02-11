import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço dos 3 lanches:");
        int lanche1 = entrada.nextInt();
        int lanche2 = entrada.nextInt();
        int lanche3 = entrada.nextInt();

        System.out.println("A soma total dos lanches é: " + (lanche1 + lanche2 + lanche3));
        System.out.println("A media dos lanches é: " + (lanche1 + lanche2 + lanche3)/3.0);
    }
}
