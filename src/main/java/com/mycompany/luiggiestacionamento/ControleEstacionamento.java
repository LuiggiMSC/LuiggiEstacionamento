/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luiggiestacionamento;

import com.mycompany.luiggiestacionamento.EntradaSaida;
import com.mycompany.luiggiestacionamento.Veiculo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControleEstacionamento {
    private List<EntradaSaida> registro;

    public ControleEstacionamento() {
        this.registro = new ArrayList<>();
    }

    public void registrarEntrada(Veiculo veiculo) {
        EntradaSaida entrada = new EntradaSaida();
        entrada.setVeiculo(veiculo);
        entrada.setData(new Date());
        entrada.setTipo(Tipo.ENTRADA);
        registro.add(entrada);
    }

    public void registrarSaida(Veiculo veiculo) {
        EntradaSaida saida = new EntradaSaida();
        saida.setVeiculo(veiculo);
        saida.setData(new Date());
        saida.setTipo(Tipo.SAIDA);
        registro.add(saida);
    }

    public List<EntradaSaida> getRegistro() {
        return registro;
    }
}
