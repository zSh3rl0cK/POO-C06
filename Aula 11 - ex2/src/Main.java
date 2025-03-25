import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.jogador.Jogador;

import static br.inatel.cdg.bloco.Bloco.getDestruidos;
import static br.inatel.cdg.bloco.Bloco.getNumBlocos;
import static br.inatel.cdg.jogador.Jogador.conversor;

public class Main {
    public static void main(String[] args) {
            Jogador player1 = new Jogador("Makoto Yuki");
            Jogador player2 = new Jogador("Amamiya Ren");

            Bloco bloco1 = new Bloco("Forte");
            Bloco bloco2 = new Bloco("Fraco");
            Bloco bloco3 = new Bloco("Forte");
            Bloco bloco4 = new Bloco("Fraco");

            bloco1.destruirBloco(player1);
            bloco2.destruirBloco(player2);
            bloco3.destruirBloco(player2);
            bloco4.destruirBloco(player1);

            System.out.println("Blocos totais: " + getNumBlocos());
            System.out.println("Blocos destruidos: "+ getDestruidos());

            conversor(player1);
            conversor(player2);

            System.out.println("Moedas player1: " + player1.getMoedas());
            System.out.println("Moedas player2: " + player2.getMoedas());
    }
}