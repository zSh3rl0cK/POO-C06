import java.util.Random;

public class kart {
    String nome;
    Random random = new Random();

    motor motorKart;

    public kart(){
        motorKart = new motor();
    }
    public void pular(){
        System.out.println("O piloto saltou"  + "\n");
    }

    public void soltarTurbo(){
        System.out.println("O piloto no Kart " + nome + " gastou todo o seu turbo"  + "\n");
    }

    public void fazerDrift(){
        System.out.println("O piloto no kart " + nome + " fez um incrível drift"  + "\n");
    }
}
