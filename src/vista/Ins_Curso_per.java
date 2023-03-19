/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.DaoCurso;
import java.util.ArrayList;
import javax.swing.JButton;
import modelo.CursoEntity;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.DaoPadres;
import dao.DaoAsignacionCurso;
import javax.swing.JComboBox;
import modelo.AsignacionCurso;

/**
 *
 * @author steve
 */
public class Ins_Curso_per extends javax.swing.JFrame {

    ArrayList<Object[]> datos = new ArrayList<>();
    String COLUMCurso[] = {"Id", "Nombre","Estado","Dirigido"};
    DefaultTableModel modelocurso = new DefaultTableModel(COLUMCurso, 0);
    String nom_bene, ape_bene, nompapa, nommama;
    AsignacionCurso asignacion = new AsignacionCurso();
    
    
    /**
     * Creates new form Ins_Curso_per
     */
    public Ins_Curso_per() {
        initComponents();
        setLocationRelativeTo(null);        
        this.setResizable(false);
        setTitle("Regitro de curso");
        //llenarCursos();
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
        jLabel5 = new javax.swing.JLabel();
        jCmbNombre = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTblCurso = new javax.swing.JTable();
        jBttnGuardarCurso = new javax.swing.JButton();
        jLblRetroceder = new javax.swing.JLabel();
        jBttnBuscarCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(228, 244, 251));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setText("Registro de curso");

        jCmbNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Padre", "Madre" }));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Nombre:");

        jTblCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Estado", "Dirigido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTblCurso);

        jBttnGuardarCurso.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jBttnGuardarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verify.png"))); // NOI18N
        jBttnGuardarCurso.setText("Guardar");
        jBttnGuardarCurso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBttnGuardarCurso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBttnGuardarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnGuardarCursoActionPerformed(evt);
            }
        });

        jLblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retroceso.png"))); // NOI18N

        jBttnBuscarCurso.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jBttnGuardarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLblRetroceder)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(jCmbNombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jBttnBuscarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5))
                    .addComponent(jLblRetroceder))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCmbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnBuscarCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jBttnGuardarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBttnGuardarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnGuardarCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBttnGuardarCursoActionPerformed

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
            java.util.logging.Logger.getLogger(Ins_Curso_per.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ins_Curso_per.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ins_Curso_per.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ins_Curso_per.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ins_Curso_per().setVisible(true);
            }
        });
    }

    public JLabel getjLblRetroceder() {
        return jLblRetroceder;
    }

    public void setjLblRetroceder(JLabel jLblRetroceder) {
        this.jLblRetroceder = jLblRetroceder;
    }

    public JButton getjBttnGuardarCurso() {
        return jBttnGuardarCurso;
    }

    public void setjBttnGuardarCurso(JButton jBttnGuardarCurso) {
        this.jBttnGuardarCurso = jBttnGuardarCurso;
    }

    public JButton getjBttnBuscarCurso() {
        return jBttnBuscarCurso;
    }

    public void setjBttnBuscarCurso(JButton jBttnBuscarCurso) {
        this.jBttnBuscarCurso = jBttnBuscarCurso;
    }   

    public JComboBox getjCmbNombre() {
        return jCmbNombre;
    }

    public void setjCmbNombre(JComboBox jCmbNombre) {
        this.jCmbNombre = jCmbNombre;
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnBuscarCurso;
    private javax.swing.JButton jBttnGuardarCurso;
    private javax.swing.JComboBox jCmbNombre;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLblRetroceder;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTblCurso;
    // End of variables declaration//GEN-END:variables

    public void llenarDatoPadres(int idEdit, DefaultTableModel modelo) {
       
        nom_bene = (String) modelo.getValueAt(idEdit, 1);
        ape_bene = (String) modelo.getValueAt(idEdit, 2);
        nompapa = (String) modelo.getValueAt(idEdit, 3);
        nommama = (String) modelo.getValueAt(idEdit, 4);
//        if (nompapa.equals("Actualizar")&& nommama.equals("Actualizar") ){
//            jCmbNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Actualizar datos de padres"}));
//        }else if (nompapa.equals("Actualizar") ){
//            jCmbNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { nommama }));
//        } else if (nommama.equals("Actualizar") ){
//            jCmbNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { nompapa }));
//        } else {
            jCmbNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { nom_bene + ' ' + ape_bene ,nompapa, nommama }));
//        }
            
        
    }
    
    public void llenarCursos(int posicion) {
        DaoCurso daocurso = new DaoCurso();
        CursoEntity curso = new CursoEntity();
       
        this.datos = daocurso.consultar(posicion);
        modelocurso.setNumRows(0);
        for (Object[] daots : this.datos) {
            modelocurso.addRow(daots);
        }
        jTblCurso.setModel(modelocurso);        
    }
    
    
    public boolean verifiCurso() {
        boolean valor = false;
        int idEdit = jTblCurso.getSelectedRow();
        if (idEdit >= 0) {
            guardarAsistencia(idEdit,  modelocurso );
            valor = true;
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó un curso para ser ingresado");
        }
        return valor;
    }

    private void guardarAsistencia(int idEdit, DefaultTableModel modelocurso) {
        DaoPadres daopa = new DaoPadres();
        
        int numpa = daopa.obtenerNumPas(nom_bene, ape_bene);
        asignacion.setId_padre(numpa);
        asignacion.setId_curso((int) modelocurso.getValueAt(idEdit, 0));
        
        String parentesco = "";
        if (jCmbNombre.getSelectedItem().equals(nommama)) {
            parentesco = "mama";
        }else if (jCmbNombre.getSelectedItem().equals(nompapa)) {
            parentesco = "papa";
        }
        if (parentesco.equals("Actualizar datos de padres")){
            JOptionPane.showMessageDialog(null, "Actualice datos de los padres");
        }else{
            asignacion.setParentesco(parentesco);
            DaoAsignacionCurso daoasign = new DaoAsignacionCurso();
            daoasign.insertar(asignacion);
        }       
    }   
}
