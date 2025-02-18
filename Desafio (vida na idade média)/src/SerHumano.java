public class SerHumano extends Family{
    String nome;
    int idade;
    int descanso;
    boolean vivo;

    public void falar(){
        System.out.println("Nem mesmo lanças de um arduo serviço podem me perfurar");
    }

    public void descansar(int tempo){
        descanso -= tempo;

        System.out.println(nome + " descansou por " + descanso + " horas." +"\n");
    }

}