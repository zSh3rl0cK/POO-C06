public class Plebeu extends SerHumano{
    double dinheiro;
    double salario;

    public void trabalhar(int horas){
        System.out.println(nome + " Trabalhou por: " + horas + " horas e agora tem " + Math.ceil(dinheiro) + " moedas.");
        System.out.println("Trabalhar é muito cansativo!" + "\n");

        if(horas > 0) {
            dinheiro = Math.ceil(dinheiro + (horas * salario));
        }
    }

    public void pagarImposto(double imposto){
        System.out.println(nome + " Pagara imposto avaliado em: " + Math.ceil(imposto) + "\n");

        if(dinheiro > imposto) {
            dinheiro = Math.ceil(dinheiro - imposto);

            System.out.println("Imposto pago com sucesso! ");
            System.out.println(nome + " tem um saldo de " + dinheiro + " moedas." + "\n");
        }
        else{
            System.out.println(nome + " esta pobre e sera preso" + "\n");
        }
    }

    public void comprar(double valor){
        dinheiro += valor;
    }
}