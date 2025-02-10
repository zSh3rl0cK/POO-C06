import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int NPA = entrada.nextInt();

        if(NPA>=60){
            System.out.println("Voce passou");
        }
        else if (NPA<30) {
            System.out.println("Voce reprovou");
        }
        else{
            System.out.println("Voce está de NP3");

            Scanner entrada2 = new Scanner(System.in);
            int NP3 = entrada2.nextInt();

            int NFA = (NPA+NP3)/2;

            if(NFA>=50){
                System.out.println("Aprovado com sucesso");
            }
            else{
                System.out.println("Reprovado com sucesso");
            }

        }
    }
}