/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;
import DAO.AssistenciaDAO;
import MODEL.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.LimiteDigitos;


/**
 *
 * @author DANILO
 */
public class Assistencia_ClienteView extends javax.swing.JFrame {

    AssistenciaM assistencia;
    AssistenciaDAO assistenciadao;
    List<AssistenciaM> listaassistencia;
    int NumeroCliente;
    String NomeCliente;
    int Valor;
    public Assistencia_ClienteView(int Numero1, String Nome1, int Tipo1){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        assistenciadao = new AssistenciaDAO();
        listaassistencia = new ArrayList<>();
        NumeroCliente = Numero1;
        NomeCliente = Nome1;
        Valor = Tipo1;
        Setdados();
        desativaCampos();
        txtAtendente.setDocument(new LimiteDigitos(50));
        
        URL url = this.getClass().getResource("/VIEW/imagem/Icone.jpg");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        IDassistencia = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdassistencia = new javax.swing.JTextField();
        txtAtendente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDataAtendimento = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMedicamento = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuadroOcorrido = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        IDCliente = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Assistências");

        IDassistencia.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        IDassistencia.setText("ID");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setText("Atendente");

        txtIdassistencia.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        txtAtendente.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel2.setText("Nome do Cliente");

        btnSalvar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagem/Novo.png"))); // NOI18N
        jLabel8.setText("Limpar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Data atendimento");

        txtDataAtendimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtDataAtendimento.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 154, 193), 1, true));

        txtMedicamento.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jScrollPane2.setViewportView(txtMedicamento);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Quadro do Ocorrido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(10, 154, 193), 1, true));

        txtQuadroOcorrido.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(txtQuadroOcorrido);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel3.setText("Medicamento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtIdCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        IDCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        IDCliente.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)
                        .addComponent(btnSalvar)
                        .addGap(45, 45, 45)
                        .addComponent(btnCancelar)
                        .addGap(210, 210, 210))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IDassistencia)
                                            .addComponent(txtIdassistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IDCliente))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDassistencia)
                                .addGap(6, 6, 6)
                                .addComponent(txtIdassistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDCliente)
                                .addGap(6, 6, 6)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(txtAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(txtDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSalvar)
                                .addComponent(jLabel8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
    assistencia = new AssistenciaM();
    int confirma = JOptionPane.showConfirmDialog(null, "Deseja Salvar:");
        if(confirma == 0){
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            txtNome.requestFocusInWindow();
        }else if(txtIdassistencia.getText().isEmpty()){
            assistencia.setNome_cliente(Integer.valueOf(txtIdCliente.getText()));
            assistencia.setMedicamento(txtMedicamento.getText());
            assistencia.setData_atendimento(txtDataAtendimento.getText());
            assistencia.setQuadro_acontecido(txtQuadroOcorrido.getText());
            assistencia.setAtendente(txtAtendente.getText());
            
            try {
                assistenciadao.salvar(assistencia);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso.");
            desabilitaCampos();
        }else{
            assistencia.setId(Integer.parseInt(txtIdassistencia.getText()));
            assistencia.setNome_cliente(Integer.valueOf(txtIdCliente.getText()));
            assistencia.setMedicamento(txtMedicamento.getText());
            assistencia.setData_atendimento(txtDataAtendimento.getText());
            assistencia.setQuadro_acontecido(txtQuadroOcorrido.getText());
            assistencia.setAtendente(txtAtendente.getText());
            
            try {
                assistenciadao.Alterar(assistencia);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso.");
            desabilitaCampos();
            
        }}
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        limpaCampos();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

 
    public void Setdados(){
        assistencia = new AssistenciaM();
        if(Valor == 1){
        txtIdCliente.setText(Integer.toString(NumeroCliente));
        txtNome.setText(NomeCliente);
        txtDataAtendimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
        }else if(Valor == 2){
            try {
                assistencia = assistenciadao.busca(NumeroCliente);
            } catch (SQLException ex) {
                Logger.getLogger(Assistencia_ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtIdassistencia.setText(Integer.toString(assistencia.getId()));
            txtIdCliente.setText(Integer.toString(assistencia.getNome_cliente()));
            txtNome.setText(NomeCliente);
            txtMedicamento.setText(assistencia.getMedicamento());
            txtDataAtendimento.setText(assistencia.getData_atendimento());
            txtQuadroOcorrido.setText(assistencia.getQuadro_acontecido());
            txtAtendente.setText(assistencia.getAtendente());
        }else{
            JOptionPane.showMessageDialog(null, "Tem algo errado");
        }
    }
    
    public void limpaCampos(){
        txtAtendente.setText("");
        txtMedicamento.setText("");
        txtQuadroOcorrido.setText("");
    }
    
    public void ativaCampos(){
        txtAtendente.setEnabled(true);
        txtDataAtendimento.setEnabled(true);
        txtMedicamento.setEnabled(true);
        txtQuadroOcorrido.setEnabled(true);
    }
    
    public void desabilitaCampos(){
        txtNome.setEnabled(false);
        txtAtendente.setEnabled(false);
        txtMedicamento.setEnabled(false);
        txtQuadroOcorrido.setEnabled(false);
    }
    
    public void desativaCampos(){
        IDassistencia.setVisible(false);
        txtIdassistencia.setVisible(false);
        IDCliente.setVisible(false);
        txtIdCliente.setVisible(false);
        txtDataAtendimento.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDCliente;
    private javax.swing.JLabel IDassistencia;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAtendente;
    private javax.swing.JFormattedTextField txtDataAtendimento;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdassistencia;
    private javax.swing.JTextPane txtMedicamento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextPane txtQuadroOcorrido;
    // End of variables declaration//GEN-END:variables
}
