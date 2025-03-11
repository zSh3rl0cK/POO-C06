import java.util.Random;

// throws interrupted exception
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        Plebeu plebeu1 = new Plebeu("Sarasvati", random.nextInt(20) + 20, random.nextInt(22) + 8, true, random.nextDouble() * 300, random.nextDouble() * 5 + 1);
        Plebeu plebeu2 = new Plebeu("Izanagi Picaro", random.nextInt(20) + 20, random.nextInt(22) + 8, true, random.nextDouble() * 300, random.nextDouble() * 5 + 1);
        Plebeu plebeu3 = new Plebeu("Arsene", random.nextInt(30) + 18, random.nextInt(20) + 6, true, random.nextDouble() * 500, random.nextDouble() * 7 + 2);
        Plebeu plebeu4 = new Plebeu("Thanatos", random.nextInt(25) + 22, random.nextInt(18) + 5, true, random.nextDouble() * 400, random.nextDouble() * 6 + 3);
        Plebeu plebeu5 = new Plebeu("Orpheus Telos", random.nextInt(28) + 20, random.nextInt(16) + 7, true, random.nextDouble() * 350, random.nextDouble() * 4 + 2);
        Plebeu plebeu6 = new Plebeu("Raoul", random.nextInt(35) + 18, random.nextInt(22) + 6, true, random.nextDouble() * 600, random.nextDouble() * 8 + 1.5);
        Plebeu plebeu7 = new Plebeu("Messiah Picaro", random.nextInt(27) + 19, random.nextInt(19) + 7, true, random.nextDouble() * 450, random.nextDouble() * 5 + 2.5);
        Plebeu plebeu8 = new Plebeu("Satanael", random.nextInt(40) + 18, random.nextInt(24) + 5, true, random.nextDouble() * 700, random.nextDouble() * 9 + 3);

        Nobre nobre1 = new Nobre("Makoto Yuki", random.nextInt(30) + 25, random.nextInt(6) + 12, true, random.nextDouble() * 5000 + 1000, random.nextDouble() * 50 + 20);
        Nobre nobre2 = new Nobre("Yu Narukami", random.nextInt(28) + 27, random.nextInt(5) + 14, true, random.nextDouble() * 7000 + 2000, random.nextDouble() * 60 + 25);
        Nobre nobre3 = new Nobre("Ren Amamiya", random.nextInt(32) + 26, random.nextInt(7) + 13, true, random.nextDouble() * 6000 + 1500, random.nextDouble() * 55 + 22);
        Nobre nobre4 = new Nobre("Chie", random.nextInt(35) + 25, random.nextInt(6) + 15, true, random.nextDouble() * 8000 + 3000, random.nextDouble() * 70 + 30);
        Nobre nobre5 = new Nobre("Yukari Takeba", random.nextInt(33) + 24, random.nextInt(5) + 14, true, random.nextDouble() * 5500 + 1200, random.nextDouble() * 52 + 21);
        Nobre nobre6 = new Nobre("Futaba Sakura", random.nextInt(40) + 25, random.nextInt(7) + 16, true, random.nextDouble() * 7500 + 2500, random.nextDouble() * 65 + 28);

        Rei rei = new Rei("Igor, o Soberano", random.nextInt(50) + 40, random.nextInt(4) + 16, true, random.nextDouble() * 20000 + 10000, random.nextDouble() * 100 + 50);

        while (true) {
            // evento de trabalho
            int trabalho = random.nextInt(16);
            plebeu1.trabalhar(trabalho);
            Thread.sleep(3000);

            plebeu2.trabalhar(trabalho);
            Thread.sleep(3000);

            plebeu3.trabalhar(random.nextInt(18));
            Thread.sleep(3000);

            plebeu4.trabalhar(random.nextInt(14));
            Thread.sleep(3000);

            plebeu5.trabalhar(random.nextInt(20));
            Thread.sleep(3000);

            plebeu6.trabalhar(random.nextInt(17));
            Thread.sleep(3000);

            plebeu7.trabalhar(random.nextInt(15));
            Thread.sleep(3000);

            plebeu8.trabalhar(random.nextInt(19));

            Thread.sleep(5000);

            // evento de descanso
            int descanso = random.nextInt(4) + 4;
            plebeu1.descansar(descanso);
            Thread.sleep(3000);

            plebeu2.descansar(descanso);
            Thread.sleep(3000);

            plebeu3.descansar(random.nextInt(5) + 3);
            Thread.sleep(3000);

            plebeu4.descansar(random.nextInt(6) + 4);
            Thread.sleep(3000);

            plebeu5.descansar(random.nextInt(4) + 5);
            Thread.sleep(3000);

            plebeu6.descansar(random.nextInt(5) + 3);
            Thread.sleep(3000);

            plebeu7.descansar(random.nextInt(6) + 2);
            Thread.sleep(3000);

            plebeu8.descansar(random.nextInt(4) + 5);

            Thread.sleep(5000);

            // evento de pagar imposto
            double imposto = random.nextDouble() * 200;
            plebeu1.pagarImposto(imposto);
            Thread.sleep(3000);

            plebeu2.pagarImposto(imposto);
            Thread.sleep(3000);

            plebeu3.pagarImposto(random.nextDouble() * 250);
            Thread.sleep(3000);

            plebeu4.pagarImposto(random.nextDouble() * 180);
            Thread.sleep(3000);

            plebeu5.pagarImposto(random.nextDouble() * 220);
            Thread.sleep(3000);

            plebeu6.pagarImposto(random.nextDouble() * 210);
            Thread.sleep(3000);

            plebeu7.pagarImposto(random.nextDouble() * 190);
            Thread.sleep(3000);

            plebeu8.pagarImposto(random.nextDouble() * 230);

            Thread.sleep(5000);

            // Evento de ordem do rei
            int ordem = random.nextInt(8) + 1;
            rei.Ordem(ordem);

            Thread.sleep(5000);

            // evento de morte de um plebeu
            int randomizer = random.nextInt(8);
            switch (randomizer) {
                case 0:
                    plebeu1.vivo = false;
                    System.out.println(plebeu1.nome + " morreu de hemorroida.");
                    break;
                case 1:
                    plebeu2.vivo = false;
                    System.out.println(plebeu2.nome + " morreu de escoliose.");
                    break;
                case 2:
                    plebeu3.vivo = false;
                    System.out.println(plebeu3.nome + " morreu de desidratação.");
                    break;
                case 3:
                    plebeu4.vivo = false;
                    System.out.println(plebeu4.nome + " morreu intoxicado por comida estragada.");
                    break;
                case 4:
                    plebeu5.vivo = false;
                    System.out.println(plebeu5.nome + " morreu ao cair em um poço.");
                    break;
                case 5:
                    plebeu6.vivo = false;
                    System.out.println(plebeu6.nome + " morreu após um duelo contra um nobre.");
                    break;
                case 6:
                    plebeu7.vivo = false;
                    System.out.println(plebeu7.nome + " morreu soterrado após um desabamento.");
                    break;
                case 7:
                    plebeu8.vivo = false;
                    System.out.println(plebeu8.nome + " morreu de infecção generalizada.");
                    break;
            }
            break; // Finaliza o loop ao matar um plebeu
        }

    }
}