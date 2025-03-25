package br.inatel.cdg.bloco;

import br.inatel.cdg.jogador.Jogador;

public class Bloco {
    private static int numBlocos;
    private static int destruidos;
    private String tipo;

    public Bloco(String tipo) {
        numBlocos++;
        this.tipo = tipo;
    }

    public void destruirBloco(Jogador P1) {
        destruidos++;

        if(tipo == "Forte") {
            P1.pontos+=2;
        }
        else{
            P1.pontos++;
        }
    }

    public static int getNumBlocos() {
        return numBlocos;
    }

    public static int getDestruidos() {
        return destruidos;
    }
}
