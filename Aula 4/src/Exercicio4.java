import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de alunos(as): ");

        int num = entrada.nextInt();

        switch (num) {
            case 10, 20:
                System.out.println("Sala I-16");
            break;

            case 30:
                System.out.println("Sala I-22");
            break;

            default:
                System.out.println("Inválido");
        }
        entrada.close();
    }
}