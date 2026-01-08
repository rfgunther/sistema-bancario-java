
package br.com.banco.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private LocalDateTime dataHora;
    private String tipo; // "depósito", "saque", "transferência"
    private double valor;
    private String descricao;

    public Transacao(String tipo, double valor, String descricao) {
        this.dataHora = LocalDateTime.now();
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return String.format("[%s] %s: R$ %.2f - %s", 
                dataHora.format(fmt), tipo, valor, descricao);
    }

    // Getters se precisar depois
    public LocalDateTime getDataHora() { return dataHora; }
    public String getTipo() { return tipo; }
    public double getValor() { return valor; }
}
