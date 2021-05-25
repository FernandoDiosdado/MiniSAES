/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sound.sampled.*;
/**
 *
 * @author C_Leo
 */
public class RegistroAlumno extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAlumno
     */
    
    public RegistroAlumno() {
        initComponents();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        panelRegistroAlumno = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApP = new javax.swing.JTextField();
        txtApM = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabelTextoSexo = new javax.swing.JLabel();
        rdbtnMasculino = new javax.swing.JRadioButton();
        rdbtnFemenino = new javax.swing.JRadioButton();
        txtCurp = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JToggleButton();
        txtContrasena = new javax.swing.JPasswordField();
        txtConfContra = new javax.swing.JPasswordField();
        btnMostrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setUndecorated(true);

        panelRegistroAlumno.setBackground(new java.awt.Color(153, 153, 255));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REGISTRO ALUMNO");

        txtNombres.setForeground(new java.awt.Color(153, 153, 153));
        txtNombres.setText("Nombres");
        txtNombres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresFocusLost(evt);
            }
        });
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApP.setForeground(new java.awt.Color(153, 153, 153));
        txtApP.setText("Apellido paterno");
        txtApP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApPFocusLost(evt);
            }
        });
        txtApP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPActionPerformed(evt);
            }
        });
        txtApP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtApM.setForeground(new java.awt.Color(153, 153, 153));
        txtApM.setText("Apellido materno");
        txtApM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApMFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApMFocusLost(evt);
            }
        });
        txtApM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMActionPerformed(evt);
            }
        });
        txtApM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        txtEdad.setForeground(new java.awt.Color(153, 153, 153));
        txtEdad.setText("Edad");
        txtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEdadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEdadFocusLost(evt);
            }
        });
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabelTextoSexo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabelTextoSexo.setText("SEXO");

        rdbtnMasculino.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroupSexo.add(rdbtnMasculino);
        rdbtnMasculino.setText("Masculino");

        rdbtnFemenino.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroupSexo.add(rdbtnFemenino);
        rdbtnFemenino.setText("Femenino");

        txtCurp.setForeground(new java.awt.Color(153, 153, 153));
        txtCurp.setText("CURP");
        txtCurp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCurpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCurpFocusLost(evt);
            }
        });
        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 102));
        btnRegistrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRARME");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ojo.png"))); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/regresar.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRegistroAlumnoLayout = new javax.swing.GroupLayout(panelRegistroAlumno);
        panelRegistroAlumno.setLayout(panelRegistroAlumnoLayout);
        panelRegistroAlumnoLayout.setHorizontalGroup(
            panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroAlumnoLayout.createSequentialGroup()
                .addGroup(panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroAlumnoLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabelTextoSexo))
                    .addGroup(panelRegistroAlumnoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar)))
                .addGroup(panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, panelRegistroAlumnoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelTitulo)
                        .addGap(19, 19, 19))
                    .addGroup(panelRegistroAlumnoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRegistroAlumnoLayout.createSequentialGroup()
                                .addGroup(panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApP)
                                    .addComponent(txtApM, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(txtEdad)
                                    .addComponent(txtNombres))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCurp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRegistroAlumnoLayout.createSequentialGroup()
                                .addComponent(rdbtnMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(rdbtnFemenino))
                            .addComponent(txtContrasena)
                            .addComponent(txtConfContra))))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroAlumnoLayout.createSequentialGroup()
                        .addComponent(btnMostrar)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroAlumnoLayout.createSequentialGroup()
                        .addComponent(btnCerrar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroAlumnoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(170, 170, 170))
        );
        panelRegistroAlumnoLayout.setVerticalGroup(
            panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroAlumnoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnMasculino)
                    .addComponent(rdbtnFemenino)
                    .addComponent(jLabelTextoSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRegistroAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfContra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnRegistrar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistroAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistroAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtApMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApMActionPerformed
    //-------------en ese metodo está la lógica para registrar--------------------------
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        boolean registrar = true;
        //determinar el sexo del alumno/alumna
        char gen=' ';
        if(rdbtnMasculino.isSelected())
            {
                gen='M';
            }
            else if(rdbtnFemenino.isSelected())
            {
                gen='F';
            }else{
                registrar=false; //no eligió opción
        }
       
        //valida que los espacios no se hayan dejado sin llenar
        if(!Validaciones.validarLlenado(txtNombres.getText(),txtApP.getText(),txtApM.getText(),txtEdad.getText(),
               txtCurp.getText(),txtContrasena.getText(),txtConfContra.getText()))
            registrar=false; 
        
        //valida que las contraseñas coincidan
        if(!Validaciones.validarContrasena(txtContrasena.getText(),txtConfContra.getText())){
            registrar=false;
            Validaciones.errorPlaceholder(txtContrasena, "");
            Validaciones.errorPlaceholder(txtConfContra, "");   
        }
        //si no hubo ningun error pasa a registrar al usuario
        if(registrar){
            Alumno alumno = new Alumno(txtNombres.getText(),txtApP.getText(),txtApM.getText(),
                parseInt(txtEdad.getText()),gen,txtCurp.getText().toUpperCase(),txtContrasena.getText());//Mete los datos dentro de un objeto
            SentenciasSQL.registrar(alumno,"Alumno","curp");
            SentenciasSQL.asignarCalificaciones(alumno);
        
            InicioSesionAlumno al = new InicioSesionAlumno();
            al.setVisible(true);
            this.dispose();
        }
       
        
               
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusGained
        Validaciones.setPlaceholder(txtNombres,"Nombres");
    }//GEN-LAST:event_txtNombresFocusGained

    private void txtNombresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresFocusLost
        Validaciones.setPlaceholder(txtNombres,"Nombres");
    }//GEN-LAST:event_txtNombresFocusLost

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPActionPerformed

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpActionPerformed

    private void txtApPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApPFocusGained
        Validaciones.setPlaceholder(txtApP,"Apellido paterno");
    }//GEN-LAST:event_txtApPFocusGained

    private void txtApPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApPFocusLost
        Validaciones.setPlaceholder(txtApP,"Apellido paterno");
    }//GEN-LAST:event_txtApPFocusLost

    private void txtApMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApMFocusGained
        Validaciones.setPlaceholder(txtApM,"Apellido materno");
    }//GEN-LAST:event_txtApMFocusGained

    private void txtApMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApMFocusLost
        Validaciones.setPlaceholder(txtApM,"Apellido materno");
    }//GEN-LAST:event_txtApMFocusLost

    private void txtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusGained
        Validaciones.setPlaceholder(txtEdad,"Edad");
    }//GEN-LAST:event_txtEdadFocusGained

    private void txtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEdadFocusLost
        Validaciones.setPlaceholder(txtEdad,"Edad");
    }//GEN-LAST:event_txtEdadFocusLost

    private void txtCurpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCurpFocusGained
        Validaciones.setPlaceholder(txtCurp,"CURP");
    }//GEN-LAST:event_txtCurpFocusGained

    private void txtCurpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCurpFocusLost
        Validaciones.setPlaceholder(txtCurp,"CURP");
    }//GEN-LAST:event_txtCurpFocusLost

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if(txtContrasena.echoCharIsSet()){txtContrasena.setEchoChar((char)0);txtConfContra.setEchoChar((char)0);}
        else{txtContrasena.setEchoChar('*');txtConfContra.setEchoChar('*');}
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        try{Clip clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/media/Cerrar2.wav")));clip.start();}
        catch(Exception e){}
        JOptionPane.showMessageDialog(null,"HASTA LUEGO.","CERRAR",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        InicioSesionAlumno isa=new InicioSesionAlumno();
        isa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){evt.consume();}
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){evt.consume();}
    }//GEN-LAST:event_txtNombresKeyTyped

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
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JLabel jLabelTextoSexo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel panelRegistroAlumno;
    private javax.swing.JRadioButton rdbtnFemenino;
    private javax.swing.JRadioButton rdbtnMasculino;
    private javax.swing.JTextField txtApM;
    private javax.swing.JTextField txtApP;
    private javax.swing.JPasswordField txtConfContra;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

    
}
