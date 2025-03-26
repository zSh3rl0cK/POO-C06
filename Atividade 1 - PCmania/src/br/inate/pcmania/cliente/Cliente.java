package br.inate.pcmania.cliente;

import br.inate.pcmania.computador.Computador;

import java.util.Scanner;

public class Cliente {
    public String nome;
    public long cpf;
    private float total;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(Computador C1){
        total += C1.preco;

        return total;
    }

    public static void comprar(Computador C1, Cliente cliente, Scanner sc) throws InterruptedException {
        System.out.println("Deseja adicionar ao carrinho? (1- Sim / 0 - Não)");
        int compra = sc.nextInt();

        if(compra == 1){
            System.out.println("Seu carrinho tem: " + cliente.calculaTotalCompra(C1) + " Reais");
        }
        else if(compra == 0){
            System.out.println("Cancelando compra...");
            Thread.sleep(2000);
        }
        else{
            System.out.println("Invalido");
        }
    }

    public float getTotal() {
        return total;
    }
}
