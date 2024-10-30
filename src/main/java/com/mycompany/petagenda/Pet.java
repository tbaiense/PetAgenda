/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petagenda;

/**
 *
 * @author Nata e Julia
 */

public class Pet {

    private String nome;
    private String raca;
    private String porte;
    private String cor;
    private String sexo;
    private String descricao;

    public Pet(String nome, String raca, String porte, String cor, String sexo, String descricao) {
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.cor = cor;
        this.sexo = sexo;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getPorte() {
        return porte;
    }

    public String getCor() {
        return cor;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDescricao() {
        return descricao;
    }
}
