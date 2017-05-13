/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finanzas;

import java.util.ArrayList;

/**
 *
 * @author Lenin
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
