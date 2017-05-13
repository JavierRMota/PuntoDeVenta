/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finanzas;

/**
 *
 * @author Lenin
 */
public abstract class Electronico extends Articulo{
    protected static final String PREFIJO = "AET";
    protected static final int CANT_MIN = 7; //Sirve para determinar si se tienen que pedir más artículos
    protected static final int CANT_MAX = 20; //Sirve para determinar si ya no se pueden pedir más artículos
    protected static int cantidadElectronicos = 0;
    protected static String[] electronicos = new String[20]; //Almacena los codigos de todos los artículos electrónicos. Capacidad para 20 electrónicos

    public Electronico() {
        //No es necesario invocar al constructor del padre pues sólo hay default
        cantidadElectronicos ++;
        //Cada vez que se crea un objeto, aumenta la cantidad
    }

    public static int getCantidadElectronicos() {
        return cantidadElectronicos;
    }
}
