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
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TablaAdminProfesor extends JFrame{
    
    JTable table;
    TableRowSorter rowSorter;
    
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

    public TablaAdminProfesor() {
    }
    
    public TablaAdminProfesor(String where)
    {
        table = new JTable();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, 
                new String[]{"RFC","Apellido paterno","Apellido materno","Nombre","Edad","Genero","Grupo"})
        {           
            @Override
            public boolean isCellEditable(int row, int col){
                return (col==4 || col==5);
            }
        };

        table.setModel(model);
        table.setCellSelectionEnabled(true);
        table.setSurrendersFocusOnKeystroke(true);
        rowSorter = new TableRowSorter(model);
        table.setRowSorter(rowSorter);
       
        
        Administrador admin = new Administrador();
        ArrayList<Profesor> p = admin.todosProfesores(where);
        for(int i=0;i<p.size();i++)
        {   
            model.addRow(new Object[0]);
            model.setValueAt(p.get(i).getRfc(), i, 0);
            model.setValueAt(p.get(i).getApPaterno(), i, 1);
            model.setValueAt(p.get(i).getApMaterno(), i, 2);
            model.setValueAt(p.get(i).getNombres(), i, 3);
            model.setValueAt(p.get(i).getEdad(), i, 4);
            model.setValueAt(p.get(i).getGenero(), i, 5);
            model.setValueAt(p.get(i).getGrupo(), i, 6);
        }
        
          model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tme) {
             SentenciasSQL sql = new SentenciasSQL();
             sql.UpdateGrupoProf(tme, model, table);
            }
        });
            
           
    }
    
    public TableRowSorter getRowSorter() {
        return rowSorter;
    }

}