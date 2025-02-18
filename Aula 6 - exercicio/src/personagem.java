public class personagem {
    String nome;
    int pontos;

    public void usarArma(arma arma, zumbi alvo){
        arma.resistencia -= 2;

        alvo.vida -= arma.poder;

        System.out.println(nome + " esta atacando " + alvo.nome);
        System.out.println("A vida de " + alvo.nome + " após o ataque, caiu para " + alvo.vida +"\n");
    }

    public void tomarDano(){
        pontos -= 5;
    }

    public void mostrarInfoPersonagem(){
        System.out.println("Personagem: " + nome);
        System.out.println("Pontos: " + pontos + "\n");
    }
}
