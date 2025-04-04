package br.inate.pcmania;

import br.inate.pcmania.cliente.Cliente;
import br.inate.pcmania.computador.Computador;
import br.inate.pcmania.computador.HardwareBasico;
import br.inate.pcmania.computador.MemoriaUSB;
import br.inate.pcmania.computador.SistemaOperacional;

import java.util.Scanner;

import static br.inate.pcmania.cliente.Cliente.comprar;
import static br.inate.pcmania.cliente.Cliente.remover;

// Atividade PCmania Pedro Henrique Ribeiro Dias - 529 - GES

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // --------------- Sistemas operacionais ---------------
        SistemaOperacional[] SO = new SistemaOperacional[5];
        SO[0] = new SistemaOperacional("Linux", 32);
        SO[1] = new SistemaOperacional("Windows 8",64);
        SO[2] = new SistemaOperacional("Windows 10",64);

        // --------------- Configurações de Hardware ---------------
        HardwareBasico[][] hardwares = new HardwareBasico[3][];
        hardwares[0] = new HardwareBasico[]{new HardwareBasico("Pentium Core I3", 2200), new HardwareBasico("Memória RAM", 8), new HardwareBasico("HD", 500)};
        hardwares[1] = new HardwareBasico[]{new HardwareBasico("Pentium Core I5", 3370), new HardwareBasico("Memória RAM", 16), new HardwareBasico("HD", 1024)};
        hardwares[2] = new HardwareBasico[]{new HardwareBasico("Pentium Core I7", 4500), new HardwareBasico("Memória RAM", 32), new HardwareBasico("HD", 2048)};

        // --------------- Memórias ---------------
        MemoriaUSB[] ME = new MemoriaUSB[5];
        ME[0] = new MemoriaUSB("Pen Drive", 16);
        ME[1] = new MemoriaUSB("Pen Drive", 32);
        ME[2] = new MemoriaUSB("HD Externo", 1024);

        // Scanner para a entrada dos códigos
        Scanner sc = new Scanner(System.in);
        int codigo = -1; // inicializando a variável código fora do loop

        // --------------- Inicialização Cliente ---------------
        System.out.println("\n===== PCMANIA =====");
        System.out.println("Bem-vindo à PCMania! Não perca nossas promoções.");
        Thread.sleep(1000);
        System.out.println("Para continuar, faça seu cadastro!" + "\n");

        System.out.println("Digite o seu nome: ");
        String Nome = sc.nextLine();

        System.out.println("Digite o seu CPF: ");
        long CPF = sc.nextLong();

        Cliente cliente = new Cliente(Nome, CPF);

        // --------------- Computadores ---------------
        Computador[] comps = new Computador[10];
        comps[0] = new Computador("Apple", 529, SO[0], hardwares[0]);
        comps[1] = new Computador("Samsung", 529 + 1234, SO[1], hardwares[1]);
        comps[2] = new Computador("DELL", 529 + 5678, SO[2], hardwares[2]);

        // Definindo a memória de cada computador
        comps[0].addMemoria(ME[0]);
        comps[1].addMemoria(ME[1]);
        comps[2].addMemoria(ME[2]);

        // --------------- Loop do terminal da loja ---------------
        while (codigo != 0) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("Digite o código do que deseja fazer: ");
            System.out.println("1 - Computador Promoção 1");
            System.out.println("2 - Computador Promoção 2");
            System.out.println("3 - Computador Promoção 3");
            System.out.println("4 - Mostrar itens no seu carrinho");
            System.out.println("5 - Remover item do seu carrinho");
            System.out.println("0 - Fechar sua compra" + "\n");
            codigo = sc.nextInt(); // codigo de entrada para cada funcao do menu

            switch(codigo){
                case 1:
                    System.out.println("\n===== PROMOÇÃO 1 =====");
                    comps[0].mostraPCConfigs();
                    Thread.sleep(300);
                    comprar(comps[0], cliente, sc);
                    break;
                case 2:
                    System.out.println("\n===== PROMOÇÃO 2 =====");
                    comps[1].mostraPCConfigs();
                    Thread.sleep(300);
                    comprar(comps[1], cliente, sc);
                    break;
                case 3:
                    System.out.println("\n===== PROMOÇÃO 3 =====");
                    comps[2].mostraPCConfigs();
                    Thread.sleep(300);
                    comprar(comps[2], cliente, sc);
                    break;
                case 4:
                    // percorrendo o vetor do carrinho de compra nos valores nao nulos
                    for(int i = 0; i < cliente.computador.length; i++){
                        if(cliente.computador[i] != null) {
                            System.out.println(cliente.computador[i].marca + " na posicao " + (i+1));
                        }
                    }
                    break;
                case 5:
                    // removendo item do carrinho
                    remover(cliente, sc);
                    break;
                case 0:
                    // fechando a compra com o ultimo valor calculado do total a pagar
                    System.out.println("\n===== SUA COMPRA =====");
                    System.out.println("Processando os pedidos da sua compra...");
                    Thread.sleep(500);
                    System.out.println("Pronto!" + "\n");

                    System.out.println("Cliente: " + cliente.nome);
                    System.out.println("CPF na nota: " + cliente.cpf);
                    System.out.println("Total da compra: " + cliente.calculaTotalCoampra() + " Reais" + "\n") ;
                    Thread.sleep(500);
                    break;
                default:
                    System.out.println("Codigo Invalido" + "\n");
            }
        }
    }
}