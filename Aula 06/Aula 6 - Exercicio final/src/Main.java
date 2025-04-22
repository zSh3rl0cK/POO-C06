import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        piloto piloto1 = new piloto();
        piloto1.nome = "bowser";
        piloto1.vilao = true;

        piloto piloto2 = new piloto();
        piloto2.nome = "peach";
        piloto2.vilao = false;

        kart kart1 = new kart();
        kart1.nome = "moto";

        kart Kart2 = new kart();
        Kart2.nome = "carro";

        piloto1.Kart = kart1;
        piloto2.Kart = Kart2;
        kart1.motorKart.cilindradas = (random.nextInt(3)+1)*50;
        kart1.motorKart.velocidadeMaxima = random.nextInt(151);
        Kart2.motorKart.cilindradas = (random.nextInt(3)+1)*50;
        Kart2.motorKart.velocidadeMaxima = random.nextInt(151);


        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.fazerDrift();
        kart1.motorKart.mostrarInfo();

        Kart2.soltarTurbo();
        Kart2.motorKart.mostrarInfo();


    }
}
