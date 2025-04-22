public class Main {
    public static void main(String[] args) {
        zumbi zumbi1 = new zumbi();
        zumbi1.cabelo = false;
        zumbi1.nome = "Gepeto";
        zumbi1.vida = 175;
        zumbi1.dano = 45;

        zumbi zumbi2 = new zumbi();
        zumbi2.cabelo = true;
        zumbi2.nome = "Gaspar";
        zumbi2.vida = 200;
        zumbi2.dano = 90;

        personagem personagem1 = new personagem();
        personagem1.nome = "Joker";
        personagem1.pontos = 200;

        arma arma1 = new arma();
        arma1.nome = "Machete";
        arma1.poder = 60;
        arma1.resistencia = 4;
        arma1.descricao = "Machete remendada. Esta quase sendo destruida. Seja cuidadoso";

        zumbi1.mostraInfo();
        zumbi2.mostraInfo();
        personagem1.mostrarInfoPersonagem();
        arma1.mostrarInfoArma();

        zumbi1.transfereVida(zumbi2, 120);

        personagem1.usarArma(arma1, zumbi2);
        zumbi2.atacar(personagem1);

        arma1.mostrarInfoArma();
    }
}