public class BrownieDoceDeLeite extends Brownie{
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite() {
        System.out.println("Adicionando doce de leite");
    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Adicionando brownie de doce de leite no Carrinho");
    }
}
