/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.Editar;

import dao.DaoUsuario;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.Usuario;

/**
 *
 * @author nini2
 */
public class UsuEditar extends javax.swing.JFrame {

    Usuario usuario;
    Usuario usuNuevo;
    /**
     * Creates new form DatosPersonales
     */
    public UsuEditar() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Datos del usuario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtUsuario = new javax.swing.JTextField();
        jTxtContra = new javax.swing.JPasswordField();
        jBtn_Modificar = new javax.swing.JButton();
        jCmbTipo = new javax.swing.JComboBox();
        jCmbEstado = new javax.swing.JComboBox();
        jLblRetroceder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 244, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Estado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jTxtUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jTxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 82, 180, -1));

        jTxtContra.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jPanel1.add(jTxtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 118, 180, -1));

        jBtn_Modificar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jBtn_Modificar.setText("Guardar");
        jBtn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jCmbTipo.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jCmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selección", "Administrador", "Asistente" }));
        jPanel1.add(jCmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 154, 180, -1));

        jCmbEstado.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jCmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "true", "false" }));
        jCmbEstado.setToolTipText("");
        jPanel1.add(jCmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 189, 180, -1));

        jLblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retroceso.png"))); // NOI18N
        jPanel1.add(jLblRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjBtn_Modificar() {
        return jBtn_Modificar;
    }

    public void setjBtn_Modificar(JButton jBtn_Modificar) {
        this.jBtn_Modificar = jBtn_Modificar;
    }

    public JComboBox getjCmbEstado() {
        return jCmbEstado;
    }

    public void setjCmbEstado(JComboBox jCmbEstado) {
        this.jCmbEstado = jCmbEstado;
    }

    public JComboBox getjCmbTipo() {
        return jCmbTipo;
    }

    public void setjCmbTipo(JComboBox jCmbTipo) {
        this.jCmbTipo = jCmbTipo;
    }

    public JPasswordField getjTxtContra() {
        return jTxtContra;
    }

    public void setjTxtContra(JPasswordField jTxtContra) {
        this.jTxtContra = jTxtContra;
    }

    public JTextField getjTxtUsuario() {
        return jTxtUsuario;
    }

    public JLabel getjLblRetroceder() {
        return jLblRetroceder;
    }

    public void setjLblRetroceder(JLabel jLblRetroceder) {
        this.jLblRetroceder = jLblRetroceder;
    }

    public void setjTxtUsuario(JTextField jTxtUsuario) {
        this.jTxtUsuario = jTxtUsuario;
    }

    public boolean editarUsu(Usuario usu) {
        usuario = usu;
        boolean estado;
        String estadeestrean;
        String tipo; 
        boolean verif = false;
        
        
        
        tipo= (String) jCmbTipo.getSelectedItem();
        estadeestrean= (String) jCmbEstado.getSelectedItem();
        if (estadeestrean.equals("true")){
            estado = true;
        }else{
            estado= false;
        }
        
        if (jTxtUsuario.getText().equalsIgnoreCase(usuario.getNombre())&&
            jTxtContra.getText().equalsIgnoreCase(usuario.getPassword()) &&
            tipo == usuario.getTipo()&& estado== usuario.getEstado()){
            int opcion = JOptionPane.YES_NO_OPTION;
            JOptionPane.showMessageDialog(null,"Los datos son los mismos que estan registrados, si desea modificarlos debe cambiarlos. Quiere modificar los datos? ","Sistema" ,JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            if((jTxtUsuario.getText().equalsIgnoreCase("")) ||
              (jTxtContra.getText().equalsIgnoreCase(""))||
              (jCmbTipo.getSelectedIndex()==0)){
                JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios, agregar valores ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }else{
                nuevosDatosUsu(estado);
                DaoUsuario daousu= new  DaoUsuario();
                verif = daousu.modificar(usuNuevo);
//                if (verif==true) {
//                JOptionPane.showMessageDialog(null,"Los datos fueron modificados","Sistema" ,JOptionPane.PLAIN_MESSAGE);
//                vistEditarUsu.setVisible(false);
//                }else{
//                    JOptionPane.showMessageDialog(null, "Los datos no fueron modificados", "Error", JOptionPane.WARNING_MESSAGE);
//                }
            }
            
        }
        return verif;
    }

    private void nuevosDatosUsu(boolean valEstado) {
        usuNuevo = new Usuario();
        usuNuevo.setId(usuario.getId());
        usuNuevo.setNombre(jTxtUsuario.getText());
        usuNuevo.setPassword(jTxtContra.getText());
        usuNuevo.setEstado(valEstado);
        usuNuevo.setTipo((String) jCmbTipo.getSelectedItem());
    }
    
    private void jBtn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ModificarActionPerformed
//        verLista_Usuario();
//        this.setVisible(false);
    }//GEN-LAST:event_jBtn_ModificarActionPerformed

    private void jTxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtUsuarioActionPerformed

    public void verLista_Usuario(){
//        vista.List_Usuario btnIngresarMen = new vista.List_Usuario();
//        btnIngresarMen.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsuEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Modificar;
    private javax.swing.JComboBox jCmbEstado;
    private javax.swing.JComboBox jCmbTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTxtContra;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
