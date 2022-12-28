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
public class Dependente extends Socio {
    private Socio idSocio;

    public Dependente() {
    }

    public Dependente(Socio idSocio, int id, String nome, String rp, String cpf, String telefone, String endereco,  ETipoSocio tipoSocio, float mensalidade, LocalTime dataInicio) {
        super(id, nome, rp, cpf, telefone, endereco, tipoSocio, mensalidade, dataInicio);
        this.idSocio = idSocio;
    }

    public Socio getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Socio idSocio) {
        this.idSocio = idSocio;
    }

    
    
}
