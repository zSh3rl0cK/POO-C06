public class Cantina {
    String nome;
    Salgado salgados[] = new Salgado[3];

    public void addSalgado(Salgado novoSalgado){
        for(int i=0;i<salgados.length;i++) {
            if(salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostrarInfo() {
        for (int i = 0; i < salgados.length; i++) {
            System.out.println(salgados[i].nome);
        }
    }
}
