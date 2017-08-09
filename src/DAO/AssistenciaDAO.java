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
    
    public List<AssistenciaM> buscaAssistencia(String Nome) throws SQLException{
        List<AssistenciaM> assistenciaM = new ArrayList<AssistenciaM>();
        int cont = 0;
        
        sql = "select * from Assistencia where Cliente_id = ? order by id";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Nome);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           assistenciaM.add(new AssistenciaM(
                   rs.getInt("id"),
                   clientedao.busca(rs.getInt("Cliente_id")),
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
