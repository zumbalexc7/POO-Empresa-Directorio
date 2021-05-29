/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Alex Zumba
 */
public class VistaGeneral {

    private Scanner entrada;
    private VistaEmpresa vistaEmpresa;
    private VistaCliente vistaCliente;
    private VistaEmpleado vistaEmpleado;
    private VistaDirectivo vistaDirectivo;

    public VistaGeneral() {
        vistaCliente = new VistaCliente();
        vistaEmpleado = new VistaEmpleado();
        vistaDirectivo = new VistaDirectivo();
        vistaEmpresa = new VistaEmpresa(vistaCliente, vistaEmpleado, vistaDirectivo);
        entrada = new Scanner(System.in);
        
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("\n***** MENU PRINCIPAL *****");
            System.out.println("1.- Empresas");
            System.out.println("2.- Empleados");
            System.out.println("3.- Directivos");
            System.out.println("4.- Clientes");
            System.out.println("5.- Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    vistaEmpresa.menu();
                    break;
                case 2: 
                     vistaEmpleado.menu();
                             break;
                case 3:
                    vistaDirectivo.menu();
                    break;
                case 4: 
                    vistaCliente.menu();
                    break;
                case 5:
                    System.out.println("PROGRAMA FINALIZADO");
                    break;

            }
        } while (opcion < 5);
    }


}
