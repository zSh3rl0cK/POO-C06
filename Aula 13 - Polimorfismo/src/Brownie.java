public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie (String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompra(){
        System.out.println("Adicionando ao carrinho de Compra " + "\n");
    }

    public void calculaTotalCompra(){
        System.out.println("Carrinho de Compra " + nome + " " + preco + "\n");
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Sabor: " + sabor + "\n");
    }

    public double getPreco() {
        return preco;
    }
}
