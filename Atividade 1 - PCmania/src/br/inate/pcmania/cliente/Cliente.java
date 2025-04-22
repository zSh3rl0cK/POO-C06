package br.inate.pcmania.cliente;

import br.inate.pcmania.computador.Computador;

import java.util.Scanner;

public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] computador = new Computador[50];

    // construtor do cliente
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // cálculo do total da compra com o vetor de computadores do cliente
    public float calculaTotalCoampra(){
        // calculando o total da compra
        float total = 0;
        for (Computador value : computador) {
            if (value != null) {
                total += value.preco;
            }
        }
        return total;
    }

    // função static para servir de utilitário simplificando a ação de comprar ou não um computador da promoção
    public static void comprar(Computador C1, Cliente cliente, Scanner sc) throws InterruptedException {
        System.out.println("Deseja adicionar ao carrinho? (1- Sim / 0 - Não)");
        int compra = sc.nextInt();
        int i = 0; // contador

        // caso o cliente va adicionar o item ao carrinho
        if(compra == 1){
            while(true){
                // adicionando o computador em uma posicao nula
                if(cliente.computador[i] == null){
                    cliente.computador[i] = C1;
                    break;
                }
                i++;
            }
            System.out.println("Seu carrinho tem: " + cliente.calculaTotalCoampra() + " Reais");
        }
        // caso o cliente cancele a compra
        else if(compra == 0){
            System.out.println("Cancelando compra...");
            Thread.sleep(2000);
        }
        // contenção
        else{
            System.out.println("Invalido");
        }
    }

    // metodo static utilitario para remover o item do carrinho
    public static void remover(Cliente cliente, Scanner sc) {
        System.out.println("Digite o número do item que deseja remover do carrinho (valor >= 1)");
        int indice = sc.nextInt() - 1; // indice para o vetor carrinho de compras

        // caso seja válido
        if (indice >= 0 && indice < cliente.computador.length && cliente.computador[indice] != null) {
            System.out.println("Removendo computador: " + cliente.computador[indice].marca);
            cliente.computador[indice] = null;
            System.out.println("Item removido com sucesso!");
        }
        // contenção para erro do indice
        else {
            System.out.println("Índice inválido ou carrinho vazio.");
        }
    }
}
