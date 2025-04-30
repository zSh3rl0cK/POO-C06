//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BrownieNutella bwNut = new BrownieNutella("Chris doce", 130, "Nutella 2");
        BrownieCafe bwCaf = new BrownieCafe("Chris amargo", 250, "capuccino");
        BrownieDoceDeLeite bwDcL = new BrownieDoceDeLeite("Chris leitoso", 328, "Leite amarelo");

        Brownie Bcafe2 = new BrownieCafe("Chris doce", 250, "frapuccino");
        /* a linha acima é aceita pq os tipos são iguais, mas ainda assim chamar a superclasse
         nao é recomendado. Se vc tentar chamar um metodo especificio do café nao ira funcionar
         (precisa fazer casting pra funcionar)
         Porem se vc chamar um metodo sobrescrito ele ainda será aceito
        */

        bwNut.mostraInfo();
        bwDcL.mostraInfo();
        bwCaf.mostraInfo();

        bwCaf.adicionaCafe();
        bwDcL.adicionaDoceDeLeite();
        bwNut.adicionaNutella();

        bwNut.addCarrinhoDeCompra();
        bwCaf.addCarrinhoDeCompra();
        bwDcL.addCarrinhoDeCompra();

        bwNut.calculaTotalCompra();
        bwCaf.calculaTotalCompra();
        bwDcL.calculaTotalCompra();
    }
}