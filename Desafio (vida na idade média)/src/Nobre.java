public class Nobre extends SerHumano{
    double dinheiro;
    double salario;

    public Nobre(String nome, int idade, int descanso, boolean vivo, double dinheiro, double salario) {
        super(nome, idade, descanso, vivo); // Chama o construtor da superclasse
        this.dinheiro = dinheiro;
        this.salario = salario;
    }

    public void comprar(double valor, String item){
        dinheiro += valor;
        System.out.println(nome + " gastou " + valor + " comprando " + item + " com sucesso!");
    }

    public void ReceberPagamento(double valor){
        salario += valor;
        System.out.println(nome + " roubou " + valor + " de dinheiro publico com sucesso");
    }

}