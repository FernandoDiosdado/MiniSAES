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
public interface Materias {

    public enum MateriaPrimaria {
        //PRIMERGRADO
        MATEMATICAS("Matematicas 1", 1),
        ESPAÑOL("Español", 1),
        CIENCIASNATURALES("Ciencias Naturales", 1),
        EDUCACIONFISICA("Educacion Fisica", 1),
        ARTES("Artes 1", 1),
        FORMACIONCIVICA("Formacion Civica y Etica", 1),
        INGLES("Ingles 1", 1),
        //SEGUNDOGRADO
        MATEMATICAS2("Matematicas 2", 2),
        ESPAÑOL2("Español 2", 2),
        CIENCIASNATURALES2("Ciencias Naturales 2", 2),
        EDUCACIONFISICA2("Educacion Fisica 2", 2),
        ARTES2("Artes 2", 2),
        FORMACIONCIVICA2("Formacion Civica y Etica 2", 2),
        INGLES2("Ingles 2", 2),
        //TERCERGRADO
        MATEMATICAS3("Matematicas 3", 3),
        ESPAÑOL3("Español 3", 3),
        CIENCIASNATURALES3("Ciencias Naturales 3", 3),
        EDUCACIONFISICA3("Educacion Fisica 3", 3),
        ARTES3("Artes 3", 3),
        FORMACIONCIVICA3("Formacion Civica y Etica 3", 2),
        ENTIDAD("La entidad donde vivo", 3),
        INGLES3("Ingles 3", 3),
        //CUARTOGRADO
        MATEMATICAS4("Matematicas 4", 4),
        ESPAÑOL4("Español 4", 4),
        CIENCIASNATURALES4("Ciencias Naturales 4", 4),
        EDUCACIONFISICA4("Educacion Fisica 4", 4),
        ARTES4("Artes 4", 4),
        FORMACIONCIVICA4("Formacion Civica y Etica 4", 4),
        GEOGRAFIA("Geografia 1", 4),
        HISTORIA("Historia 1", 4),
        INGLES4("Ingles 4", 4),
        //QUINTOGRADO
        MATEMATICAS5("Matematicas 5", 5),
        ESPAÑOL5("Español 5", 5),
        CIENCIASNATURALES5("Ciencias Naturales 5", 5),
        EDUCACIONFISICA5("Educacion Fisica 5", 5),
        ARTES5("Artes 5", 5),
        FORMACIONCIVICA5("Formacion Civica y Etica 5", 5),
        GEOGRAFIA2("Geografia 2", 5),
        HISTORIA2("Historia 2", 5),
        INGLES5("Ingles 5", 5),
        //SEXTOGRADO
        MATEMATICAS6("Matematicas 6", 6),
        ESPAÑOL6("Español 6", 6),
        CIENCIASNATURALES6("Ciencias Naturales 6", 6),
        EDUCACIONFISICA6("Educacion Fisica 6", 6),
        ARTES6("Artes 6", 6),
        FORMACIONCIVICA6("Formacion Civica y Etica 6", 6),
        GEOGRAFIA3("Geografia 3", 6),
        HISTORIA3("Historia 3", 6),
        INGLES6("Ingles 6", 6);

        private final String nombreMat;
        private final int gradoMat;

        private MateriaPrimaria(String nom, int gra) {
            this.nombreMat = nom;
            this.gradoMat = gra;
        }

        public String getNombreMat() {
            return nombreMat;
        }

        public int getGradoMat() {
            return gradoMat;
        }

    }

}
