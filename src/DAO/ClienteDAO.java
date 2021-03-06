/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import MODEL.ClienteM;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NUPSI 04
 */
public class ClienteDAO {
    
    PreparedStatement pst;
    String sql;
    
    public void salvar (ClienteM cliente) throws SQLException{
        sql = "insert into cliente values(?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, cliente.getNome());
        pst.setString(3, cliente.getEndereco());
        pst.setString(4, cliente.getNumero());
        pst.setString(5, cliente.getBairro());
        pst.setString(6, cliente.getTelefone());
        pst.setString(7, cliente.getData_nascimento());
        pst.execute();
        pst.close();
    }
    
    public void Alterar (ClienteM cliente) throws SQLException{
        sql = "update cliente set nome=?, endereco=?, numero=?, bairro=?, telefone=?, data_nascimento=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, cliente.getNome());
        pst.setString(2, cliente.getEndereco());
        pst.setString(3, cliente.getNumero());
        pst.setString(4, cliente.getBairro());
        pst.setString(5, cliente.getTelefone());
        pst.setString(6, cliente.getData_nascimento());
        pst.setInt(7, cliente.getId());
        pst.execute();
        pst.close();
    }
    
    public void excluir(ClienteM cliente) throws SQLException{
        sql = "delete from cliente where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, cliente.getId());
        pst.execute();
        pst.close();
    }
    
    public List<ClienteM> ListaCliente() throws SQLException{
        List<ClienteM> listaclientes;
        listaclientes = new ArrayList<>();
        sql = "select * from cliente order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaclientes.add(new ClienteM(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("endereco"),
                            rs.getString("numero"),
                            rs.getString("bairro"),
                            rs.getString("telefone"),
                            rs.getString("data_nascimento")));
        }
        pst.close();
        return listaclientes;
    }
    
    public ClienteM busca(int id) throws SQLException{
        ClienteM clienteM = null;

        sql = "select * from cliente where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           clienteM = new ClienteM(
                             rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("endereco"),
                            rs.getString("numero"),
                            rs.getString("bairro"),
                            rs.getString("telefone"),
                            rs.getString("data_nascimento"));
                   
        }
        pst.close();
        return clienteM;
    }
    
    public List<ClienteM> buscaCliente(String Nome) throws SQLException{
        List<ClienteM> clienteM = new ArrayList<ClienteM>();
        
        int cont = 0;
        String name = "%"+Nome+"%";
        
        sql = "select * from cliente where nome like ? order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, name);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           clienteM.add(new ClienteM(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("endereco"),
                            rs.getString("numero"),
                            rs.getString("bairro"),
                            rs.getString("telefone"),
                            rs.getString("data_nascimento")));  
           cont ++;
        }
        if(cont == 0){
            return null;
        }
            
        pst.execute();
        pst.close();                           
        
        return clienteM;
    }
}
