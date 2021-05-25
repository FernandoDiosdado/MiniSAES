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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static proyectofinal.SentenciasSQL.sentencia;


public class TablaAdminAlumno extends JFrame{
    
    JTable table;
    TableRowSorter rowSorter;
    DefaultTableModel model ;
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
               TablaAdminAlumno form = new TablaAdminAlumno();
                 
               form.setVisible(true);;
               
            }
        });

    }

    public TablaAdminAlumno() {
       
    }
    
    public TablaAdminAlumno(String where)
    {
        table = new JTable();

        model= new DefaultTableModel(new Object[][]{}, 
                new String[]{"CURP","Apellido paterno","Apellido materno","Nombre","Edad","Genero","Grupo"})
        {
            @Override
            public boolean isCellEditable(int row, int col){
                return (col==4 || col==5);
            }
        };
           
           
        table.setCellSelectionEnabled(true);
        table.setSurrendersFocusOnKeystroke(true);
        table.setModel(model);
        rowSorter = new TableRowSorter(model);
        table.setRowSorter(rowSorter);
        
        Administrador admin = new Administrador();
        ArrayList<Alumno> a = admin.todosAlumnos(where);
        for(int i=0;i<a.size();i++)
        { 
            model.addRow(new Object[0]);
            model.setValueAt(a.get(i).getCurp(), i, 0);
            model.setValueAt(a.get(i).getApPaterno(), i, 1);
            model.setValueAt(a.get(i).getApMaterno(), i, 2);
            model.setValueAt(a.get(i).getNombres(), i, 3);
            model.setValueAt(a.get(i).getEdad(), i, 4);
            model.setValueAt(a.get(i).getGenero(), i, 5);
            model.setValueAt(a.get(i).getGrupo(), i, 6);
        }
         model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tme) {
             SentenciasSQL sql = new SentenciasSQL();
             sql.UpdateGrupo(tme, model, table);
            }
        });
            
           
            
    
    }
    

    public TableRowSorter getRowSorter() {
        return rowSorter;
    }

}