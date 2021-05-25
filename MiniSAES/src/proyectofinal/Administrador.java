/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author lufer
 */
/*La funcion del admin es que tiene el codigo de todas las acciones
que se pueden realizar en su perfil, de manera de que alli no se amontonen y sean mas
legibles. Para esto, PerfilAdministrador tiene un Administrador y lo inicializa 
cuando se entra*/
public class Administrador {

    public ArrayList<String> obternerGruposPorGrado(String grado) {
        ArrayList<String> grupos = SentenciasSQL.consultarGruposPorGrado(grado);
        return grupos;
    }
    
    public ArrayList<String[]> obtenerInfoGrupos() {
        ArrayList<String[]> datosG = SentenciasSQL.consultarInfoGrupos();
        return datosG;
    }

    public ArrayList<Alumno> todosAlumnos(String where) {
        ArrayList<Alumno> alumnos = SentenciasSQL.consultarTodosAlumnos(where);
        return alumnos;
    }

    public ArrayList<Profesor> todosProfesores(String where) {
        ArrayList<Profesor> profesores = SentenciasSQL.consultarTodosProfesores(where);
        return profesores;
    }

}
