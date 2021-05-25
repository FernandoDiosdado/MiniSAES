/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author C_Leo
 */
public class Person {
    
    private String nombres;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private char genero;
    private final String id;
    private String contrasena;
    private String grupo;
    //este constructor sirve para registro en db
    public Person(String nombres, String apPaterno, String apMaterno,int edad, char genero, String id, String contrasena)
    {        
        this.nombres=nombres;
        this.apPaterno=apPaterno;
        this.apMaterno=apMaterno;
        this.edad=edad;
        this.genero=genero;
        this.id=id;
        this.contrasena=contrasena;
    }
    //este es constructor es usado para para ingresar los datos devueltos de la db en el (consultas)
    public Person(String nombres, String apPaterno, String apMaterno, int edad, char genero, String id, String contrasena, String grupo) {
        this.nombres = nombres;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
        this.contrasena = contrasena;
        this.grupo = grupo;
    }
    
    public String getNombres() {
        return nombres;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public String getId() {
        return id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setContrasena(String contrasena, String tipo, String identificador) {
        this.contrasena = SentenciasSQL.cambiarContrasena(this.id,contrasena,tipo,identificador);
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
       
}
