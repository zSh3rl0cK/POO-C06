public abstract class Personagem implements Combater{

    protected String nome;
    protected int vida;
    public Arma[] arma = new Arma[10];

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void addArma(Arma arma) {
        for(int i = 0; i < this.arma.length; i++) {
            if (this.arma[i] ==null){
                this.arma[i] = arma;
                break;
            }
        }
    }

    public void mostrarArmas() {
        for (Arma value : this.arma) {
            if (value != null) {
                System.out.println(value);
            }
        }
    }

    public void atacar(int posicao, Personagem personagem) {
        if (this.arma[posicao] != null) {
            if (arma[posicao].getDurabilidade() > 0) {
                if (personagem.vida > 0) {
                    arma[posicao].setDurabilidade(0);
                    personagem.vida -= arma[posicao].getDano();
                    System.out.println(this.nome + " atacou " + personagem.nome);
                    System.out.println("ele agora está com: " + personagem.vida + " pontos de vida" + "\n");
                } else {
                    System.out.println("O personagem alvo já está derrotado");
                }
            } else {
                System.out.println(this.nome + " nao foi possivel atacar com essa arma");
            }
        }
        else{
            System.out.println("A arma nem existe seu esquisito");
        }
    }
}
