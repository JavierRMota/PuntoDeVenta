
package archivos;

import finanzas.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import personas.*;

/*
 * Clase EscribirArchivo
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public class EscribirArchivo {
    public static void escribirUsuarios(ArrayList<Usuario> arr) {
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter("users.txt"));
            for (Usuario u: arr)
            {
                salida.println(u.toString());
            }
            /*salida.close();
            salida = new PrintWriter(new FileWriter("datos.txt",true));
            for(int i=0; i<10; i++) {
                salida.println( (int)(Math.random()*100)+1 );
            }*/
        }
        catch (IOException ex) {
            System.out.println("Error al escribir en el archivo" + ex);
        } finally {
            salida.close();
        }
    }
    public static boolean addUser(Usuario u)
    {
        ArrayList<Usuario> arr = AbrirArchivo.abrirArchivoUsuarios();
        arr.add(u);
        escribirUsuarios(arr);
        return true;
    }
    public static boolean addProducto(Articulo a)
    {
        ArrayList<String> arr = new ArrayList<>();
        for (String prod : AbrirArchivo.getArticulos()){
            arr.add(prod);
        }
        arr.add(a.toString());
        escribirArticulos(arr);
        
        return true;
    }

    public static void escribirArticulos(ArrayList<String> arr) {
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter("articulos.txt"));
            for (String a: arr)
            {
                salida.println(a);
            }

        }
        catch (IOException ex) {
            System.out.println("Error al escribir en el archivo" + ex);
        } finally {
            salida.close();
        }
    }
    public static void escribirCorte() {
        ArrayList<Ventas> arr = Ventas.getVentas();
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter("CorteDeCaja.txt", true));
            for (Ventas a: arr)
            {
                salida.println(a);
            }

        }
        catch (IOException ex) {
            System.out.println("Error al escribir en el archivo" + ex);
        } finally {
            salida.close();
        }
    }
}
