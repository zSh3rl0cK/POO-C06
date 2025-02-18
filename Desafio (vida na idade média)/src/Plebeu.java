public class Plebeu extends SerHumano{
    double dinheiro;
    String conjuge;
    double salario;

    public void trabalhar(int horas){
        System.out.println(nome + " Trabalhou por: " + horas);
        System.out.println("Trabalhar é muito cansativo!");

        dinheiro = horas*salario;
    }

    public void pagarImposto(int imposto){
        dinheiro -= imposto;
    }

    public void comprar(float valor){
        dinheiro += valor;
    }
}