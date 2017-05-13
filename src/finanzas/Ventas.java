
package finanzas;

import java.util.ArrayList;
import java.util.Arrays;
import personas.Empleado;

/*
 * Clase Ventas
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public class Ventas {
    private String  productos[],tipo;
    private double total;
    private Empleado empleado;
    public static ArrayList<Ventas> ventas = new ArrayList<>();
    public Ventas(String[] productos, double total, Empleado e,String tipo)
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
        this.tipo=tipo;
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
    public String getTipo()
    {
        return this.tipo;
    }
    public static ArrayList<Ventas> getVentas() {
        return Ventas.ventas;
    }
    
    @Override
    public String toString()
    {
        return "Productos: "+Arrays.toString(this.productos)+"\tEmpleado: "+this.empleado.getRazonSocial()+"\tTotal de venta: "+this.total+"\tTipo: "+this.tipo;
    }
    
    
}
