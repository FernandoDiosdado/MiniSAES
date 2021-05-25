/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
/**
 *
 * @author lufer
 */

import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaPerfilAlumno extends JFrame{
    
    JTable table;
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
               TablaPerfilAlumno form = new TablaPerfilAlumno();
               form.setVisible(true);;
            }
        });

    }

    public TablaPerfilAlumno() {
    }

    public TablaPerfilAlumno(Alumno a, String grado)
    {
        table = new JTable();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, 
                new String[]{"Materia","1°","2°","3°","4°","5°","Final"})
        {
            @Override
            public boolean isCellEditable(int row, int col){
                return (false);//cualquier numero que no esté en las columnas
            }
        };
     
        table.setModel(model);
        table.setCellSelectionEnabled(false);

        ArrayList<Calificacion> cal = a.consultarMisCalificaciones(grado);
        for(int i=0;i<cal.size();i++)
        {
            model.addRow(new Object[0]);
            model.setValueAt(cal.get(i).getNom_materia(), i, 0);
            model.setValueAt(cal.get(i).getParcial1(), i, 1);
            model.setValueAt(cal.get(i).getParcial2(), i, 2);
            model.setValueAt(cal.get(i).getParcial3(), i, 3);
            model.setValueAt(cal.get(i).getParcial4(), i, 4);
            model.setValueAt(cal.get(i).getParcial2(), i, 5);
            model.setValueAt(cal.get(i).getCalif_final(), i, 6);
        }
            
    }

}
