/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lufer
 */
public class SentenciasSQL implements Materias {

    //variables necesarias para la conexion con la bd.
    static Conexion con = new Conexion();
    static Connection cin = con.Entrar();
    static PreparedStatement ps;
    static String sentencia;
    ResultSet st;

    public SentenciasSQL() {
    }

    //---------Sentencias NO realizadas por usuarios
    //registra una persona(Alumno/Profesor) en la db
    public static void registrar(Person a, String tipo, String id) {
        //determina la sentencia
        sentencia = "insert into " + tipo + " (" + id + ", nombre, ap_Pat, ap_Mat, Contrasena, Genero, Edad)values (?,?,?,?,?,?,?)";
        //inserta el registro el la db
        try {
            ps = cin.prepareCall(sentencia);

            ps.setString(1, a.getId());//con esta sentencia el método se puede hacer general (Alumno/Profesor)
            ps.setString(2, a.getNombres());
            ps.setString(3, a.getApPaterno());
            ps.setString(4, a.getApMaterno());
            ps.setString(5, a.getContrasena());
            ps.setString(6, String.valueOf(a.getGenero()));
            ps.setInt(7, a.getEdad());

            int registro = ps.executeUpdate();//crear registro

            //creacion de las calificaciones para alumno
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Registro en Base de Datos con Exito", "Bien", JOptionPane.QUESTION_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Registro Fallido", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        sentencia = null;
    }

    //comprueba que un usuario existe en la db
    public static boolean comprobarUsuario(String user, String tipo, String id) {
        boolean existe = false; //boolean return dependiendo si el usuario existe o no
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            //sentencia a ingresar
            sentencia = "SELECT nombre FROM " + tipo + " WHERE " + id + "='" + user + "'";
            rs = stmt.executeQuery(sentencia);

            if (rs.next()) {  //da false cuando ya no quedan elemento por recorrer(en este caso solo debe ser 1)
                existe = true; //si existe el usuario devuelve true
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ingresado no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return existe;
    }

    //comprueba que la contraseña para el inicio de sesion sea correcta
    public static boolean comprobarContraseña(String user, String tipo, String id, String contra) {
        boolean coincide = false; //boolean return dependiendo si las contraseñas coinciden
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            //sentencia a ingresar
            sentencia = "SELECT Contrasena FROM " + tipo + " WHERE " + id + "='" + user + "'";
            rs = stmt.executeQuery(sentencia);
            rs.next(); //recorre los registros obtenidos de la db(en este caso 1 por la consulta con la PK)
            //comprueba que coincida con la contraseña ingresada
            if (contra.equals(rs.getString("Contrasena"))) {
                coincide = true;
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return coincide;
    }

    public static String cambiarContrasena(String usuario, String contrasena, String tipo, String id) {

        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            //sentencia a ingresar
            sentencia = "UPDATE " + tipo + " set Contrasena = '" + contrasena + "' where " + id + " = '" + usuario + "'";
            stmt.executeUpdate(sentencia);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos: " + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "Actualización realizada con éxito, favor de reiniciar", "Bien", JOptionPane.QUESTION_MESSAGE);

        return contrasena;
    }

    //devuelve un profesor con datos de la db, recomendable usar después de comprobarUsuario
    public static Profesor consultarProfesor(String user) {
        Profesor prof = null; //Objeto Persona en los que se ingresaran los datos
        //sentencia a ingresar
        sentencia = "SELECT * FROM Profesor WHERE rfc='" + user + "'";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);

            rs.next();
            //recolección de todos los datos de la db
            String identi = rs.getString("rfc");
            String nombre = rs.getString("nombre");
            String aP = rs.getString("ap_Pat");
            String aM = rs.getString("ap_Mat");
            String contrasena = rs.getString("Contrasena");
            char genero = rs.getString("Genero").charAt(0);
            int edad = rs.getInt("Edad");
            String grupo = rs.getString("id_grupoFK");

            prof = new Profesor(nombre, aP, aM, edad, genero, identi, contrasena, grupo);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return prof;
    }

    //devuelve un alumno con datos de la db, recomendable usar después de comprobarUsuario
    public static Alumno consultarAlumno(String user) {
        Alumno al = null; //Objeto Persona en los que se ingresaran los datos
        //sentencia a ingresar
        sentencia = "SELECT * FROM Alumno WHERE curp='" + user + "'";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);

            rs.next();
            //recolección de todos los datos de la db
            String identi = rs.getString("curp");
            String nombre = rs.getString("nombre");
            String aP = rs.getString("ap_Pat");
            String aM = rs.getString("ap_Mat");
            String contrasena = rs.getString("Contrasena");
            char genero = rs.getString("Genero").charAt(0);
            int edad = rs.getInt("Edad");
            String grupo = rs.getString("id_grupoFK");

            al = new Alumno(nombre, aP, aM, edad, genero, identi, contrasena, grupo);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return al;
    }

    //devuelve los grados existentes
    public static ArrayList<Integer> consultarGrados() {
        ArrayList<Integer> grados = new ArrayList<Integer>();
        sentencia = "SELECT id_grado FROM Grado";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);

            //recolección de todos los datos de la db
            while (rs.next()) {
                grados.add(rs.getInt("id_grado"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos, no regresa grados", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return grados;
    }

    //saber el grupo de alguien
    public static String consultarGrupo(String user, String tipo, String id) {
        String grupo = "";
        sentencia = "SELECT id_grupoFK FROM " + tipo + " WHERE " + id + "='" + user + "'";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);

            rs.next();
            //recolección de todos los datos de la db
            grupo = rs.getString("id_grupoFK");
            //dependiendo si es un profesor o alumno regresa la información (no tiene mucho sentido por ahora porque retorna Person)

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return grupo;
    }

    //consultar materias de un grupo
    public static ArrayList<String> materiasGrupo(String grupo) {
        ArrayList<String> materias = new ArrayList<String>();
        sentencia = "SELECT nombre_Mat FROM Materia AS m inner join Grupo AS g "
                + "ON m.id_gradoFK=g.id_gradoFK WHERE g.id_grupo='" + grupo + "'";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);
            //recolección de todos los datos de la db
            while (rs.next()) {
                materias.add(rs.getString("nombre_Mat"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return materias;
    }

    public static void registrarMaterias() {
        String materia;
        int grado;
        int registro = 0;

        //determina la sentencia
        sentencia = "insert into Materia (nombre_Mat, id_gradoFK)values (?,?)";
        //inserta el registro el la db
        try {
            ps = cin.prepareCall(sentencia);

            //materia = Materias.MateriaPrimaria.MATEMATICAS.getNombreMat();
            for (Materias.MateriaPrimaria mat : Materias.MateriaPrimaria.values()) {
                ps.setString(1, mat.getNombreMat());//con esta sentencia el método se puede hacer general (Alumno/Profesor)
                ps.setInt(2, mat.getGradoMat());

                registro = ps.executeUpdate();//crear registro
            }

            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Registro en Base de Datos con Exito", "Bien", JOptionPane.QUESTION_MESSAGE);
            }

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex + "mensaje visto");
        }
        sentencia = null;
    }

    public static void asignarCalificaciones(Alumno al) {
        sentencia = "insert into Calificacion (curpFK, nombre_MatFK) values (?,?)";
        int registro = 0;
        //inserta el registro el la db
        try {
            ps = cin.prepareCall(sentencia);
            for (Materias.MateriaPrimaria mat : Materias.MateriaPrimaria.values()) {
                ps.setString(1, al.getCurp());//con esta sentencia el método se puede hacer general (Alumno/Profesor)
                ps.setString(2, mat.getNombreMat());
                registro = ps.executeUpdate();//crear registro
            }
            //creacion de las calificaciones para alumno

            if (registro > 0) {
                //JOptionPane.showMessageDialog(null, "Registro en Base de Datos con Exito", "Bien", JOptionPane.QUESTION_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        sentencia = null;
    }

    //---------Sentencias realizadas por alumnos
    //consulta la calificacion de un alumno desde su perfil
    public ArrayList<Calificacion> consultarCalificacion(String user, String grado) {
        ArrayList<Calificacion> cal = new ArrayList<Calificacion>(); //Objeto Persona en los que se ingresaran los datos
        //sentencia a ingresar
        sentencia = "SELECT curpFK,nombre_Mat,parcial1,parcial2,parcial3,parcial3,parcial4,parcial5,final"
                + " FROM Calificacion AS c inner join Materia "
                + "as m on c.nombre_MatFK=m.nombre_Mat WHERE id_gradoFK=" + grado + " "
                + "AND curpFK='" + user + "'";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);

            while (rs.next()) {
                //recolección de todos los datos de la db 
                String curp = rs.getString("curpFK");
                String nom_materia = rs.getString("nombre_Mat");
                float p1 = rs.getFloat("parcial1");
                float p2 = rs.getFloat("parcial2");
                float p3 = rs.getFloat("parcial3");
                float p4 = rs.getFloat("parcial4");
                float p5 = rs.getFloat("parcial5");
                float calif_final = rs.getFloat("final");

                cal.add(new Calificacion(curp, nom_materia, p1, p2, p3, p4, p5, calif_final));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return cal;
    }

    //---------Sentencias realizadas por profesores
    //devuelve las materias que un profesor puede calificar de su grupo
    public ArrayList<Calificacion> calificacionesAlumnos(String user, String materia) {
        ArrayList<Calificacion> cal = new ArrayList<Calificacion>();
        sentencia = "SELECT curpFK,nombre_MatFK,parcial1,parcial2,parcial3,parcial4,parcial5,final FROM Calificacion AS c inner join Alumno as a on c.curpFK = a.curp inner join Grupo as g on a.id_grupoFK=g.id_grupo inner join Profesor as p on g.id_grupo=p.id_grupoFK\n"
                + "WHERE nombre_MatFK='" + materia + "' and rfc='" + user + "'";

        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);
            //recolección de todos los datos de la db
            while (rs.next()) {
                String curp = rs.getString("curpFK");
                String nom_materia = rs.getString("nombre_MatFK");
                float p1 = rs.getFloat("parcial1");
                float p2 = rs.getFloat("parcial2");
                float p3 = rs.getFloat("parcial3");
                float p4 = rs.getFloat("parcial4");
                float p5 = rs.getFloat("parcial5");
                float calif_final = rs.getFloat("final");

                cal.add(new Calificacion(curp, nom_materia, p1, p2, p3, p4, p5, calif_final));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return cal;
    }

    //---------Sentencias realizadas por administrador
    //trae todos los grados existentes de la db
    public static ArrayList<String> consultarGruposPorGrado(String grado) {
        ArrayList<String> grupos = new ArrayList<String>();
        sentencia = "SELECT id_grupo FROM Grupo WHERE id_gradoFK='" + grado + "'";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);

            while (rs.next()) {
                grupos.add(rs.getString("id_grupo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return grupos;
    }

    //trae de todos los estudiantes segun where, pero se puede omitir y traer todos
    public static ArrayList<Alumno> consultarTodosAlumnos(String where) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        sentencia = "SELECT * FROM Alumno " + where + " ORDER BY curp";

        try {

            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);

            while (rs.next()) {
                //recolección de todos los datos de la db

                String identi = rs.getString("curp");
                String nombre = rs.getString("nombre");
                String aP = rs.getString("ap_Pat");
                String aM = rs.getString("ap_Mat");
                String contrasena = rs.getString("Contrasena");
                char genero = rs.getString("Genero").charAt(0);
                int edad = rs.getInt("Edad");
                String grupo = rs.getString("id_grupoFK");

                alumnos.add(new Alumno(nombre, aP, aM, edad, genero, identi, contrasena, grupo));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return alumnos;
    }

    //trae de todos los profesores segun where, pero se puede omitir y traer todos
    public static ArrayList<Profesor> consultarTodosProfesores(String where) {
        ArrayList<Profesor> profesores = new ArrayList<Profesor>();

        sentencia = "SELECT * FROM Profesor " + where + " ORDER BY rfc";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);

            while (rs.next()) {
                //recolección de todos los datos de la db
                String identi = rs.getString("rfc");
                String nombre = rs.getString("nombre");
                String aP = rs.getString("ap_Pat");
                String aM = rs.getString("ap_Mat");
                String contrasena = rs.getString("Contrasena");
                char genero = rs.getString("Genero").charAt(0);
                int edad = rs.getInt("Edad");
                String grupo = rs.getString("id_grupoFK");

                profesores.add(new Profesor(nombre, aP, aM, edad, genero, identi, contrasena, grupo));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return profesores;
    }

    //trae informacion de todos los grupos
    public static ArrayList<String[]> consultarInfoGrupos() {
        ArrayList<String[]> datosG = new ArrayList<String[]>();

        //sentencia = "SELECT g.id_grupo, g.id_gradoFK, p.rfc FROM Grupo as g"
        //        + " inner join Profesor as p on g.id_grupo=p.id_grupoFK ORDER BY g.id_gradoFK";
        sentencia = "SELECT * FROM Grupo";
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);
            while (rs.next()) {
                //recolección de todos los datos de la db
                String grupo = rs.getString("id_grupo");
                String grado = rs.getString("id_gradoFK");
                String profesor = profesorDeGrupo(grupo);
                String[] datos = {grupo, grado, profesor};
                datosG.add(datos);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return datosG;
    }

    public static String profesorDeGrupo(String grupo) {
        sentencia = "SELECT rfc FROM Profesor WHERE id_grupoFK='" + grupo + "'";

        String profesor = null;
        try {
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);
            while (rs.next()) {
                //recolección de todos los datos de la db
                profesor = rs.getString("rfc");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return profesor;

    }

    public void UpdateGrupo(TableModelEvent e, DefaultTableModel tbAl, JTable TB) {
        try {
            String colname = null;

            switch (e.getColumn()) {
                case 4: {
                    colname = "Edad";
                    break;
                }
                case 5: {
                    colname = "Genero";
                    break;
                }
                case 6: {
                    colname = "id_grupoFK";
                    break;
                }
            }
            if (tbAl.getValueAt(e.getFirstRow(), e.getColumn()).equals("")) {
                sentencia = "UPDATE Alumno SET " + colname + "=NULL WHERE curp = '" + tbAl.getValueAt(e.getFirstRow(), 0) + "'";
            } else {
                sentencia = "UPDATE Alumno SET " + colname + "='" + tbAl.getValueAt(e.getFirstRow(), e.getColumn()) + "' WHERE curp = '" + tbAl.getValueAt(e.getFirstRow(), 0) + "'";
            }

            ps = cin.prepareStatement(sentencia);
            int rows = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SentenciasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        TB.setModel(tbAl);

    }

    public void UpdateGrupoProf(TableModelEvent e, DefaultTableModel tbAl, JTable TB) {
        try {
            String colname = null;

            switch (e.getColumn()) {
                case 4: {
                    colname = "Edad";
                    break;
                }
                case 5: {
                    colname = "Genero";
                    break;
                }
                case 6: {
                    colname = "id_grupoFK";
                    break;
                }
            }
            if (tbAl.getValueAt(e.getFirstRow(), e.getColumn()).equals("")) {
                sentencia = "UPDATE Profesor SET " + colname + "=NULL WHERE rfc = '" + tbAl.getValueAt(e.getFirstRow(), 0) + "'";
            } else {
                sentencia = "UPDATE Profesor SET " + colname + "='" + tbAl.getValueAt(e.getFirstRow(), e.getColumn()) + "' WHERE rfc = '" + tbAl.getValueAt(e.getFirstRow(), 0) + "'";
            }

            ps = cin.prepareStatement(sentencia);
            int rows = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SentenciasSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        TB.setModel(tbAl);

    }

    public void UpdateCalf(TableModelEvent e, DefaultTableModel tbAl, JTable TB, String Materia) {
        try {
            String colname = null;

            switch (e.getColumn()) {
                case 1: {
                    colname = "parcial1";
                    break;
                }
                case 2: {
                    colname = "parcial2";
                    break;
                }
                case 3: {
                    colname = "parcial3";
                    break;
                }
                case 4: {
                    colname = "parcial4";
                    break;
                }
                case 5: {
                    colname = "parcial5";
                    break;
                }
                case 6: {
                    colname = "final";
                    break;
                }
            }
            sentencia = "UPDATE Calificacion SET " + colname + " ='" + tbAl.getValueAt(e.getFirstRow(), e.getColumn())
                    + "' WHERE curpFK = '" + tbAl.getValueAt(e.getFirstRow(), 0) + "' AND nombre_MatFK = '" + Materia + "'";
            ps = cin.prepareStatement(sentencia);
            int rows = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        TB.setModel(tbAl);

    }

    public static boolean bajaRegistro(String llave, String tipo, String id) {

        try {
            if (tipo.equals("Grupo")) {

                String[] vaciar = {
                    "UPDATE Profesor SET id_grupoFK = NULL WHERE id_grupoFK ='" + llave + "'",
                    "UPDATE Alumno SET id_grupoFK= NULL WHERE id_grupoFK ='" + llave + "'"
                };

                for (String sentencia : vaciar) {

                    ps = cin.prepareStatement(sentencia);

                    int rows = ps.executeUpdate();

                }

            }
            sentencia = "DELETE FROM " + tipo + " WHERE " + id + "='" + llave + "'";
            PreparedStatement pst = cin.prepareStatement(sentencia);
            pst.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error con la base de datos" + ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }
        return true;
    }

    public static void agregarGrupo(String grado, String grupo) {

        //determina la sentencia
        sentencia = "insert into Grupo (id_grupo,id_gradoFK )values (?,?)";
        //inserta el registro el la db
        try {
            ps = cin.prepareCall(sentencia);
            ps.setString(1, grupo);
            ps.setInt(2, Integer.parseInt(grado));//con esta sentencia el método se puede hacer general (Alumno/Profesor)

            int registro = ps.executeUpdate();//crear registro

            //creacion de las calificaciones para alumno
            if (registro > 0) {
                JOptionPane.showMessageDialog(null, "Registro en Base de Datos con Exito", "Bien", JOptionPane.QUESTION_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "ATENCION", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void personaEliminarGrupo(String user, String tipo, String id) {
        sentencia = "UPDATE " + tipo + " SET id_grupoFK=NULL where " + id + "='" + user + "'";

        try {
            ps = cin.prepareStatement(sentencia);
            int rows = ps.executeUpdate();
        } catch (Exception ex) {

        }

    }

    
    /*
    public int Contar() throws SQLException {
        int c = 0;
        sentencia = "select * from Materia";
        ps = cin.prepareCall(sentencia);
        st = ps.executeQuery();
        try {
            while (st.next()) {
                c++;
            }
            return c;
        } catch (Exception ex) {

        }
        return c;
    }
    */
    /*public Person consultarPersona(){
        Person per=null; //Objeto Persona en los que se ingresaran los datos
        //sentencia a ingresar
        sentencia = "SELECT * FROM "+tipo+" WHERE "+identificador+"='"+usuario+"'";
        try{
            ResultSet rs = null;
            Statement stmt = cin.createStatement();
            rs = stmt.executeQuery(sentencia);
            
            rs.next();
            //recolección de todos los datos de la db
            String identi = rs.getString(identificador);
            String nombre = rs.getString("nombre");
            String aP = rs.getString("ap_Pat");
            String aM = rs.getString("ap_Mat");
            String contrasena = rs.getString("Contrasena");
            char genero = rs.getString("Genero").charAt(0);
            int edad = rs.getInt("Edad");
            //dependiendo si es un profesor o alumno regresa la información (no tiene mucho sentido por ahora porque retorna Person)
            if(tipo.equals("Alumno"))
                per = new Alumno(nombre,aP,aM,edad,genero,identi,contrasena);
            else if(tipo.equals("Profesor"))
                per = new Profesor(nombre,aP,aM,edad,genero,identi,contrasena);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error con la base de datos","ATENCION",JOptionPane.ERROR_MESSAGE);               
        }
        return per;
    }*/
}
