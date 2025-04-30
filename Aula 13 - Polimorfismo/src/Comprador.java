public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        if(saldo >= brownie.getPreco()) {
            System.out.println(nome + " efetuou compra");
            brownie.addCarrinhoDeCompra();
            brownie.calculaTotalCompra();

            saldo -= brownie.getPreco();
            System.out.println("Seu saldo agora é: " + this.saldo + "\n");
        }
        else {
            System.out.println(nome + " é mt pobre e nao pode comprar" + "\n");
        }
    }
}
