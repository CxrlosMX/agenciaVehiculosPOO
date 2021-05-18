/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloobjetos;

/**
 *
 * @author CxrlosMX
 */
public class Uso_alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tablaAlumnos alumnos=new tablaAlumnos();
        Alumno a;
        a=new Alumno("Luis Carlos",19620070,"4S",'A');
        alumnos.agregarAlumno(a);
        alumnos.mostrarAlumnos();
        alumnos.eliminarAlumno("Luis Carlos");
        alumnos.mostrarAlumnos();
    }
    
}
