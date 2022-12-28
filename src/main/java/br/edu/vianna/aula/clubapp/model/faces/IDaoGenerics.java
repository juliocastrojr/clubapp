/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.aula.clubapp.model.faces;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public interface IDaoGenerics<C, K> {
    public void inserir(C u) throws ClassNotFoundException, SQLException;
    public void alterar(C u) throws ClassNotFoundException, SQLException;
    public void apagar(C u) throws ClassNotFoundException, SQLException;
    public C buscarPorId(K i) throws ClassNotFoundException, SQLException;
    public ArrayList<C> buscarTodos() throws ClassNotFoundException, SQLException;
}
