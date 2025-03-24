import br.inatel.cdg.Cliente;
import br.inatel.cdg.Conta;

public class Main {
    public static void main(String[] args) {
        // Criando 2 clientes
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Arsene");
        cliente1.setCpf(55555555);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Izanagi");
        cliente2.setCpf(44444444);

        // Adicionando os clientes no vetor de clientes
        Cliente[] clientes = new Cliente[2];
        clientes[0] = cliente1;
        clientes[1] = cliente2;

        // criando uma nova conta
        Conta conta = new Conta();
        conta.setClientes(clientes);
        conta.setLimite(500);
        conta.setNumero(01);

        // operações
        System.out.println("Saldo da conta" + conta.getSaldo());

        conta.depositar(1000);

        System.out.println("Saldo da conta" + conta.getSaldo());

        conta.sacar(600);

        conta.sacar(400);
        System.out.println("Saldo da conta" + conta.getSaldo());
    }
}
