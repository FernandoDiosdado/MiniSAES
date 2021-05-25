/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.sound.sampled.*;
/**
 *
 * @author C_Leo
 */
public class InicioSesionProfesor extends javax.swing.JFrame {
    /**
     * Creates new form InicioSesionProf
     */
    public InicioSesionProfesor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicioSesionProfesor = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelInicioSesionProfesor.setBackground(new java.awt.Color(153, 153, 255));

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Inicio Sesión Profesor");

        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("RFC");
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(0, 0, 153));
        btnIniciar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR SESIÓN");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnRegistro.setBackground(new java.awt.Color(0, 0, 153));
        btnRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("REGISTRARME");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Perfil-P.png"))); // NOI18N

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

        txtContrasena.setPreferredSize(new java.awt.Dimension(26, 20));

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/ojo.png"))); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInicioSesionProfesorLayout = new javax.swing.GroupLayout(panelInicioSesionProfesor);
        panelInicioSesionProfesor.setLayout(panelInicioSesionProfesorLayout);
        panelInicioSesionProfesorLayout.setHorizontalGroup(
            panelInicioSesionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioSesionProfesorLayout.createSequentialGroup()
                .addGroup(panelInicioSesionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioSesionProfesorLayout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addGroup(panelInicioSesionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnMostrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioSesionProfesorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        panelInicioSesionProfesorLayout.setVerticalGroup(
            panelInicioSesionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioSesionProfesorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelInicioSesionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar)
                    .addComponent(btnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInicioSesionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addGap(11, 11, 11)
                .addComponent(btnIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistro)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInicioSesionProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInicioSesionProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        Validaciones.setPlaceholder(txtUsuario,"RFC");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        Validaciones.setPlaceholder(txtUsuario,"RFC");
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed
    //Ejecuta las Valadaciones y SentenciasSQL, si no hay false inicia sesión en PerfilProfesor
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        boolean iniciar = true; //variable para checar validaciones
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        //si la validacion es falsa lo guarda en la variable booleana iniciar
        if(iniciar=Validaciones.validarLlenado(usuario,contrasena))//saber si llenaron los campos
            if(iniciar=SentenciasSQL.comprobarUsuario(usuario,"Profesor","rfc"))//saber si el usuario existe
                iniciar=SentenciasSQL.comprobarContraseña(usuario,"Profesor","rfc",contrasena); //comprobar que ingresó bien su contrasena
        //si la variable sigue true Ventana Perfil Alumno
        if(iniciar){
            JOptionPane.showMessageDialog(null,"Bienvenido");
            //IMPORTANTE: crea una ventana y recibe un dato de tipo Alumno
            PerfilProfesor perfil = new PerfilProfesor(SentenciasSQL.consultarProfesor(usuario));
            perfil.setVisible(true);
            this.dispose();
        }else{
            Validaciones.errorPlaceholder(txtUsuario, "RFC"); //restablece los placeholder
            Validaciones.errorPlaceholder(txtContrasena, "");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed
    //Ventana Registrar Alumno
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        RegistroProfesor prof = new RegistroProfesor();
        prof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        try{Clip clip=AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/media/Cerrar2.wav")));clip.start();}
        catch(Exception e){}
        JOptionPane.showMessageDialog(null,"HASTA LUEGO.","CERRAR",JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio inicio=new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if(txtContrasena.echoCharIsSet()){txtContrasena.setEchoChar((char)0);}
        else{txtContrasena.setEchoChar('*');}
    }//GEN-LAST:event_btnMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesionProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesionProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesionProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesionProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesionProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel panelInicioSesionProfesor;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    
}
