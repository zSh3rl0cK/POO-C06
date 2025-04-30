public class Main {
    public static void main(String[] args) {
        Arma[] armas = new Arma[10];
        armas[0] = new Arma("canudo",30, 5);
        armas[1] = new Arma("Copo",12, 10);
        armas[2] = new Arma("Lata",20, 15);
        armas[3] = new Arma("Chinelo",20, 15);

        Heroi p1 = new Heroi("Asmodeus", 150);
        Vilao v1 = new Vilao("Senhor Humildade", 300);

        p1.addArma(armas[0]);
        p1.addArma(armas[1]);
        p1.mostrarArmas();

        v1.addArma(armas[2]);
        v1.addArma(armas[3]);
        v1.mostrarArmas();

        p1.atacar(1, v1);
        v1.atacar(0, p1);

        p1.usarEspecial(v1);
        v1.usarEspecial(p1);

        p1.mostrarArmas();
        v1.mostrarArmas();
    }
}