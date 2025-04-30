public class Vilao extends Personagem implements Combater{
    public Vilao(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        personagem.vida = 0;

        System.out.println("A vida de " + personagem.nome + " foi drenada com sucesso!");
    }
}
