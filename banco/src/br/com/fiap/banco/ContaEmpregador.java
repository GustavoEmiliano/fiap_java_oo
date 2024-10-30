package br.com.fiap.banco;

import java.util.Date;

public class ContaEmpregador {
    private String empregador;
    private Date dataDeposito;

    public ContaEmpregador(String empregador, Date dataDeposito) {
        this.empregador = empregador;
        this.dataDeposito = dataDeposito;
    }

    public String getEmpregador() {
        return empregador;
    }

    public void setEmpregador(String empregador) {
        this.empregador = empregador;
    }

    public Date getDataDeposito() {
        return dataDeposito;
    }

    public void setDataDeposito(Date dataDeposito) {
        this.dataDeposito = dataDeposito;
    }
}
