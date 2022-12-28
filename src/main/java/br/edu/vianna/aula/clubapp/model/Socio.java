/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.aula.clubapp.model;

import br.edu.vianna.aula.clubapp.model.e.ETipoSocio;
import java.time.LocalTime;

/**
 *
 * @author julio
 */
public class Socio {
    private int id;
    private String nome;
    private String rp;
    private String cpf;
    private String telefone;
    private String endereco;
    private Banco idBanco;
    private ETipoSocio tipoSocio;
    private float mensalidade;
    private LocalTime dataInicio;

    public Socio() {
    }

    public Socio(int id, String nome, String rp, String cpf, String telefone, String endereco, ETipoSocio tipoSocio, float mensalidade, LocalTime dataInicio) {
        this.id = id;
        this.nome = nome;
        this.rp = rp;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idBanco = new Banco();
        this.tipoSocio = tipoSocio;
        this.mensalidade = mensalidade;
        this.dataInicio = dataInicio;
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

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Banco getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Banco idBanco) {
        this.idBanco = idBanco;
    }

    public ETipoSocio getTipoSocio() {
        return tipoSocio;
    }

    public void setTipoSocio(ETipoSocio tipoSocio) {
        this.tipoSocio = tipoSocio;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public LocalTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    
}
