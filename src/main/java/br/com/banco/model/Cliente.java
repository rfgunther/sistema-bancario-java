
package br.com.banco.model;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    // Construtor
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf.replaceAll("[^0-9]", ""); // remove pontos, traços, etc.
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    // Validação simples de CPF (11 dígitos numéricos)
    public boolean isCpfValido() {
        return cpf != null && cpf.matches("\\d{11}");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
