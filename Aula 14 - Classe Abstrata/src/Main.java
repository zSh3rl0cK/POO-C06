//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lontra lontrosa = new Lontra("Chris Lontroso", 2500);
        Boi boiadas = new Boi("Chris boiadeiro", 7500);
        Cachorro cachorrao = new Cachorro("Chris Cachorrao", 4500);

        lontrosa.mostraInfo();
        boiadas.mostraInfo();
        cachorrao.mostraInfo();

        lontrosa.emitirSom();
        boiadas.emitirSom();
        cachorrao.emitirSom();


    }
}