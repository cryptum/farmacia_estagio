/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.ClienteDAO;
import MODEL.ClienteM;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NUPSI 04
 */
public class ClienteView extends javax.swing.JInternalFrame {

    ClienteM cliente;
    ClienteDAO clientedao;
    List<ClienteM> listaclientes;
    
    public ClienteView() {
        clientedao = new ClienteDAO();
        listaclientes = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        atualizaTabelaCliente();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtData_nascimento = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JLabel();
        btnNovo = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel1.setText("ID");

        txtId.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel2.setText("Nome");

        txtNome.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel3.setText("Endereço");

        txtEndereco.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Telefone");

        txtTelefone.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Data Nascimento");

        txtData_nascimento.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Novo.png"))); // NOI18N
        btnNovo.setText("Novo");

        btnAlterar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        btnExcluir.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel11.setText("Bairro");

        txtBairro.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        tblCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Telefone"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel12.setText("Numero");

        txtNumero.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnNovo)
                        .addGap(45, 45, 45)
                        .addComponent(btnSalvar)
                        .addGap(45, 45, 45)
                        .addComponent(btnAlterar)
                        .addGap(45, 45, 45)
                        .addComponent(btnExcluir)
                        .addGap(45, 45, 45)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtData_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBairro)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(0, 185, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtEndereco)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel11))
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void atualizaTabelaCliente(){
        cliente = new ClienteM();
        try {
            listaclientes = clientedao.ListaCliente();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }
        
        String dados[][] = new String[listaclientes.size()][6];
            int i = 0;
            for (ClienteM cliente : listaclientes) {
                dados[i][0] = String.valueOf(cliente.getId());
                dados[i][1] = cliente.getNome();
                dados[i][2] = cliente.getEndereco()+cliente.getNumero();
                dados[i][3] = cliente.getBairro();
                dados[i][4] = cliente.getTelefone();
                dados[i][5] = cliente.getData_nascimento();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Endereço", "Bairro", "Telefone","Nascimento"};
            DefaultTableModel tabelaCliente = new DefaultTableModel();
            tabelaCliente.setDataVector(dados, tituloColuna);
            tblCliente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCliente.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblCliente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblCliente.getColumnModel().getColumn(4).setCellRenderer(centralizado);
            tblCliente.getColumnModel().getColumn(5).setCellRenderer(centralizado);
            tblCliente.setRowHeight(25);
            tblCliente.updateUI();
    }
    
    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            txtNome.requestFocusInWindow();
        }else{
            cliente = new ClienteM();
            cliente.setNome(txtNome.getText());
            cliente.setEndereco(txtEndereco.getText());
            cliente.setNumero(txtNumero.getText());
            cliente.setBairro(txtBairro.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setData_nascimento(txtData_nascimento.getText());
            
            try {
                clientedao.salvar(cliente);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso.");
            atualizaTabelaCliente();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        cliente = new ClienteM();

        txtId.setText(tblCliente.getValueAt(tblCliente.getSelectedRow(),0).toString());
        String integer = txtId.getText();
        int id = Integer.parseInt(integer);
        cliente.setId(id);
        
        try{
            cliente = clientedao.busca(id);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }        
        tblCliente.getTableHeader().setReorderingAllowed(false);
        
        txtId.setText(Integer.toString(cliente.getId()));
        txtNome.setText(cliente.getNome());
        txtEndereco.setText(cliente.getEndereco());
        txtNumero.setText(cliente.getNumero());
        txtBairro.setText(cliente.getBairro());
        txtTelefone.setText(cliente.getTelefone());
        txtData_nascimento.setText(cliente.getData_nascimento());
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        if(txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "selecione um cliente");
        }else{
            cliente = new ClienteM();
            cliente.setId(Integer.parseInt(txtId.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir: \n"+txtNome.getText());
            if(confirma == 0){
                
                try {
                    clientedao.excluir(cliente);
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
                }
                atualizaTabelaCliente();
                limpaCampos();
            }
        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    
    public void limpaCampos(){
        txtId.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtTelefone.setText("");
        txtData_nascimento.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAlterar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnExcluir;
    private javax.swing.JLabel btnNovo;
    private javax.swing.JLabel btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtData_nascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
