/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author C_Leo
 */
public class Profesor extends Person {
    
    private final String rfc;

    public Profesor (String nombres, String apPaterno, String apMaterno, 
            int edad, char genero, String rfc, String contrasena, String grupo)
    {
        super(nombres,apPaterno,apMaterno,edad,genero,rfc,contrasena,grupo);
        this.rfc=rfc;
    }

    public Profesor(String nombres, String apPaterno, String apMaterno,
            int edad, char genero, String rfc, String contrasena) {
        super(nombres, apPaterno, apMaterno, edad, genero, rfc, contrasena);
        this.rfc = rfc;
    }
    
    public String getRfc() {
        return rfc;
    }
    
    //Profesor consulta calificaciones de alumnos.
    public ArrayList<Calificacion> consultarCalificacionesAlumnos(String materia){
        SentenciasSQL p = new SentenciasSQL();
        ArrayList<Calificacion> calif = p.calificacionesAlumnos(rfc, materia);
        return calif;
    }
       
}
