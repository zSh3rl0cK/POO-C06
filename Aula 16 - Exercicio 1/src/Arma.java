public class Arma {
    private String nome;
    private int dano;
    private int durabilidade;

    public Arma(String nome, int dano, int durabilidade) {
        this.nome = nome;
        this.dano = dano;
        this.durabilidade = durabilidade;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Arma{" +
                " nome ='" + nome + '\'' +
                ", dano=" + dano +
                ", durabilidade=" + durabilidade +
                '}';
    }

    public int getDano(){
        return dano;
    }

    public void setDurabilidade(int durabilidade){
        this.durabilidade = durabilidade;
    }

    public int getDurabilidade(){
        return durabilidade;
    }
}
