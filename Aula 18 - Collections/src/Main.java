import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> lista_aleatoria = new ArrayList<>();

        Random aleatorio = new Random();

        for (int i = 0; i < 5; i++) {
            lista_aleatoria.add(aleatorio.nextDouble()*100);
        }

        for (Double aDouble : lista_aleatoria) {
            System.out.println("Valor: " + aDouble);
        }

        System.out.println("Ordenando");
        Collections.sort(lista_aleatoria);
        Collections.reverse(lista_aleatoria);

        for (Double aDouble : lista_aleatoria) {
            System.out.println("Valor: " + aDouble);
        }

    }
}