package VIEW;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import DAO.Conexao;
import DAO.UsuarioDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import MODEL.UsuarioM;
import util.LimiteDigitos;

public class LoginView extends javax.swing.JFrame {

    UsuarioM usuario;
    UsuarioDAO usuarioDAO;
    Conexao conexao;

    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //erro.setVisible(false);
        this.tfdUsuario.requestFocus();
        usuario = new UsuarioM();
        usuarioDAO = new UsuarioDAO();
        tfdUsuario.setDocument(new LimiteDigitos(20));
        tfdSenha.setDocument(new LimiteDigitos(20));
        
        URL url = this.getClass().getResource("/VIEW/imagem/Icone.jpg");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        erro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBuLogin = new javax.swing.JButton();
        tfdSenha = new javax.swing.JPasswordField();
        tfdUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        erro.setForeground(new java.awt.Color(153, 0, 0));
        erro.setMaximumSize(new java.awt.Dimension(110, 39));
        erro.setMinimumSize(new java.awt.Dimension(110, 39));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 154, 193)));

        jBuLogin.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jBuLogin.setText("Entrar");
        jBuLogin.setMaximumSize(new java.awt.Dimension(110, 39));
        jBuLogin.setMinimumSize(new java.awt.Dimension(110, 39));
        jBuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuLoginActionPerformed(evt);
            }
        });
        jBuLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBuLoginKeyPressed(evt);
            }
        });

        tfdSenha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tfdSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdSenhaActionPerformed(evt);
            }
        });
        tfdSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdSenhaKeyPressed(evt);
            }
        });

        tfdUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tfdUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdUsuarioKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdUsuario)
                            .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(erro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfdSenha.requestFocusInWindow();
        }
    }//GEN-LAST:event_tfdUsuarioKeyPressed

    private void tfdSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            usuario = null;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (tfdUsuario.getText().isEmpty()) {
                   // erro.setText("O nome do usuario deve ser preechido");
                   // erro.setVisible(true);
                   JOptionPane.showMessageDialog(null, "O usuário deve ser preenchido", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    tfdUsuario.requestFocus();
                } else if (tfdSenha.getText().isEmpty()) {
                   // erro.setText("A senha deve ser preechida");
                   // erro.setVisible(true);
                   JOptionPane.showMessageDialog(null, "A senha deve ser preenchida", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    tfdSenha.requestFocus();
                } else {
                    usuario = usuarioDAO.valida(tfdUsuario.getText(), tfdSenha.getText());
                    if(usuario == null){
                        JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                        tfdUsuario.setText("");
                        tfdSenha.setText("");
                        tfdUsuario.requestFocus();
                    }else{
                        PrincipalView pv = new PrincipalView();
                        this.dispose();
                    }
                    
                    
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto", "Erro", JOptionPane.ERROR_MESSAGE);
                tfdUsuario.setText("");
                tfdSenha.setText("");
                tfdUsuario.requestFocus();

            }
        }
        }
    }//GEN-LAST:event_tfdSenhaKeyPressed

    private void jBuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuLoginActionPerformed
        usuario = null;
        try {
            if (tfdUsuario.getText().isEmpty()) {
                //erro.setText("O nome do usuario deve ser preechido");
                JOptionPane.showMessageDialog(null, "O usuário deve ser preenchido", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                tfdUsuario.requestFocus();

            } else if (tfdSenha.getText().isEmpty()) {
                //erro.setText("A senha deve ser preechido");
                //erro.setVisible(true);
                JOptionPane.showMessageDialog(null, "A senha deve ser preenchida", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                tfdSenha.requestFocus();
            } else {
                usuario = usuarioDAO.valida(tfdUsuario.getText(), tfdSenha.getText());
                if(usuario == null){
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                    tfdUsuario.setText("");
                    tfdSenha.setText("");
                    tfdUsuario.requestFocus();
                }else{
                    PrincipalView pv = new PrincipalView();
                    
                    this.dispose();
                    
                }
                
                //this.dispose();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
            tfdUsuario.setText("");
            tfdSenha.setText("");
            tfdUsuario.requestFocus();
            ex.printStackTrace();
            
        }
    }//GEN-LAST:event_jBuLoginActionPerformed

    private void jBuLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuLoginKeyPressed
        
    }//GEN-LAST:event_jBuLoginKeyPressed

    private void tfdSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdSenhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel erro;
    private javax.swing.JButton jBuLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField tfdSenha;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
