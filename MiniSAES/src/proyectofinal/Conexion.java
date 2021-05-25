/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author C_Leo
 */
public class Conexion {

    Connection cn = null;

    public Connection Entrar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=ProyectoFinal;IntegratedSecurity = true;");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex);
        }
        return cn;
    }

}
