public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Adicionando cafe");
    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Adicionando brownie de cafe no Carrinho");
    }
}
