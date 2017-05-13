
package finanzas;

import java.util.ArrayList;

/*
 * Clase Articulo
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public abstract class Articulo {
    protected String codigo;
    protected double precio;
    

    public Articulo() {
    }

    public double getPrecio() {
        return precio;
    }
    public abstract void setPrecio(double precio);
    public abstract String getCodigo();
    public String toString()
    {
        return this.codigo+"\t"+this.precio;
    }
}
