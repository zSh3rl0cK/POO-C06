public class zumbi {
    String nome;
    double vida;
    int dano;
    boolean cabelo;

    public zumbi(){
        System.out.println("Mais um zumbi nasceu" + "\n");
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
        System.out.println("Cabelo: " + cabelo + "\n");
    }

    void atacar(personagem alvo){
        alvo.tomarDano();

        System.out.println(alvo.nome + " foi atacado por " + nome);
        System.out.println("Sua vida caiu para " + alvo.pontos + "\n");
    }

    void transfereVida(zumbi destino, double quantidade){
        if(quantidade < vida) {
            destino.vida += quantidade;
            vida -= quantidade;

            System.out.println("Após a transferencia a vida de " + destino.nome + " subiu para " + destino.vida + "\n");
        }
        else{
            System.out.println("O zumbi nao possui vida o suficiente para transferir " + "\n");
        }

    }
}
