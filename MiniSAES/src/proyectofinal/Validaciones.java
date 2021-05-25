/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author lufer
 */
public class Validaciones {
   
    /*public static boolean validarAdmin(String a, String b)
    {
        if((a=="admin")&&(b=="1234")){return true;}return false;
    }*/
    
   public static boolean validarLlenado(String... args){
       //palabras no permitidas
       String[] palabrasP ={"Nombres","Apellido paterno","Apellido materno",
           "Edad","CURP","RFC","Contraseña","Confirma contraseña"};
       //recorre args
       for (String dato : args) {
           for (String pp : palabrasP) {
               if (dato.equalsIgnoreCase(pp)) {
                   JOptionPane.showMessageDialog(null,"Campos vacios");
                   return false;
               }
           }
       }
       return true;
   }
   
   public static boolean validarContrasena(String c, String cc){
       if (c.equals(cc)) {
           return true;
       }else{
           JOptionPane.showMessageDialog(null,"Contraseñas distintas");
           return false;
       }
   }
   
   public static void setPlaceholder(javax.swing.JTextField tj, String ph){
       //si está inactivo y coloco el cursor 
       if(tj.getText().equals(ph))
        {
            tj.setText("");
            tj.setForeground(new Color(0,0,0));
        }//si está activo y quito el cursor
        else if(tj.getText().equals(""))
        {
            tj.setText(ph);      
            tj.setForeground(new Color(155,155,155));
        }
    }
   //sirve cuando hay un error en el ingreso de dato, delvuelve los placeholder
    public static void errorPlaceholder(javax.swing.JTextField tj, String ph){
       tj.setForeground(new Color(155,155,155));
       tj.setText(ph);
    }
    
    //activacion de boton
    public static void setEstadoBoton(JButton button, int registros){
        if(registros==1){
            button.setEnabled(true);
        }else{
            button.setEnabled(false);
        }
    }
    
}
