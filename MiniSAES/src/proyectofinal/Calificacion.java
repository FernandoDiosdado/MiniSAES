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
public class Calificacion {

    private String curp;
    private String nom_materia;
    private float parcial1;
    private float parcial2;
    private float parcial3;
    private float parcial4;
    private float parcial5;
    private float calif_final;

    public Calificacion(String curp, String nom_materia) {
        this.curp = curp;
        this.nom_materia = nom_materia;
    }

    public Calificacion(String curp, String nom_materia, float parcial1, float parcial2, float parcial3, float parcial4, float parcial5, float calif_final) {
        this.curp = curp;
        this.nom_materia = nom_materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
        this.parcial4 = parcial4;
        this.parcial5 = parcial5;
        this.calif_final = calif_final;
    }

    public String getNom_materia() {
        return nom_materia;
    }

    public void setNom_materia(String nom_materia) {
        this.nom_materia = nom_materia;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public float getParcial1() {
        return parcial1;
    }

    public void setParcial1(float parcial1) {
        this.parcial1 = parcial1;
    }

    public float getParcial2() {
        return parcial2;
    }

    public void setParcial2(float parcial2) {
        this.parcial2 = parcial2;
    }

    public float getParcial3() {
        return parcial3;
    }

    public void setParcial3(float parcial3) {
        this.parcial3 = parcial3;
    }

    public float getParcial4() {
        return parcial4;
    }

    public void setParcial4(float parcial4) {
        this.parcial4 = parcial4;
    }

    public float getParcial5() {
        return parcial5;
    }

    public void setParcial5(float parcial5) {
        this.parcial5 = parcial5;
    }

    public float getCalif_final() {
        return calif_final;
    }

    public void setCalif_final(float calif_final) {
        this.calif_final = calif_final;
    }

}
