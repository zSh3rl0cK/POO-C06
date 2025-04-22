public class jogador {
    String nome;
    Arma arma;
    int energia;
    int vida;

    public jogador(String nome, Arma arma, int vida, int energia) {
        this.nome = nome;
        this.arma = arma;
        this.vida = vida;
        this.energia = energia;
    }

    public void atacar(jogador alvo){
        if(arma.custoDeEnergia < energia) {
            alvo.vida -= arma.dano;
            energia -= arma.custoDeEnergia;

            System.out.println(alvo.nome + " foi atacado por " + nome + " e sofreu " + arma.dano + " de dano" + "\n");
        }
        else{
            System.out.println(nome + " esta muito cansado para atacar" + "\n");
        }
    }

    public void info(){
        System.out.println(nome + "\n");
        System.out.println(vida + "\n");
        System.out.println(energia + "\n");
        System.out.println(vida + "\n");
    }
}
