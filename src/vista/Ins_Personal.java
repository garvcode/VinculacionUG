/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JDateChooser;
import modelo.Reg_Benf;
import java.util.Date;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



/**
 *
 * @author steve
 */
public class Ins_Personal extends javax.swing.JFrame {

    /**
     * Creates new form Ins_Personal
     */
    public Ins_Personal() {
        initComponents();
        this.Btg_problemaSalud.add(JRB_si);
        this.Btg_problemaSalud.add(JRB_no);
        setTitle("Datos del Beneficiario ");
        setLocationRelativeTo(null);        
        this.setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btg_problemaSalud = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Jtf_Apellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jtf_Nombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Jtf_Cedula = new javax.swing.JTextField();
        Jcb_Religion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Jtf_Correo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JDC_fechanac = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Jtf_edad = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        JRB_si = new javax.swing.JRadioButton();
        JRB_no = new javax.swing.JRadioButton();
        Jbtn_datoEconomicos = new javax.swing.JButton();
        Jtf_Dir = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Jtf_benf_convencional = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        Jtf_benf_celular = new javax.swing.JTextField();
        jLblRetroceder = new javax.swing.JLabel();
        jLabImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 2000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(228, 244, 251));
        jPanel3.setPreferredSize(new java.awt.Dimension(1350, 2800));

        Jtf_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_ApellidosActionPerformed(evt);
            }
        });
        Jtf_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_ApellidosKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Apellidos:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("Nombres:");

        Jtf_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_NombresActionPerformed(evt);
            }
        });
        Jtf_Nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_NombresKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Cédula:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("Religión:");

        Jtf_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_CedulaActionPerformed(evt);
            }
        });

        Jcb_Religion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cristiano", "Católico", "Ateo", "Testigo de Jehová" }));
        Jcb_Religion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcb_ReligionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("Fecha de nacimiento:");

        Jtf_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_CorreoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel12.setText("Datos del beneficiario ");

        JDC_fechanac.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel26.setText("Correo:");

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel29.setText("Edad:");

        Jtf_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_edadActionPerformed(evt);
            }
        });
        Jtf_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_edadKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel30.setText("Discapacidad:");

        JRB_si.setBackground(new java.awt.Color(228, 244, 251));
        Btg_problemaSalud.add(JRB_si);
        JRB_si.setText("Si");
        JRB_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRB_siActionPerformed(evt);
            }
        });

        JRB_no.setBackground(new java.awt.Color(228, 244, 251));
        Btg_problemaSalud.add(JRB_no);
        JRB_no.setText("No");

        Jbtn_datoEconomicos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jbtn_datoEconomicos.setText("Siguiente");
        Jbtn_datoEconomicos.setFocusable(false);
        Jbtn_datoEconomicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbtn_datoEconomicos.setPreferredSize(new java.awt.Dimension(193, 25));
        Jbtn_datoEconomicos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Jbtn_datoEconomicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_datoEconomicosActionPerformed(evt);
            }
        });

        Jtf_Dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_DirActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Dirección:");

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel27.setText("Convivientes:");

        Jtf_benf_convencional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_benf_convencionalActionPerformed(evt);
            }
        });
        Jtf_benf_convencional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jtf_benf_convencionalKeyTyped(evt);
            }
        });

        jLabelCelular.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelCelular.setText("Celular:");

        Jtf_benf_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtf_benf_celularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel26))
                                    .addComponent(jLabelCelular))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(34, 34, 34))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Jtf_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JDC_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jtf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Jtf_Dir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                            .addComponent(Jtf_Correo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jcb_Religion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(JRB_si)
                                .addGap(18, 18, 18)
                                .addComponent(JRB_no)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Jtf_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(Jtf_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Jtf_benf_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jtf_benf_convencional, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 489, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(468, 468, 468))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addComponent(Jbtn_datoEconomicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel12)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Jtf_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jtf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)))
                    .addComponent(JDC_fechanac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtf_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(Jtf_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtf_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel9)
                    .addComponent(Jcb_Religion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtf_Dir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(JRB_si)
                    .addComponent(JRB_no)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCelular)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Jtf_benf_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)
                        .addComponent(Jtf_benf_convencional, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Jbtn_datoEconomicos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 1210, 480));

        jLblRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retroceso.png"))); // NOI18N
        jPanel1.add(jLblRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jLabImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buenpastor.jpg"))); // NOI18N
        jPanel1.add(jLabImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JRB_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRB_siActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRB_siActionPerformed

    private void Jtf_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_edadActionPerformed

    private void Jtf_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_CorreoActionPerformed

    private void Jtf_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_CedulaActionPerformed

    private void Jtf_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_NombresActionPerformed

    private void Jtf_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_ApellidosActionPerformed

    private void Jbtn_datoEconomicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_datoEconomicosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Jbtn_datoEconomicosActionPerformed

    private void Jtf_DirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_DirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_DirActionPerformed

    private void Jcb_ReligionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcb_ReligionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jcb_ReligionActionPerformed

    private void Jtf_benf_convencionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_benf_convencionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_benf_convencionalActionPerformed

    private void Jtf_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_edadKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar unicamente numeros");
        }
    }//GEN-LAST:event_Jtf_edadKeyTyped

    private void Jtf_benf_convencionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_benf_convencionalKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar unicamente numeros");
        }
    }//GEN-LAST:event_Jtf_benf_convencionalKeyTyped

    private void Jtf_NombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_NombresKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar unicamente letras");
        }
    }//GEN-LAST:event_Jtf_NombresKeyTyped

    private void Jtf_ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jtf_ApellidosKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar unicamente letras");
        }
    }//GEN-LAST:event_Jtf_ApellidosKeyTyped

    private void Jtf_benf_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtf_benf_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtf_benf_celularActionPerformed
      
//    public void inscribirNavegacion(){
//        Ins_Curso_per btncurso = new Ins_Curso_per();
//        btncurso.setVisible(true);
//        
//    }
    
    public void registro(){
        Reg_Benf reg = new Reg_Benf();
        //Datos del beneficiario
        reg.setBen_nom(Jtf_Nombres.getText());
        reg.setBen_ape(Jtf_Apellidos.getText());
        reg.setBen_dir(Jtf_Dir.getText());
        reg.setBen_ced(Jtf_Cedula.getText());
        reg.setBen_edad(Integer.parseInt(Jtf_edad.getText()));
        reg.setBen_relig(Jcb_Religion.getSelectedItem().toString());
        reg.setBen_email(Jtf_Correo.getText());
        reg.setBen_fechanac(JDC_fechanac.getDate());
        reg.setBen_cel(Jtf_benf_celular.getText());
        reg.setBen_convivientes(Integer.parseInt(Jtf_benf_convencional.getText()));
        reg.setBen_promsal(prob_salud());
        //Llaves
        reg.setId_benf(1);
        reg.setId_padres(1);
        reg.setId_escu(1);
        reg.setId_socioec(1);
        //prueba de captacion de datos
        reg.mostrarDato();

    }
    public String prob_salud(){
        String problema = " ";
        if(JRB_si.isSelected()){
            problema = "SI";}
        else if(JRB_no.isSelected()){
            problema = "NO";}
        return problema;
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
            java.util.logging.Logger.getLogger(Ins_Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ins_Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ins_Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ins_Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ins_Personal().setVisible(true);
                
            }
        });
    } 

    

    public JButton getJbtn_datoEconomicos() {
        return Jbtn_datoEconomicos;
    }

    public void setJbtn_datoEconomicos(JButton Jbtn_datoEconomicos) {
        this.Jbtn_datoEconomicos = Jbtn_datoEconomicos;
    }

    public JLabel getjLblRetroceder() {
        return jLblRetroceder;
    }

    public void setjLblRetroceder(JLabel jLblRetroceder) {
        this.jLblRetroceder = jLblRetroceder;
    }

    

    

    public JDateChooser getJDC_fechanac() {
        return JDC_fechanac;
    }

    public void setJDC_fechanac(JDateChooser JDC_fechanac) {
        this.JDC_fechanac = JDC_fechanac;
    }

    public JRadioButton getJRB_no() {
        return JRB_no;
    }

    public void setJRB_no(JRadioButton JRB_no) {
        this.JRB_no = JRB_no;
    }

    public JRadioButton getJRB_si() {
        return JRB_si;
    }

    public void setJRB_si(JRadioButton JRB_si) {
        this.JRB_si = JRB_si;
    }

    public JComboBox<String> getJcb_Religion() {
        return Jcb_Religion;
    }

    public void setJcb_Religion(JComboBox<String> Jcb_Religion) {
        this.Jcb_Religion = Jcb_Religion;
    }

    public JTextField getJtf_Apellidos() {
        return Jtf_Apellidos;
    }

    public void setJtf_Apellidos(JTextField Jtf_Apellidos) {
        this.Jtf_Apellidos = Jtf_Apellidos;
    }

    public JTextField getJtf_Cedula() {
        return Jtf_Cedula;
    }

    public void setJtf_Cedula(JTextField Jtf_Cedula) {
        this.Jtf_Cedula = Jtf_Cedula;
    }

    public JTextField getJtf_Correo() {
        return Jtf_Correo;
    }

    public void setJtf_Correo(JTextField Jtf_Correo) {
        this.Jtf_Correo = Jtf_Correo;
    }

    public JTextField getJtf_Dir() {
        return Jtf_Dir;
    }

    public void setJtf_Dir(JTextField Jtf_Dir) {
        this.Jtf_Dir = Jtf_Dir;
    }

    public JTextField getJtf_Nombres() {
        return Jtf_Nombres;
    }

    public void setJtf_Nombres(JTextField Jtf_Nombres) {
        this.Jtf_Nombres = Jtf_Nombres;
    }

    public JTextField getJtf_benf_celular() {
        return Jtf_benf_celular;
    }

    public void setJtf_benf_celular(JTextField Jtf_benf_celular) {
        this.Jtf_benf_celular = Jtf_benf_celular;
    }

    public JTextField getJtf_benf_convencional() {
        return Jtf_benf_convencional;
    }

    public void setJtf_benf_convencional(JTextField Jtf_benf_convencional) {
        this.Jtf_benf_convencional = Jtf_benf_convencional;
    }

    public JTextField getJtf_edad() {
        return Jtf_edad;
    }

    public void setJtf_edad(JTextField Jtf_edad) {
        this.Jtf_edad = Jtf_edad;
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Btg_problemaSalud;
    private com.toedter.calendar.JDateChooser JDC_fechanac;
    private javax.swing.JRadioButton JRB_no;
    private javax.swing.JRadioButton JRB_si;
    private javax.swing.JButton Jbtn_datoEconomicos;
    private javax.swing.JComboBox<String> Jcb_Religion;
    private javax.swing.JTextField Jtf_Apellidos;
    private javax.swing.JTextField Jtf_Cedula;
    private javax.swing.JTextField Jtf_Correo;
    private javax.swing.JTextField Jtf_Dir;
    private javax.swing.JTextField Jtf_Nombres;
    private javax.swing.JTextField Jtf_benf_celular;
    private javax.swing.JTextField Jtf_benf_convencional;
    private javax.swing.JTextField Jtf_edad;
    private javax.swing.JLabel jLabImagen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLblRetroceder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
