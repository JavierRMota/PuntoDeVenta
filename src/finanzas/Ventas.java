/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finanzas;

import java.util.ArrayList;
import personas.Empleado;

/**
 *
 * @author Javier
 */
public class Ventas {
    private String [] productos;
    private double total;
    private Empleado empleado;
    public static ArrayList<Ventas> ventas = new ArrayList<>();
    public Ventas(String[] productos, double total, Empleado e)
    {
        if(e!= null)
            this.empleado = new Empleado(e.getUsername(), e.getPassword(),e.getRazonSocial(), e.getDireccion(),e.getCorreo(), e.getEdad(), e.getRfc());
        this.productos = new String[productos.length];
        for (int x = 0; x< productos.length;x++)
        {
            this.productos[x] = productos[x];
        }
        if(total>=0) this.total=total;
        else this.total=0;
        ventas.add(this);
    }

    public String[] getProductos() {
        return this.productos;
    }

    public double getTotal() {
        return this.total;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public static ArrayList<Ventas> getVentas() {
        return Ventas.ventas;
    }
    @Override
    public String toString()
    {
        return "Productos: "+this.productos+"\tEmpleado: "+this.empleado.getRazonSocial()+"\tTotal de venta: "+this.total;
    }
    
    
}
