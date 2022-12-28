/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.aula.clubapp.model;

/**
 *
 * @author julio
 */
public class Banco {
    private int id;
    private String nome;
    private int agencia;
    private int conta;

    public Banco() {
    }

    public Banco(int id, String nome, int agencia, int conta) {
        this.id = id;
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
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

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    
}
