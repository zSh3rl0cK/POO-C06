import br.inatel.cdg.Inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave("Boeing 747", 1000,"Humanos vivos");
        Nave nave2 = new Nave("StarDestroyer", 750, "Raio Laser");

        Asteroide ast1 = new Asteroide("Metatron", "Antropofobico");
        Asteroide ast2 = new Asteroide("Pairulito", "Doce");

        nave1.atirar(ast1);
        nave2.atirar(ast2);

    }
}