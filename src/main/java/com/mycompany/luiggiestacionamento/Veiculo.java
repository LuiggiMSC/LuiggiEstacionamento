/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luiggiestacionamento;

import com.mycompany.luiggiestacionamento.TipoVeiculo;
import java.util.List;

public class Veiculo {
    private String placa;
    private String cor;
    private int id;
    private Pessoa pessoa;
    private Modelo modelo;
    private TipoVeiculo tipoVeiculo;
    private List<EntradaSaida> entradasSaidas;

    Veiculo(String abC1234, String preto, int i, Pessoa pessoa, Modelo modelo, TipoVeiculo tipoVeiculo, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public List<EntradaSaida> getEntradasSaidas() {
        return entradasSaidas;
    }

    public void setEntradasSaidas(List<EntradaSaida> entradasSaidas) {
        this.entradasSaidas = entradasSaidas;
    }

    
}
