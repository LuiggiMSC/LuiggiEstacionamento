package com.mycompany.luiggiestacionamento;

public class Pessoa {
    private int id;
    private String nome;
    private String fone;
    private String email;
    private VinculoPessoa vinculo;

    Pessoa(int i, String joão, String string, String joaomailcom, VinculoPessoa vinculoPessoa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VinculoPessoa getVinculo() {
        return vinculo;
    }

    public void setVinculo(VinculoPessoa vinculo) {
        this.vinculo = vinculo;
    }

    
}