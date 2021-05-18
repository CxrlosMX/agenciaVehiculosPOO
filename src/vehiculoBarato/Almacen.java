/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoBarato;

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
public class Almacen {

    Vehiculo arreglo[];

    public Almacen(int size) {
        arreglo = new Vehiculo[size];

    }

    public Almacen() {
        arreglo = new Vehiculo[3];
    }

    //Metodo para agregar vehiculo
    public void agregarVehiculo(Vehiculo v) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = v;
                encontrado = true;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Vehiculo agregado correctamente", "Vehiculo agregado ", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void getBarato() {
        int p = arreglo[punteroBarato()].getPrecio();
        Vehiculo a = null;
        a = arreglo[punteroBarato()];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                if (arreglo[i].getPrecio() < p) {
                    p = arreglo[i].getPrecio();
                    a = arreglo[i];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El Vehiculo mas barato es:\n" + a.toString(), "Vehiculo barato", JOptionPane.INFORMATION_MESSAGE);

    }

    public int punteroBarato() {
        int c = 0;
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] != null) {
                c = i;
                encontrado = true;
            }
        }
        return c;
    }

    public void mostrarVehiculos() {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                System.out.println(arreglo[i].toString());
            }
        }
    }

    //Metodo para eliminar un Vehiculo
    public void eliminarVehiculo(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.length && !encontrado; i++) {
            if (arreglo[i] != null && arreglo[i].getMarca().equalsIgnoreCase(nombre)) {
                arreglo[i] = null;
                encontrado = true;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Vehiculo eliminado correctamente", "Vehiculo eliminado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el vehiculo", "Error al encontrar el vehiculo", JOptionPane.ERROR_MESSAGE);
        }

    }

    //Metodo para verificar si esta lleno el almacen
    public boolean espaciosDisponibles() {

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                return true;
            }
        }
        return false;
    }

    //Metodo para verificar si el amacen esta vacio
    public boolean almacenVacio() {
        int c = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                c++;
            }
        }
        if (c == arreglo.length) {
            return true;
        }
        return false;

    }

}
