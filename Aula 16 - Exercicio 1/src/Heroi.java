public class Heroi extends Personagem{
    public Heroi(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void usarEspecial(Personagem personagem) {
        for(int i = 0; i < personagem.arma.length; i++){
            if(personagem.arma[i] != null){
                personagem.arma[i] = null;
            }
        }
    }
}
