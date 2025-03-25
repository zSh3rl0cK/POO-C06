package br.inatel.cdg.Inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public static void destruir(){
        System.out.println("Asteroide destruido");
    }

    // Getter and setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }
}
