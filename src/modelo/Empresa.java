/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex Zumba
 */
public class Empresa {

    private long id;
    private String nombre;
    private List<Cliente> listadoClientes;
    private List<Empleado> listadoEmpleados;
    private List<Directivo> listadoDirectivos;

    public Empresa() {
    }

    public Empresa(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listadoClientes = new ArrayList<>();
        this.listadoEmpleados = new ArrayList<>();
        listadoDirectivos = new ArrayList<>();
    }

    public Empresa(long id, String nombre, List<Cliente> listadoClientes, List<Empleado> listadoEmpleados) {
        this.id = id;
        this.nombre = nombre;
        this.listadoClientes = listadoClientes;
        this.listadoEmpleados = listadoEmpleados;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListadoCliente() {
        return listadoClientes;
    }

    public void setListadoCliente(List<Cliente> listadoCliente) {
        this.listadoClientes = listadoCliente;
    }

    public List<Empleado> getListadoEmpleado() {
        return listadoEmpleados;
    }

    public void setListadoEmpleado(List<Empleado> listadoEmpleado) {
        this.listadoEmpleados = listadoEmpleado;
    }

    public List<Directivo> getListadoDirectivo() {
        return listadoDirectivos;
    }

    public void setListadoDirectivo(List<Directivo> listadoDirectivo) {
        this.listadoDirectivos = listadoDirectivo;
    }

    @Override
    public String toString() {
        return "Empresa: " + "id: " + id + ", nombre: " + nombre + '}';
    }

}
