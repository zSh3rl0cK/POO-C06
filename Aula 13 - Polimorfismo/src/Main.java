public class Main {
    public static void main(String[] args) {
        BrownieNutella bn = new BrownieNutella("Chris doce", 130, "Nutella 2");
        BrownieCafe bc = new BrownieCafe("Chris amargo", 250, "capuccino");
        BrownieDoceDeLeite bddl = new BrownieDoceDeLeite("Chris leitoso", 328, "Leite amarelo");

        Brownie bw = new BrownieCafe("Chris chocolatoso", 250, "Fraapuccino");
        Comprador cliente = new Comprador("Topher", 600);

        bn.mostraInfo();
        bddl.mostraInfo();
        bc.mostraInfo();
        bw.mostraInfo();

        bc.adicionaCafe();
        bddl.adicionaDoceDeLeite();
        bn.adicionaNutella();
        if(bc instanceof BrownieCafe) {
            BrownieCafe browniecafe = (BrownieCafe) bc;
            browniecafe.adicionaCafe();
        }

        cliente.efetuarCompra(bn);
        cliente.efetuarCompra(bddl);
        cliente.efetuarCompra(bc);
        cliente.efetuarCompra(bw);
    }
}