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
public class Uso_almacen {

    public static void main(String args[]) {
        int op = 0, precio = 0;
        String marca, modelo;
        Almacen almacen = new Almacen();
        Vehiculo v;
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "-*-*-MENU-*-*-\n1.-Agregar Vehiculo"
                        + "\n2.-Mostrar Vehiculos"
                        + "\n3.-Eliminar Vehiculo"
                        + "\n4.-Verrficiar Vehiculo mas barato"
                        + "\n5.-Cerrar program", "MENU", 3));
                switch (op) {
                    case 1: {
                        if (almacen.espaciosDisponibles()) {
                            marca = JOptionPane.showInputDialog(null, "Introduce la marca del vehiculo", "Introduciendo Marca", JOptionPane.INFORMATION_MESSAGE);
                            modelo = JOptionPane.showInputDialog(null, "Introduce el modelo del vehiculo", "Introduciendo Modelo", JOptionPane.INFORMATION_MESSAGE);
                            precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el precio del Vehiculo", "Introduciendo Precio", JOptionPane.INFORMATION_MESSAGE));
                            v = new Vehiculo(marca, modelo, precio);
                            almacen.agregarVehiculo(v);
                        } else {
                            JOptionPane.showMessageDialog(null, "El almacen esta lleno", "Almacen lleno", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    }
                    case 2: {
                        if (almacen.almacenVacio()) {
                            JOptionPane.showMessageDialog(null, "El almacen se encuentra vacio", "Almacen vacio", JOptionPane.ERROR_MESSAGE);

                        } else {
                            almacen.mostrarVehiculos();
                        }
                        break;
                    }
                    case 3: {
                        if (almacen.almacenVacio()) {
                            JOptionPane.showMessageDialog(null, "El almacen se encuentra vacio", "Almacen vacio", JOptionPane.ERROR_MESSAGE);
                        } else {
                            marca = JOptionPane.showInputDialog(null, "Introduce el nombre del vehiculo que deseas eliminar", "Eliminando vehiculo", JOptionPane.INFORMATION_MESSAGE);
                            almacen.eliminarVehiculo(marca);
                        }
                        break;
                    }
                    case 4: {
                        if (almacen.almacenVacio()) {
                            JOptionPane.showMessageDialog(null, "El almacen se encuentra vacio", "Almacen vacio", JOptionPane.ERROR_MESSAGE);

                        } else {
                            almacen.getBarato();
                        }
                        break;
                    }
                    case 5: {
                        JOptionPane.showMessageDialog(null, "Cerrando programa", "Cerrando programa", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Introduce valores validos por favor", "Error de valores", JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Errror al introducir valores", JOptionPane.ERROR_MESSAGE);
            }

        } while (op != 5);
    }

}
