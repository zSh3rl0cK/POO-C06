package br.inatel.projetojava.personagens;

public abstract class SerHumano {

    // No UML não está protected(#) - arrumar.
    protected String nome;
    protected int idade;
    protected String genero;

    public SerHumano(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public abstract void interagir();

    public abstract void mostraInfoPersonagem();

}
