/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.AssistenciaDAO;
import DAO.ClienteDAO;
import MODEL.AssistenciaM;
import MODEL.ClienteM;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import util.LimiteDigitos;

/**
 *
 * @author NUPSI 04
 */
public class AssistenciaView extends javax.swing.JFrame {

    ClienteM cliente;
    AssistenciaM assistencia;
    
    ClienteDAO clientedao;
    AssistenciaDAO assistenciadao;
    
    List<ClienteM> listaclientes;
    List<AssistenciaM> listaassistencia;
    public AssistenciaView( int IDclienteDOassistente) {
        initComponents();
        this.setLocationRelativeTo(null);
        clientedao = new ClienteDAO();
        assistenciadao = new AssistenciaDAO();
        listaclientes = new ArrayList<>();
        listaassistencia = new ArrayList<>();
        atualizaTabelaCliente();
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtBusca.setDocument(new LimiteDigitos(90));
        if(0!= IDclienteDOassistente){setcliente(IDclienteDOassistente);}
        URL url = this.getClass().getResource("/VIEW/imagem/Icone.jpg");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnBusca = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAssistencia = new javax.swing.JTable();
        btnNovo = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel1.setText("Busca Cliente");

        txtBusca.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        txtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaKeyPressed(evt);
            }
        });

        tblCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        btnBusca.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/search.png"))); // NOI18N
        btnBusca.setText("Busca");
        btnBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBuscaMouseReleased(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Limpar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBusca)
                                .addGap(18, 18, 18)
                                .addComponent(btnBusca)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        tblAssistencia.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tblAssistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Quadro", "Data"
            }
        ));
        tblAssistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAssistenciaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAssistencia);

        btnNovo.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNovoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNovoMouseReleased(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlterarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlterarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlterarMouseReleased(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcluirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExcluirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExcluirMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addGap(78, 78, 78)
                        .addComponent(btnExcluir)
                        .addGap(33, 33, 33)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listaclientes = null;
            if(txtBusca.getText().equals("") )
            {
                JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
                atualizaTabelaCliente();
            }
            else
            {
                try{

                    listaclientes = clientedao.buscaCliente(txtBusca.getText());
                    if(listaclientes == null){

                        JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                        atualizaTabelaCliente();

                    }else{
                        atualizaTabelaBusca();

                    }
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_txtBuscaKeyPressed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        listaassistencia = null;
        try{

            listaassistencia = assistenciadao.buscaAssistencia(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString());
            if(listaassistencia == null){
                listaassistencia = assistenciadao.buscaListaVazia();
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                atualizaTabelaAssistencia();
            }else{
                atualizaTabelaAssistencia();
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscaMouseClicked
        listaclientes = null;
        if(txtBusca.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
            atualizaTabelaCliente();
        }
        else
        {
            try{

                listaclientes = clientedao.buscaCliente(txtBusca.getText());
                if(listaclientes == null){

                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    atualizaTabelaCliente();

                }else{
                    atualizaTabelaBusca();

                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnBuscaMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        tblCliente.clearSelection();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void tblAssistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAssistenciaMouseClicked
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tblAssistenciaMouseClicked

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        assistencia = new AssistenciaM();

        Assistencia_ClienteView assis_cliente = new Assistencia_ClienteView(Integer.valueOf(tblCliente.getValueAt(tblCliente.getSelectedRow(),0).toString()),tblCliente.getValueAt(tblCliente.getSelectedRow(),1).toString(), 1);
        this.dispose();
    }//GEN-LAST:event_btnNovoMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked
        assistencia = new AssistenciaM();

        Assistencia_ClienteView assis_cliente = new Assistencia_ClienteView(Integer.valueOf(tblAssistencia.getValueAt(tblAssistencia.getSelectedRow(),0).toString()),tblCliente.getValueAt(tblCliente.getSelectedRow(),1).toString(), 2);
        this.dispose();
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        assistencia = new AssistenciaM();
        assistencia.setId(Integer.valueOf(tblAssistencia.getValueAt(tblAssistencia.getSelectedRow(), 0).toString()));
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir:"
            +"\n Cliente: "+tblCliente.getValueAt(tblCliente.getSelectedRow(), 1).toString()
            +"\n Data: "+tblAssistencia.getValueAt(tblAssistencia.getSelectedRow(), 2).toString());
        if(confirma == 0){

            try {
                assistenciadao.excluir(assistencia);
                listaassistencia = assistenciadao.buscaAssistencia(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString());
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            atualizaTabelaAssistencia();
        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        tblAssistencia.clearSelection();
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        atualizaTabelaCliente();
        txtBusca.setText("");
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnBuscaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscaMouseEntered
        btnBusca.setForeground(Color.GRAY);
    }//GEN-LAST:event_btnBuscaMouseEntered

    private void btnBuscaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscaMouseExited
        btnBusca.setForeground(Color.black);
    }//GEN-LAST:event_btnBuscaMouseExited

    private void btnBuscaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscaMousePressed
        btnBusca.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnBuscaMousePressed

    private void btnBuscaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscaMouseReleased
        btnBusca.setForeground(Color.black);
    }//GEN-LAST:event_btnBuscaMouseReleased

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setForeground(Color.GRAY);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setForeground(Color.black);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        btnCancelar.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        btnCancelar.setForeground(Color.black);
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void btnNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseEntered
        btnNovo.setForeground(Color.gray);
    }//GEN-LAST:event_btnNovoMouseEntered

    private void btnNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseExited
        btnNovo.setForeground(Color.black);
    }//GEN-LAST:event_btnNovoMouseExited

    private void btnNovoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMousePressed
        btnNovo.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnNovoMousePressed

    private void btnNovoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseReleased
        btnNovo.setForeground(Color.black);
    }//GEN-LAST:event_btnNovoMouseReleased

    private void btnAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseEntered
        btnAlterar.setForeground(Color.gray);
    }//GEN-LAST:event_btnAlterarMouseEntered

    private void btnAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseExited
        btnAlterar.setForeground(Color.black);
    }//GEN-LAST:event_btnAlterarMouseExited

    private void btnAlterarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseReleased
        btnAlterar.setForeground(Color.black);
    }//GEN-LAST:event_btnAlterarMouseReleased

    private void btnAlterarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMousePressed
        btnAlterar.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnAlterarMousePressed

    private void btnExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseEntered
        btnExcluir.setForeground(Color.gray);
    }//GEN-LAST:event_btnExcluirMouseEntered

    private void btnExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseExited
        btnExcluir.setForeground(Color.black);
    }//GEN-LAST:event_btnExcluirMouseExited

    private void btnExcluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseReleased
        btnExcluir.setForeground(Color.black);
    }//GEN-LAST:event_btnExcluirMouseReleased

    private void btnExcluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMousePressed
        btnExcluir.setForeground(Color.lightGray);
    }//GEN-LAST:event_btnExcluirMousePressed
 public void atualizaTabelaCliente(){
        cliente = new ClienteM();
        try {
            listaclientes = clientedao.ListaCliente();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }
        
        String dados[][] = new String[listaclientes.size()][3];
            int i = 0;
            for (ClienteM cliente : listaclientes) {
                dados[i][0] = String.valueOf(cliente.getId());
                dados[i][1] = cliente.getNome();
                dados[i][2] = cliente.getEndereco();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Endereço"};
            DefaultTableModel tabelaCliente = new DefaultTableModel();
            tabelaCliente.setDataVector(dados, tituloColuna);
            tblCliente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
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
            tblCliente.setRowHeight(25);
            tblCliente.updateUI();
    }
    public void atualizaTabelaBusca(){
        cliente = new ClienteM();
        
        String dados[][] = new String[listaclientes.size()][3];
            int i = 0;
            for (ClienteM cliente : listaclientes) {
                dados[i][0] = String.valueOf(cliente.getId());
                dados[i][1] = cliente.getNome();
                dados[i][2] = cliente.getEndereco();
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Endereço"};
            DefaultTableModel tabelaCliente = new DefaultTableModel();
            tabelaCliente.setDataVector(dados, tituloColuna);
            tblCliente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
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
            tblCliente.setRowHeight(25);
            tblCliente.updateUI();
    }
    
    public void atualizaTabelaAssistencia(){
        
        String dados[][] = new String[listaassistencia.size()][3];
            int i = 0;
            for (AssistenciaM assistencia : listaassistencia) {
                dados[i][0] = String.valueOf(assistencia.getId());
                dados[i][1] = assistencia.getQuadro_acontecido();
                dados[i][2] = assistencia.getData_atendimento();
                i++;
            }
            String tituloColuna[] = {"ID", "Quadro","Data"};
            DefaultTableModel tabelaCliente = new DefaultTableModel();
            tabelaCliente.setDataVector(dados, tituloColuna);
            tblAssistencia.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblAssistencia.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblAssistencia.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblAssistencia.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblAssistencia.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblAssistencia.getColumnModel().getColumn(2).setCellRenderer(centralizado);
            tblAssistencia.setRowHeight(25);
            tblAssistencia.updateUI();
    }
    public void setcliente(int id){

        try {
            cliente = clientedao.busca(id);
            listaclientes = clientedao.buscaCliente(cliente.getNome());
        } catch (SQLException ex) {
            Logger.getLogger(AssistenciaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTabelaBusca();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAlterar;
    private javax.swing.JLabel btnBusca;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnExcluir;
    private javax.swing.JLabel btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAssistencia;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
