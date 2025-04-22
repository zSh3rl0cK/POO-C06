public class zumbi {
    String nome;
    double vida;
    int dano;
    boolean cabelo;

    public zumbi(){
        System.out.println("Mais um zumbi nasceu");
    }

    void seAlimentar(humano pessoa) {
        System.out.println("zumbi " + nome + " está comendo " + pessoa.nome + " nham nham..." + "\n");
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("Cabelo: " + cabelo + "\n");
    }

    void atacar(zumbi alvo){
        alvo.vida -= dano;
        alvo.cabelo = false;

        System.out.println(alvo.nome + " foi atacado por " + nome + " e perdeu o cabelo");
        System.out.println("Sua vida caiu para " + alvo.vida + "\n");
    }

    void transfereVida(zumbi destino, double quantidade){
        destino.vida += quantidade;

        vida -= quantidade;
    }
}
