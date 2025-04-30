public class BrownieNutella extends Brownie{
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adicionando Nutella");
    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Adicionando brownie de nutella no Carrinho");
    }
}
