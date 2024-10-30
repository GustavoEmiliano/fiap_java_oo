package br.com.fiap.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String nomeCLiente;
    private String cpfCliente;
    private String enderecoCLiente;
    private String telefoneCliente;
    private Date dataNascimento;

    // construtor
    public Cliente(String nomeCLiente, String cpfCliente, String enderecoCLiente, String telefoneCliente, String dataNascimento) {
        this.nomeCLiente = nomeCLiente;
        this.cpfCliente = cpfCliente;
        this.enderecoCLiente = enderecoCLiente;
        this.telefoneCliente = telefoneCliente;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            this.dataNascimento = format.parse(dataNascimento);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    // getters e setters
    public String getNomeCLiente() {
        return nomeCLiente;
    }

    public void setNomeCLiente(String nomeCLiente) {
        this.nomeCLiente = nomeCLiente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEnderecoCLiente() {
        return enderecoCLiente;
    }

    public void setEnderecoCLiente(String enderecoCLiente) {
        this.enderecoCLiente = enderecoCLiente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
