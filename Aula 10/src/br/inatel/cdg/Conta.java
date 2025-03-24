package br.inatel.cdg;

public class Conta {
    private int saldo;
    private int numero;
    private float limite;

    Cliente clientes[] = new Cliente[10];

    public Conta() {
        setClientes(new Cliente[3]);
    }

    public void setClientes(Cliente[] cliente) {
        this.clientes = cliente;
    }

    public void sacar(float quantia) {
        if (quantia < saldo && quantia <= limite) {
            this.saldo -= quantia;
        }
        else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public void depositar(float quantia) {
        this.saldo += quantia;
    }

    //Getters e Setters
    public float getSaldo(){
        return this.saldo;
    }
    public float getLimite(){
        return this.limite;
    }
    public void setLimite(float limite){
        this.limite = limite;
    }
    public Cliente[] getClientes() {
        return clientes;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
