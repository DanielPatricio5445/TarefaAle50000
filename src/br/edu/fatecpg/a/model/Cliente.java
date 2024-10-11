package br.edu.fatecpg.a.model;

public class Cliente {
    private String nome;
    private String sexo;
    private int valor;

    public Cliente(String nome, String sexo, int valor) {
        this.nome = nome;
        this.sexo = sexo;
        this.valor = valor;
    }

    public void enviar() {
        System.out.println("Nome: " + nome + ", Sexo: " + sexo + ", Valor: " + valor);
    }

    // Getters (opcional)
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getValor() {
        return valor;
    }
}