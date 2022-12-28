/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.vianna.aula.clubapp.model.dao;

import br.edu.vianna.aula.clubapp.database.ConnectionService;
import br.edu.vianna.aula.clubapp.model.Socio;
import br.edu.vianna.aula.clubapp.model.e.ETipoSocio;
import br.edu.vianna.aula.clubapp.model.faces.IDaoGenerics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author julio
 */
public class SocioDAO implements IDaoGenerics<Socio, Integer> {

    @Override
    public void inserir(Socio u) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionService.getConnection();
        
        String sql = "INSERT INTO socios (nome, rg, cpf, telefone, endereco, id_banco, tipo_socio, mensalidade, data_inicio)"
                    +" VALUES (?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, u.getNome());
        pst.setString(2, u.getRp());
        pst.setString(3, u.getCpf());
        pst.setString(4, u.getTelefone());
        pst.setString(5, u.getEndereco());
        pst.setInt(6, u.getIdBanco().getId());
        pst.setString(7, u.getTipoSocio().toString());
        pst.setFloat(8, u.getMensalidade());
        pst.setObject(9, u.getDataInicio());
        
        pst.executeUpdate();
        
    }

    @Override
    public void alterar(Socio u) throws ClassNotFoundException, SQLException {
        Connection c = ConnectionService.getConnection();
        
        String sql = "UPDATE socios SET nome = ?, rg = ?, cpf = ?, telefone = ?, endereco = ?, id_banco = ?, tipo_socio = ?, "
                    +"mensalidade = ?, data_inicio = ? WHERE id = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setString(1, u.getNome());
        pst.setString(2, u.getRp());
        pst.setString(3, u.getCpf());
        pst.setString(4, u.getTelefone());
        pst.setString(5, u.getEndereco());
        pst.setInt(6, u.getIdBanco().getId());
        pst.setString(7, u.getTipoSocio().toString());
        pst.setFloat(8, u.getMensalidade());
        pst.setObject(9, u.getDataInicio());
        pst.setInt(10, u.getId());
        
        pst.executeUpdate();
    }

    @Override
    public void apagar(Socio u) throws ClassNotFoundException, SQLException {
        Connection c  = ConnectionService.getConnection();
        
        String sql = "DELETE FROM socios WHERE id = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, u.getId());
        
        pst.executeUpdate();
    }

    @Override
    public Socio buscarPorId(Integer i) throws ClassNotFoundException, SQLException {
        Connection c  = ConnectionService.getConnection();
        
        String sql = "SELECT * FROM socios WHERE id = ?";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, i);
        
        ResultSet rs = pst.executeQuery();
        
        Socio so = null;
        
        if(rs.next()){
            so = new Socio(rs.getInt("id"), rs.getString("nome"), rs.getString("rg"), rs.getString("cpf"), rs.getString("telefone"), 
                    rs.getString("endereco"), ETipoSocio.valueOf(rs.getString("tipo_socio")), rs.getFloat("mensalidade"), 
                    LocalTime.parse(rs.getString("data_inicio"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            
        }
        return so;
    }

    @Override
    public ArrayList<Socio> buscarTodos() throws ClassNotFoundException, SQLException {
        Connection c  = ConnectionService.getConnection();
        
        String sql = "SELECT * FROM socios";
        PreparedStatement pst = c.prepareStatement(sql);
        
        ResultSet rs = pst.executeQuery();
        
        ArrayList<Socio> lista = new ArrayList<>();
        while(rs.next()){
            
            Socio so = new Socio(rs.getInt("id"), rs.getString("nome"), rs.getString("rg"), rs.getString("cpf"), rs.getString("telefone"), 
                    rs.getString("endereco"), ETipoSocio.valueOf(rs.getString("tipo_socio")), rs.getFloat("mensalidade"), 
                    LocalTime.parse(rs.getString("data_inicio"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            
            lista.add(so);
        }
        return lista;
    }
    
}
