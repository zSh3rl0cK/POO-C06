import java.util.HashSet;
import java.util.Set;

public class Conta {
    private double saldo;
    private double limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void mostraInfo(){
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);

        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Cpf: " + cliente.getCpf());
            }
            catch (NullPointerException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    // getteres e setters
    public double getSaldo() {
        return this.saldo;
    }
    public double getLimite() {
        return this.limite;
    }
    public void setCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
