
package personas;

import java.util.ArrayList;

/*
 * Interfaz Usuario
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public interface Usuario {
    ArrayList<Usuario> verUsuarios();
    double[] corteCaja();
    String getPassword();
    String getUsername();
    @Override
    String toString();
    
    
}
