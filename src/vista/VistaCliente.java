/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author Alex Zumba
 */
public class VistaCliente {

    private ControladorCliente controladorCliente;
    private Scanner entrada;

    public VistaCliente() {
        controladorCliente = new ControladorCliente();
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
        System.out.print("Ingrese el telefono: ");
        String telefono = entrada.next();
        System.out.println("Resultado: " + controladorCliente.crear(nombre, apellido, cedula, direccion, telefono));
    }

    public Cliente buscar() {
        System.out.println("Ingrese la cedula: ");
        String cedula = entrada.next();
        Cliente cliente = controladorCliente.buscar(cedula);
        controladorCliente.setSeleccionado(cliente);
        System.out.println(cliente);
        return cliente;
    }

    public void actualizar() {
        Cliente cliente = buscar();

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = entrada.next();
        System.out.print("Ingrese el direccion: ");
        String direccion = entrada.next();
        System.out.print("Ingrese el telefono: ");
        String telefono = entrada.next();
        System.out.println("Resultado: " + controladorCliente.actualizar(nombre, apellido, cliente.getCedula(), direccion, telefono));
    }

    public void eliminar() {
        Cliente cliente = buscar();
        if (cliente != null) {

            System.out.println("Resultado: " + controladorCliente.eliminar(cliente.getCedula()));
        }

    }

    public void listar() {
        for (Cliente cliente : controladorCliente.getListaCliente()) {
            System.out.println(cliente);

        }
    }

    public ControladorCliente getControladorCliente() {
        return controladorCliente;
    }

    public void setControladorCliente(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
    }
}
