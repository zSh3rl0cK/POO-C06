import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Plebeu plebeu1 = new Plebeu();
        Plebeu plebeu2 = new Plebeu();

        plebeu1.nome = "San Marino";    // nome do plebeu
        plebeu1.dinheiro = 120;         // dinheiro que o plebeu ja tem
        plebeu1.idade = 44;             // idade do plebeu
        plebeu1.descanso = 23;          // horas que o plebeu precisa descansar
        plebeu1.salario = 4.75;           // salario por ciclo do plebeu

        plebeu2.nome = "Isaias";        // nome do outro plebeu
        plebeu2.dinheiro = 600;         // dinheiro que ele tem
        plebeu2.idade = 22;             // idade do plebeu
        plebeu2.descanso = 7;           // horas que precisa descansar
        plebeu2.salario = 5.25;          // salario por ciclo do plebeu

        // ciclo da vida (1 ou eterno?)
        while(true){
            // necessario randomizar o tempo nos eventos e um temporizador para as coisas demorarem segundos p/ acontecer
            // corrigir coisas como descanso negativo etc

            // evento de trabalho
            plebeu1.trabalhar(12);
            plebeu2.trabalhar(8);

            // dinheiro após o trabalho
            System.out.println(plebeu1.nome + " trabalhou por longas horas e recebeu " + plebeu1.dinheiro + "\n");
            System.out.println(plebeu2.nome + " trabalhou por algumas horas e recebeu " + plebeu2.dinheiro + "\n");

            // evento de descanso pós trabalho
            plebeu1.descansar(5);
            plebeu2.descansar(3);

            System.out.println(plebeu1.nome + " cansado do trbalho, descansou por algumas horas, queria descansar " + plebeu1.descanso + "\n");
            System.out.println(plebeu2.nome + " cansado do trbalho, descansou por algumas horas, queria descansar " + plebeu2.descanso + "\n");

            // evento em que plebeu X morre
            int ramdomizer = new Random().nextInt(2);

            if(ramdomizer == 0){
                plebeu1.vivo = false;
                System.out.println(plebeu1.nome + " morreu de: hemorroida " + "\n");

                break;
            }

            else{
                plebeu2.vivo = false;
                System.out.println(plebeu2.nome + " morreu de: escoliose " + "\n");
                break;
            }
        }
    }
}