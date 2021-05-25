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

public class TablaAdminGI extends JFrame{
    
    JTable table;
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
               TablaAdminGI form = new TablaAdminGI();
               form.setVisible(true);;
            }
        });

    }
    
    public TablaAdminGI(){        
    }

    public TablaAdminGI(String where)
    {
        table = new JTable();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, 
                new String[]{"CURP","Apellido paterno","Apellido materno","Nombre"})
        {
            @Override
            public boolean isCellEditable(int row, int col){
                return (false);
            }
        };

        table.setModel(model);

        Administrador admin = new Administrador();

        ArrayList<Alumno> a = admin.todosAlumnos(where);

        for(int i=0;i<a.size();i++)
        {   
            model.addRow(new Object[0]);
            model.setValueAt(a.get(i).getCurp(), i, 0);
            model.setValueAt(a.get(i).getApPaterno(), i, 1);
            model.setValueAt(a.get(i).getApMaterno(), i, 2);
            model.setValueAt(a.get(i).getNombres(), i, 3);
        }
    }

}
