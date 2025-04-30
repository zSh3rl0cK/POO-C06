package animais;

import intefaces.Aquatico;

public class Lontra extends Mamifero implements Aquatico {
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("iriririririririirrii");
    }

    @Override
    public void nadar() {
        System.out.println("Nado veloz como os peixeis: iririririririiririririri");
    }
}
