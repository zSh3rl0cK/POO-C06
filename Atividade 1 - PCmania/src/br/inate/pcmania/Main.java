package br.inate.pcmania;

import br.inate.pcmania.cliente.Cliente;
import br.inate.pcmania.computador.Computador;
import br.inate.pcmania.computador.HardwareBasico;
import br.inate.pcmania.computador.MemoriaUSB;
import br.inate.pcmania.computador.SistemaOperacional;

import java.util.Scanner;

import static br.inate.pcmania.cliente.Cliente.comprar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // --------------- Sistemas operacionais ---------------
        SistemaOperacional[] SO = new SistemaOperacional[5];
        SO[0] = new SistemaOperacional("Linux", 32);
        SO[1] = new SistemaOperacional("Windows 8",64);
        SO[2] = new SistemaOperacional("Windows 10",64);

        // --------------- Primeira Configuração de Hardware ---------------
        HardwareBasico[] H1 = new HardwareBasico[5];
        H1[0] = new HardwareBasico("Pentium Core I3", 2200);
        H1[1] = new HardwareBasico("Memória RAM", 8);
        H1[2] = new HardwareBasico("HD", 500);

        // --------------- Segunda configuração de hardware ---------------
        HardwareBasico[] H2 = new HardwareBasico[5];
        H2[0] = new HardwareBasico("Pentium Core I5", 3370  );
        H2[1] = new HardwareBasico("Memória RAM", 16);
        H2[2] = new HardwareBasico("HD", 1024);

        // --------------- Terceira configuração de hardware ---------------
        HardwareBasico[] H3 = new HardwareBasico[5];
        H3[0] = new HardwareBasico("Pentium Core I7", 4500);
        H3[1] = new HardwareBasico("Memória RAM", 32);
        H3[2] = new HardwareBasico("HD", 2048);

        // --------------- Memórias ---------------
        MemoriaUSB[] ME = new MemoriaUSB[5];
        ME[0] = new MemoriaUSB("Pen Drive", 16);
        ME[1] = new MemoriaUSB("Pen Drive", 32);
        ME[2] = new MemoriaUSB("HD Externo", 1024);

        // Scanner para a entrada dos codigos
        Scanner sc = new Scanner(System.in);
        int codigo = -1;

        // --------------- Inicialização Cliente ---------------
        System.out.println("Digite o seu nome: ");
        String Nome = sc.nextLine();

        System.out.println("Digite o seu CPF: ");
        long CPF = sc.nextLong();

        Cliente cliente = new Cliente(Nome, CPF);

        // --------------- Computadores ---------------
        Computador c1 = new Computador("Apple", 529 , SO[0], H1);
        Computador c2 = new Computador("Samsung", 529+1234, SO[1], H2);
        Computador c3 = new Computador("DELL", 529+5678, SO[2], H3);

        // Definindo a memória de cada computador
        c1.ME = ME[0];
        c2.ME = ME[1];
        c3.ME = ME[2];

        System.out.println("Bem-vindo à PCMania! Não perca nossas promoções.");
        Thread.sleep(2000);

        // --------------- Loop do terminal da loja ---------------
        while(codigo != 0){
            System.out.println("Digite o codigo do que deseja fazer: ");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Fechar a compra" + "\n");
            codigo = sc.nextInt();

            switch(codigo){
                case 1:
                    c1.mostraPCConfigs();
                    Thread.sleep(500);
                    comprar(c1, cliente, sc);
                    break;
                case 2:
                    c2.mostraPCConfigs();
                    Thread.sleep(500);
                    comprar(c2, cliente, sc);
                    break;
                case 3:
                    c3.mostraPCConfigs();
                    Thread.sleep(500);
                    comprar(c3, cliente, sc);
                    break;
                case 0:
                    System.out.println("Fechando sua compra...");
                    Thread.sleep(500);
                    System.out.println("Pronto!");

                    System.out.println("Total da compra: " + cliente.getTotal() + " Reais" + "\n") ;
                    Thread.sleep(500);
                    break;
                default:
                    System.out.println("Codigo Invalido" + "\n");
            }
        }
    }
}