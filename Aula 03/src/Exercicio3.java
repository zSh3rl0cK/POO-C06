import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua NPA: ");
        int NPA = entrada.nextInt();

        if(NPA < 30){
            System.out.println("Repprovado com sucesso");
        }
        else if(NPA < 60){
            System.out.println("Aluno de NP3. Insira a nota da np3:");
            int nota = entrada.nextInt();

            double media = (NPA + nota) / 2.0;

            if(media > 50){
                System.out.println("Aprovado com sucesso");
            }
            else{
                System.out.println("Reprovado com sucesso");
            }
        }
        else{
            System.out.println("Aprovado com sucesso");
        }
    }
}
