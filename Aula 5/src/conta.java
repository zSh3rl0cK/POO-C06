public class conta {
    // atributos
    int saldo;
    int limite;
    float numeroDaConta;

    // métodos
    public void sacar(int quantidade){
        saldo -= quantidade;
    }

    void depositar(int quantidade){
        saldo += quantidade;
    }
}
