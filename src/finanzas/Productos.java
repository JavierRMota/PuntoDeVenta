/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finanzas;

import java.util.ArrayList;

/*
 *
 * @author Javier
 */
public class Productos 
{
    public static ArrayList<Productos> productos = new ArrayList<>();
    private String nombre, clave;
    private double precio;
    public Productos(String nombre, String clave, double precio)
    {
        if(precio>0) this.precio=precio;
        else this.precio=0.0;
        this.nombre=nombre;
        this.clave=clave;
    }
    public static void agregarLista(Productos c)
    {
        Productos.productos.add(c);
    }    
}
