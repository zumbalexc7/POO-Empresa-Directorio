/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorEmpleado;
import java.util.Scanner;
import modelo.Empleado;

/**
 *
 * @author Alex Zumba
 */
public class VistaEmpleado {

    private ControladorEmpleado controladorEmpleado;
    private Scanner entrada;

    public VistaEmpleado() {
        controladorEmpleado = new ControladorEmpleado();
        entrada = new Scanner(System.in);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("1.- Crear");
            System.out.println("2.- Actualizar");
            System.out.println("3.- Buscar");
            System.out.println("4.- Eliminar");
            System.out.println("5.- Listar");
            System.out.println("6.- Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    crear();
                    break;

                case 2:
                    buscar();
                    break;
                case 3:
                    actualizar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    listar();
                    break;
                case 6:
                    System.out.println("Finalizado");
                    break;
            }
        } while (opcion < 6);
    }

    public void crear() {
        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.next();
        System.out.print("Ingrese el cedula: ");
        String cedula = entrada.next();
        System.out.print("Ingrese el direccion: ");
        String direccion = entrada.next();
        System.out.print("Ingrese el sueldo: ");
        double sueldo = entrada.nextDouble();
        System.out.println("Resultado: " + controladorEmpleado.crear(nombre, apellido, cedula, direccion, sueldo));
    }

    public Empleado buscar() {
        System.out.print("Ingrese la cedula: ");
        String cedula = entrada.next();
        Empleado empleado = controladorEmpleado.buscar(cedula);
        controladorEmpleado.setSeleccionado(empleado);
        System.out.println(empleado);
        return empleado;
    }

    public void actualizar() {
        Empleado empleado = buscar();

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.next();
        System.out.print("Ingrese el direccion: ");
        String direccion = entrada.next();
        System.out.print("Ingrese el sueldo: ");
        double sueldo = entrada.nextDouble();
        System.out.println("Resultado: " + controladorEmpleado.actualizar(nombre, apellido, empleado.getCedula(), direccion, sueldo));
    }

    public void eliminar() {
        Empleado empleado = buscar();
        if (empleado != null) {

            System.out.println("Resultado: " + controladorEmpleado.eliminar(empleado.getCedula()));
        }

    }

    public void listar() {
        for (Empleado empleado : controladorEmpleado.getListaEmpleado()) {
            System.out.println(empleado);

        }
    }

    public ControladorEmpleado getControladorEmpleado() {
        return controladorEmpleado;
    }

    public void setControladorEmpleado(ControladorEmpleado controladorEmpleado) {
        this.controladorEmpleado = controladorEmpleado;
    }
}
