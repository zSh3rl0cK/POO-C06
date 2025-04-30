import animais.Boi;
import animais.Cachorro;
import animais.Lontra;

public class Main {
    public static void main(String[] args) {
        Lontra lon = new Lontra("Lontrosa", 2050);
        Boi boi = new Boi("Boiadeiro", 3000);
        Cachorro cachorro = new Cachorro("Dogao", 1000);

        lon.mostrarInfo();
        boi.mostrarInfo();
        cachorro.mostrarInfo();

        lon.emitirSom();
        boi.emitirSom();
        cachorro.emitirSom();

        lon.nadar();
    }
}