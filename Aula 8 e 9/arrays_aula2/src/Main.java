import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bomba campo [][] = new Bomba [2][2];

        Random rand = new Random();
        int linhaB = rand.nextInt(2);
        int colunaB = rand.nextInt(2);

        Bomba b1 = new Bomba();
        b1.ativa = 1;

        campo[colunaB][linhaB] = b1;

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                Bomba b2 = new Bomba();
                b2.ativa = 0;

                if(campo[i][j] == null) {
                    campo[i][j] = b2;
                }
            }
        }

        int tentativa = 0;

        while(true) {
            System.out.println("Insira as coordenadas do ponto que você quer visitar: " + "\n");
            Scanner entrada = new Scanner(System.in);
            int coluna = entrada.nextInt();
            int linha = entrada.nextInt();

            if(tentativa == campo.length){
                System.out.println("ganhou");
                break;
            }
            else {
                if (campo[linha][coluna].visitada != 1) {
                    if(campo[linha][coluna].ativa == 0){
                        System.out.println("você esta vivo!");
                        campo[linha][coluna].visitada = 1;
                        tentativa++;
                    }
                    else{
                        System.out.println("A bomba explodiu! e você perdeu a cabeca");
                        break;
                    }
                } else {
                    System.out.println("Visitada com sucesso!");
                }
            }
        }
    }
}