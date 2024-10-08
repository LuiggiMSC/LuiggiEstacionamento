package com.mycompany.luiggiestacionamento;

import com.mycompany.luiggiestacionamento.Pessoa;
import com.mycompany.luiggiestacionamento.Veiculo;
import com.mycompany.luiggiestacionamento.VinculoPessoa;
import com.mycompany.luiggiestacionamento.TipoVeiculo;
import com.mycompany.luiggiestacionamento.Marca;
import com.mycompany.luiggiestacionamento.Modelo;
import com.mycompany.luiggiestacionamento.ControleEstacionamento;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(1, "Joao", "123456789", "joao@mail.com", VinculoPessoa.ALUNO);

        Modelo modelo = new Modelo(1, "Civic", Marca.HONDA);
        Veiculo veiculo = new Veiculo("ABC1234", "Preto", 1, pessoa, modelo, TipoVeiculo.CARRO, null);

        ControleEstacionamento service = new ControleEstacionamento();
        service.registrarEntrada(veiculo);
        service.registrarSaida(veiculo);

        service.getRegistro().forEach(r -> System.out.println(r.getTipo() + " - " + r.getData()));
    }
}
