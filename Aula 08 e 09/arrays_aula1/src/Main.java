//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cantina c1 = new Cantina();
        c1.nome = "Cantina do Inatel";

        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        Salgado salgados[] = new Salgado[3];

        salgados[0] = s1;
        salgados[1] = s2;
        salgados[2] = s3;

        salgados[0].nome = "Pizza";
        salgados[1].nome = "Hamburguer";
        salgados[2].nome = "Pão de queijo";

        for(int i = 0; i < salgados.length; i++) {
            c1.addSalgado(salgados[i]);
        }

        c1.mostrarInfo();
    }
}