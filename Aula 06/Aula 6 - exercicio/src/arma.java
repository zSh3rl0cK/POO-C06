public class arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    public void mostrarInfoArma(){
        System.out.println("Arma: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Descricao: " + descricao + "\n");
    }
}
