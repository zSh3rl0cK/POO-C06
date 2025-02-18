import java.util.Random;

// throws interrupted exception
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        Plebeu plebeu1 = new Plebeu();
        Plebeu plebeu2 = new Plebeu();

        plebeu1.nome = "Sarasvati";
        plebeu1.dinheiro = random.nextDouble() * 300;
        plebeu1.idade = random.nextInt(20) + 20;
        plebeu1.descanso = random.nextInt(22) + 8;
        plebeu1.salario = random.nextDouble() * 5 + 1;

        plebeu2.nome = "Izanagi Picaro";
        plebeu2.dinheiro = random.nextDouble() * 300;
        plebeu2.idade = random.nextInt(20) + 20;
        plebeu2.descanso = random.nextInt(22) + 8;
        plebeu2.salario = random.nextDouble() * 5 + 1;

        while (true) {
            // evento de trabalho
            int trabalho = random.nextInt(16);
            plebeu1.trabalhar(trabalho);

            trabalho = random.nextInt(16);
            plebeu2.trabalhar(trabalho);

            Thread.sleep(5000);

            // evento de descanso
            int descanso = random.nextInt(4) + 4;
            plebeu1.descansar(descanso);

            descanso = random.nextInt(4) + 4;
            plebeu2.descansar(descanso);

            Thread.sleep(5000);


            // evento de pagar imposto
            double imposto = random.nextDouble() * 200;
            plebeu1.pagarImposto(imposto);
            plebeu2.pagarImposto(imposto);

            Thread.sleep(5000);

            // evento de morte de um plebeu
            int randomizer = random.nextInt(2);
            if (randomizer == 0) {
                plebeu1.vivo = false;
                System.out.println(plebeu1.nome + " morreu de hemorroida.");
                break;
            }
            else {
                plebeu2.vivo = false;
                System.out.println(plebeu2.nome + " morreu de escoliose.");
                break;
            }
        }
    }
}
