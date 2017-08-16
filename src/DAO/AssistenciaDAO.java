/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import MODEL.*;

/**
 *
 * @author NUPSI 04
 */
public class AssistenciaDAO {
    ClienteDAO clientedao = new ClienteDAO();
    PreparedStatement pst;
    String sql;
    
    public void salvar (AssistenciaM assistencia) throws SQLException{
        sql = "insert into assistencia values(?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setInt(2, assistencia.getNome_cliente());
        pst.setString(3, assistencia.getMedicamento());
        pst.setString(4, assistencia.getData_atendimento());
        pst.setString(5, assistencia.getQuadro_acontecido());
        pst.setString(6, assistencia.getAtendente());
        pst.execute();
        pst.close();
    }
    
    public void Alterar (AssistenciaM assistencia) throws SQLException{
        sql = "update assistencia set Cliente_id =?, medicamento=?, data_atendimento=?, quadro_acontecimento=?, atendente=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, assistencia.getNome_cliente());
        pst.setString(2, assistencia.getMedicamento());
        pst.setString(3, assistencia.getData_atendimento());
        pst.setString(4, assistencia.getQuadro_acontecido());
        pst.setString(5, assistencia.getAtendente());
        pst.setInt(6, assistencia.getId());
        pst.execute();
        pst.close();
    }
    
    public void excluir(AssistenciaM assistencia) throws SQLException{
        sql = "delete from assistencia where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, assistencia.getId());
        pst.execute();
        pst.close();
    }
    
    public List<AssistenciaM> ListaAssistencia() throws SQLException{
        List<AssistenciaM> listaassistencia;
        listaassistencia = new ArrayList<>();
        sql = "select * from assistencia order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaassistencia.add(new AssistenciaM(
                            rs.getInt("id"),
                            rs.getInt("Cliente_id"),
                            rs.getString("medicamento"),
                            rs.getString("data_atencimento"),
                            rs.getString("quadro_acontecimento"),
                            rs.getString("atendente")));
        }
        pst.close();
        return listaassistencia;
    }
    
        public List<AssistenciaM> buscaListaVazia() throws SQLException{
        List<AssistenciaM> assistenciaM = new ArrayList<>();
        
        sql = "select * from vazio where id = 1";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           assistenciaM.add(new AssistenciaM(
                   rs.getInt("id"),
                   rs.getInt("Cliente_id"),
                   rs.getString("medicamento"),
                   rs.getString("data_atendimento"),
                   rs.getString("quadro_acontecimento"),
                   rs.getString("atendente")));  
        }
        pst.close();
        return assistenciaM;
    }
    
    public AssistenciaM busca(int id) throws SQLException{
        AssistenciaM assistenciaM = null;
        
        sql = "select * from assistencia where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           assistenciaM = new AssistenciaM(
                   rs.getInt("id"),
                   rs.getInt("Cliente_id"),
                   rs.getString("medicamento"),
                   rs.getString("data_atendimento"),
                   rs.getString("quadro_acontecimento"),
                   rs.getString("atendente"));  
        }
        pst.close();
        return assistenciaM;
    }
    public List<AssistenciaM> buscaAssistencia(String Nome) throws SQLException{
        List<AssistenciaM> assistenciaM = new ArrayList<>();
        int cont = 0;
        
        sql = "select * from assistencia where Cliente_id = ? order by id desc";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Nome);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           assistenciaM.add(new AssistenciaM(
                   rs.getInt("id"),
                   rs.getInt("Cliente_id"),
                   rs.getString("medicamento"),
                   rs.getString("data_atendimento"),
                   rs.getString("quadro_acontecimento"),
                   rs.getString("atendente")));  
           cont ++;
        }
        if(cont == 0){
            return null;
        }
            
        pst.execute();
        pst.close();                           
        
        return assistenciaM;
    }
}
