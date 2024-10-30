package br.com.fiap.banco;

public class Conta {
    protected double saldo;
    protected long numeroConta;
    protected Cliente cliente;


    // Construtor
    public Conta(long numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Outros métodos
    public boolean sacar(double valorSaque) {
        if (valorSaque <= 0) {
            System.out.println("Valor de saque deve ser positivo!");
            return false;
        }

        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque;
            System.out.println("Saque efetuado com sucesso!");
            return true;
        }

        System.out.println("Saldo indisponível para saque!");
        return false;
    }

    public boolean depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor de depósito deve ser positivo!");
            return false;
        }

        this.saldo += valorDeposito;
        System.out.println("Depósito efetuado com sucesso!");
        return true;
    }

    public boolean transferir(double valorTransferencia, Conta contaTransferencia) {
        if (valorTransferencia <= 0) {
            System.out.println("Valor de transferência deve ser positivo!");
            return false;
        }

        if (this.sacar(valorTransferencia)) {
            contaTransferencia.depositar(valorTransferencia);
            System.out.println("Transferência efetuada com sucesso!");
            return true;
        }

        return false;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void exibirInformacoes(){
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Nome do cliente: " + cliente.getNomeCLiente());
        System.out.println("Data de nascimento do cliente: " + cliente.getDataNascimento());
    }
}
