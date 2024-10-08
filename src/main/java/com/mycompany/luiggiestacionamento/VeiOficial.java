/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luiggiestacionamento;

public class VeiOficial extends Veiculo {
    private String renavan;
    private String chassi;

    public VeiOficial(String abC1234, String preto, int i, Pessoa pessoa, Modelo modelo, TipoVeiculo tipoVeiculo, Object object) {
        super(abC1234, preto, i, pessoa, modelo, tipoVeiculo, object);
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getChassi() {
        return chassi;
    }
    
    public void setChassi(String chassi) {
        this.chassi = chassi;
    } 
}
