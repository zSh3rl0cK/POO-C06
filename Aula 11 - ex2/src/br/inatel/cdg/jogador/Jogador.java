package br.inatel.cdg.jogador;

public class Jogador {
    public int pontos;
    private String nome;
    private int moedas;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public static void conversor(Jogador p1){
        p1.moedas = p1.pontos*100;
    }

    public int getMoedas() {
        return moedas;
    }
}
