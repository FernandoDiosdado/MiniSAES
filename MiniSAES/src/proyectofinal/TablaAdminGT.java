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

public class TablaAdminGT extends JFrame{

    JTable table;
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
               TablaAdminGT form = new TablaAdminGT();
               form.setVisible(true);;
            }
        });

    }

    public TablaAdminGT()
    {
        table = new JTable();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, 
                new String[]{"Grupo","Grado","Maestro"})
        {
            @Override
            public boolean isCellEditable(int row, int col){
                return (false);
            }
        };

        table.setModel(model);
        
        Administrador admin = new Administrador();
        ArrayList<String[]> a = admin.obtenerInfoGrupos();
        for(int i=0;i<a.size();i++)
        {
            model.addRow(new Object[0]);
            model.setValueAt(a.get(i)[0], i, 0);
            model.setValueAt(a.get(i)[1], i, 1);
            model.setValueAt(a.get(i)[2], i, 2);
        }
    }

}