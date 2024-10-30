package br.com.fiap.banco;

public class ContaCorrente extends Conta{

    private double saldoInvestimento;
    private final double TAXA_MANUNTENCAO = 10.00;
    private double limiteDeCredito;

    public ContaCorrente(long numeroConta, Cliente cliente, double saldoInvestimento, double limiteDeCredito) {
        super(numeroConta, cliente);
        this.saldoInvestimento = saldoInvestimento;
        this.limiteDeCredito = limiteDeCredito;
    }

    public double getSaldoInvestimento() {
        return saldoInvestimento;
    }

    public void setSaldoInvestimento(double saldoInvestimento) {
        this.saldoInvestimento = saldoInvestimento;
    }

    public double getTAXA_MANUNTENCAO() {
        return TAXA_MANUNTENCAO;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }
}
