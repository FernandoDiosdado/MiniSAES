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
public class Alumno extends Person {

    private final String curp;

    public Alumno(String nombres, String apPaterno, String apMaterno,
            int edad, char genero, String curp, String contrasena, String grupo) {
        super(nombres, apPaterno, apMaterno, edad, genero, curp, contrasena, grupo);
        this.curp = curp;
    }

    public Alumno(String nombres, String apPaterno, String apMaterno,
            int edad, char genero, String curp, String contrasena) {
        super(nombres, apPaterno, apMaterno, edad, genero, curp, contrasena);
        this.curp = curp;
    }

    public ArrayList<Calificacion> consultarMisCalificaciones(String grado) {
        SentenciasSQL a = new SentenciasSQL();
        ArrayList<Calificacion> calif = a.consultarCalificacion(curp, grado);
        return calif;
    }

    public String getCurp() {
        return curp;
    }

}
