public class Cachorro extends Mamifero {

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro diz: AUAUAUAUAUAUAUUAUAUAUAUAUAUAUA (cof cof cof cof)");
    }
}
