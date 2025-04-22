public class Main {
    public static void main(String[] args) {
        Arma espada = new Arma(80, 9);
        Arma pistola = new Arma(90, 6);
        Arma lanca = new Arma(120, 12);
        Arma machado = new Arma(70, 8);

        jogador J1 = new jogador("Makoto Yuki", espada, 200, 20);
        jogador J2 = new jogador("Ren Amamiya", pistola, 200, 20);
        jogador J3 = new jogador("Yu Narukami", lanca, 200, 20 );
        jogador J4 = new jogador("Igor", machado, 200, 20);

        J1.info();
        J2.info();
        J3.info();
        J4.info();

        J1.atacar(J2);
        J1.atacar(J3);
        J1.atacar(J4);

        J2.atacar(J1);
        J2.atacar(J3);
        J2.atacar(J4);

        J3.atacar(J1);
        J3.atacar(J2);
        J3.atacar(J4);

        J1.info();
        J2.info();
        J3.info();
        J4.info();
    }
}