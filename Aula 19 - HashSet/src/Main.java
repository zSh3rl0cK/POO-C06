import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tempo para inserir: " + "\n");

        // Desempenho ArrayList
        ArrayList<Integer> AL = new ArrayList<>();

        long TempoAL = System.currentTimeMillis(); // tempo inicial
        for(int i = 0; i < 100000; i++){
            AL.add(i);
        }
        TempoAL = System.currentTimeMillis() - TempoAL; // tempo final - inicial

        System.out.println("Tempo ArrayList " + TempoAL + " milisegundos");

        // Desempenho HashSet

        HashSet<Integer> hashSet = new HashSet<>();

        long TempoB = System.currentTimeMillis(); // tempo inicial
        for(int i = 0; i < 100000; i++){
            hashSet.add(i);
        }
        TempoB = System.currentTimeMillis() - TempoB; // tempo final - inicial

        System.out.println("Tempo HashSet " + TempoB + " milisegundos");

        // Desempenho HashMap
        Map<Integer, Integer> hashmap = new HashMap<>();
        long TempoC = System.currentTimeMillis(); // tempo inicial

        for(int i = 0; i < 100000; i++){
            hashmap.put(i, i);
        }
        TempoC = System.currentTimeMillis() - TempoC; // tempo final - inicial

        System.out.println("Tempo HashMap " + TempoC+ " milisegundos"  + "\n");

        // Dsempenho para a busca

        System.out.println("Tempo para busca: ");

        long TempoBuscaA = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            AL.contains(i);
        }
        TempoBuscaA = System.currentTimeMillis() - TempoBuscaA;
        System.out.println("Tempo ArrayList " + TempoBuscaA + " milisegundos");

        long TempoBuscaB = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            hashSet.contains(i);
        }
        TempoBuscaB = System.currentTimeMillis() - TempoBuscaB;
        System.out.println("Tempo HashSet " + TempoBuscaB + " milisegundos");

        long TempoBuscaC = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            hashmap.containsKey(i);
        }
            TempoBuscaC = System.currentTimeMillis() - TempoBuscaC;
        System.out.println("Tempo HashMap " + TempoBuscaC + " milisegundos");
    }
}