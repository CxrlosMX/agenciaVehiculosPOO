/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 17/05/2021
 *
 */
public class tablaAlumnos {

    Alumno arreglo[][];

    public tablaAlumnos() {
        arreglo = new Alumno[3][3];
    }

    //Metodo para agregar alumnos 
    public void agregarAlumno(Alumno a) {
        if (noLleno()) {
            boolean encontrado = false;
            for (int i = 0; i < arreglo.length && !encontrado; i++) {
                for (int j = 0; j < arreglo[0].length && !encontrado; j++) {
                    if (arreglo[i][j] == null) {
                        encontrado = true;
                        arreglo[i][j] = a;
                    }
                }
            }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Alumno " + a.toString() + "\nAgregado correctsmente", "Agregado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El registro esta lleno", "Registro lleno", JOptionPane.ERROR_MESSAGE);
        }

    }

    //Metodo para verificar que el arreglo no este lleno
    public boolean noLleno() {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; i++) {
                if (arreglo[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    //Metodo para verificar que nuestro arreglo no este vacio
    public int vacio() {
        int c = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i][j] == null) {
                    c++;
                }
            }
        }
        return c;
    }

    //Metodo para eliminar un alumno
    public void eliminarAlumno(String nombre) {
        Alumno a = null;
        boolean encontrado = false;
        if (vacio() != 9) {
            for (int i = 0; i < arreglo.length && !encontrado; i++) {
                for (int j = 0; j < arreglo[0].length && !encontrado; j++) {
                    if (arreglo[i][j] != null) {
                        if (arreglo[i][j].getNombre().equalsIgnoreCase(nombre)) {
                            encontrado = true;
                            a = arreglo[i][j];
                            arreglo[i][j] = null;
                        }
                    }
                }
            }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "El alumno: \n" + a.toString() + " fue eliminado", "Alumno Eliminado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el nombre del alumno", "Error al buscar", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El registro se encuentra vacio", "Registro vacio", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Metodo para mostrar
    public void mostrarAlumnos() {
        if (vacio() != 9) {
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo[0].length; j++) {
                    if (arreglo[i][j] != null) {
                        System.out.println(arreglo[i][j].toString());
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "El registro se encuentra vacio", "Registro vacio", JOptionPane.ERROR_MESSAGE);

        }
    }

}
