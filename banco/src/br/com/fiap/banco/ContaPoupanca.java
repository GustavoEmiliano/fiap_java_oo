package br.com.fiap.banco;

import java.util.Date;

public class ContaPoupanca extends Conta {

    private double juros;
    private Date dataVencimentoJuros;

    public ContaPoupanca(long numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }
}
