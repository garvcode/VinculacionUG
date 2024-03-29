/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.Container;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import modelo.CursoEntity;

/**
 *
 * @author pc
 */
public class Registrar_Asistencia extends javax.swing.JFrame {

    /**
     * Creates new form Asistencia
     */
    public Registrar_Asistencia() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Asistencia de beneficiarios");
        JDateChooser jDateChooser3 = new JDateChooser();
        Calendar cal = Calendar.getInstance(); // Obtenemos una instancia de la fecha actual
        jDateChooser3.setDate(cal.getTime()); // Establecemos la fecha actual como fecha por defecto
        // Agregar el JDateChooser al JFrame
        Container contentPane = this.getContentPane();
        contentPane.add(jDateChooser3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Jbtn_guardar = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Asistencia = new javax.swing.JLabel();
        jCmbBMaterias = new javax.swing.JComboBox<>();
        Jbtn_editarCurso = new javax.swing.JButton();
        jLblRetroceder = new javax.swing.JLabel();
        Jbtn_BuscarAsistencia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Jbtn_ModificarAsis = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        Jbtn_GenerarReporteEnPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(228, 244, 251));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1350, 333));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Desde");

        Jbtn_guardar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Jbtn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save.png"))); // NOI18N
        Jbtn_guardar.setText("GUARDAR");
        Jbtn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_guardarActionPerformed(evt);
            }
        });

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Cursos:");

        Asistencia.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Asistencia.setText("REGISTRO DE ASISTENCIAS");

        jCmbBMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCmbBMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbBMateriasActionPerformed(evt);
            }
        });

        Jbtn_editarCurso.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Jbtn_editarCurso.setText("Editar Cursos");
        Jbtn_editarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jbtn_editarCursoMouseClicked(evt);
            }
        });
        Jbtn_editarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_editarCursoActionPerformed(evt);
            }
        });

        jLblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retroceso.png"))); // NOI18N

        Jbtn_BuscarAsistencia.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Jbtn_BuscarAsistencia.setText("Buscar");
        Jbtn_BuscarAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jbtn_BuscarAsistenciaMouseClicked(evt);
            }
        });
        Jbtn_BuscarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_BuscarAsistenciaActionPerformed(evt);
            }
        });

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        Jbtn_ModificarAsis.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Jbtn_ModificarAsis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        Jbtn_ModificarAsis.setText("ACTUALIZAR");
        Jbtn_ModificarAsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_ModificarAsisActionPerformed(evt);
            }
        });

        jDateChooser3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("hasta");

        Jbtn_GenerarReporteEnPdf.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Jbtn_GenerarReporteEnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf-icon.png"))); // NOI18N
        Jbtn_GenerarReporteEnPdf.setText("GENERAR REPORTES");
        Jbtn_GenerarReporteEnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_GenerarReporteEnPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLblRetroceder)
                        .addGap(348, 348, 348)
                        .addComponent(Asistencia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCmbBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jbtn_BuscarAsistencia)
                                .addGap(36, 36, 36)
                                .addComponent(Jbtn_editarCurso))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(Jbtn_guardar)
                                .addGap(83, 83, 83)
                                .addComponent(Jbtn_ModificarAsis)
                                .addGap(109, 109, 109)
                                .addComponent(Jbtn_GenerarReporteEnPdf)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLblRetroceder)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCmbBMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(Jbtn_BuscarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jbtn_editarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Asistencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_ModificarAsis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_GenerarReporteEnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_guardarActionPerformed

    }//GEN-LAST:event_Jbtn_guardarActionPerformed

    private void jCmbBMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbBMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbBMateriasActionPerformed

    private void Jbtn_editarCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jbtn_editarCursoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn_editarCursoMouseClicked

    private void Jbtn_editarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_editarCursoActionPerformed

    }//GEN-LAST:event_Jbtn_editarCursoActionPerformed

    private void Jbtn_BuscarAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jbtn_BuscarAsistenciaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn_BuscarAsistenciaMouseClicked

    private void Jbtn_BuscarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_BuscarAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn_BuscarAsistenciaActionPerformed

    private void Jbtn_ModificarAsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_ModificarAsisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn_ModificarAsisActionPerformed

    private void Jbtn_GenerarReporteEnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_GenerarReporteEnPdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jbtn_GenerarReporteEnPdfActionPerformed

 
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
            java.util.logging.Logger.getLogger(Registrar_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Asistencia().setVisible(true);
            }
        });
    }

    public JButton getJbtn_ModificarAsis() {
        return Jbtn_ModificarAsis;
    }

    public void setJbtn_ModificarAsis(JButton Jbtn_ModificarAsis) {
        this.Jbtn_ModificarAsis = Jbtn_ModificarAsis;
    }

    public JButton getJbtn_editarCurso() {
        return Jbtn_editarCurso;
    }

    public void setJbtn_editarCurso(JButton Jbtn_editarCurso) {
        this.Jbtn_editarCurso = Jbtn_editarCurso;
    }

    public JButton getJbtn_guardar() {
        return Jbtn_guardar;
    }

    public void setJbtn_guardar(JButton Jbtn_guardar) {
        this.Jbtn_guardar = Jbtn_guardar;
    }

    public JLabel getjLblRetroceder() {
        return jLblRetroceder;
    }

    public void setjLblRetroceder(JLabel jLblRetroceder) {
        this.jLblRetroceder = jLblRetroceder;
    }

    public JDateChooser getjDateChooser2() {
        return jDateChooser2;
    }

    public void setjDateChooser2(JDateChooser jDateChooser2) {
        this.jDateChooser2 = jDateChooser2;
    }

    public JButton getJbtn_BuscarAsistencia() {
        return Jbtn_BuscarAsistencia;
    }

    public void setJbtn_BuscarAsistencia(JButton Jbtn_BuscarAsistencia) {
        this.Jbtn_BuscarAsistencia = Jbtn_BuscarAsistencia;
    }

    public JButton getJbtn_GenerarReporteEnPdf() {
        return Jbtn_GenerarReporteEnPdf;
    }

    public void setJbtn_GenerarReporteEnPdf(JButton Jbtn_GenerarReporteEnPdf) {
        this.Jbtn_GenerarReporteEnPdf = Jbtn_GenerarReporteEnPdf;
    }

    public JComboBox<CursoEntity> getjCmbBMaterias() {
        return jCmbBMaterias;
    }

    public void setjCmbBMaterias(JComboBox<CursoEntity> jCmbBMaterias) {
        this.jCmbBMaterias = jCmbBMaterias;
    }

    public JDateChooser getjDateChooser3() {
        return jDateChooser3;
    }

    public void setjDateChooser3(JDateChooser jDateChooser3) {
        this.jDateChooser3 = jDateChooser3;
    }

  
    
    

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Asistencia;
    private javax.swing.JButton Jbtn_BuscarAsistencia;
    private javax.swing.JButton Jbtn_GenerarReporteEnPdf;
    private javax.swing.JButton Jbtn_ModificarAsis;
    private javax.swing.JButton Jbtn_editarCurso;
    private javax.swing.JButton Jbtn_guardar;
    public javax.swing.JComboBox<CursoEntity> jCmbBMaterias;
    public com.toedter.calendar.JDateChooser jDateChooser2;
    public com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblRetroceder;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
