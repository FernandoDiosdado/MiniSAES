/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;
    
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class TablaPerfilProfesor extends JFrame{
    
    JTable table;
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
               TablaPerfilProfesor form = new TablaPerfilProfesor();
               form.setVisible(true);;
            }
        });

    }
    
    public TablaPerfilProfesor(){       
    }

    public TablaPerfilProfesor(Profesor p, String materia)
    {
        table = new JTable();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, 
                new String[]{"CURP","1°","2°","3°","4°","5°","Final"})
        {
            @Override
            public boolean isCellEditable(int row, int col){
                return (col!=0);
            }
        };

        table.setModel(model);
        table.setCellSelectionEnabled(true);
        table.setSurrendersFocusOnKeystroke(true);

        ArrayList<Calificacion> cal = p.consultarCalificacionesAlumnos(materia);
        for(int i=0;i<cal.size();i++)
        {
            model.addRow(new Object[0]);
            model.setValueAt(cal.get(i).getCurp(), i, 0);
            model.setValueAt(cal.get(i).getParcial1(), i, 1);
            model.setValueAt(cal.get(i).getParcial2(), i, 2);
            model.setValueAt(cal.get(i).getParcial3(), i, 3);
            model.setValueAt(cal.get(i).getParcial4(), i, 4);
            model.setValueAt(cal.get(i).getParcial5(), i, 5);
            model.setValueAt(cal.get(i).getCalif_final(), i, 6);
        }
        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tme) {
             SentenciasSQL sql = new SentenciasSQL();
             sql.UpdateCalf(tme, model, table,materia);
            }
        });
            
    }

}
