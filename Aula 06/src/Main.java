//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        zumbi zumbi1 = new zumbi();
        zumbi1.cabelo = false;
        zumbi1.nome = "Gepeto";
        zumbi1.vida = 175;
        zumbi1.dano = 45;

        zumbi zumbi2 = new zumbi();
        zumbi2.cabelo = true;
        zumbi2.nome = "Gaspar";
        zumbi2.vida = 100;
        zumbi2.dano = 90;

        humano pessoa1 = new humano();
        pessoa1.nome = "Danilo";
        pessoa1.vida = 300;

        humano pessoa2 = new humano();
        pessoa2.nome = "Nilmar";
        pessoa2.vida = 250;

        zumbi1.mostraInfo();
        zumbi2.mostraInfo();

        zumbi2.seAlimentar(pessoa2);

        zumbi1.atacar(zumbi2);

        zumbi1.seAlimentar(pessoa1);


    }
}