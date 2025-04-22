//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // criando uma nova instancia de conta
        conta conta1 = new conta();
        conta conta2 = new conta();
        conta conta3 = new conta();

        conta1.saldo = 10000;
        conta2.saldo = 500000;
        conta3.saldo = 100;

        conta1.sacar(12);
        conta2.sacar(1000);
        conta3.sacar(10);
    }
}