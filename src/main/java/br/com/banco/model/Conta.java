

package br.com.banco.model;

public class Conta {
    private int numero;
    private static int proximoNumero = 1; // contador sequencial
    private String agencia = "0001";
    private double saldo = 0.0;
    private Cliente titular;

    public Conta(Cliente titular) {
        this.titular = titular;
        this.numero = proximoNumero++;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular.getNome() +
                '}';
    }
}
