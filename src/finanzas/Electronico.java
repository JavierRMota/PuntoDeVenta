
package finanzas;

/*
 * Clase Electronico
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
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
