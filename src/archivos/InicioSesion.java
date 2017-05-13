
package archivos;

import java.util.ArrayList;
import java.util.Arrays;
import personas.*;


/*
 * Clase InicioSesion
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */

public class InicioSesion {
 
    public static Usuario iniciarSesion(String username, String password)
    {
        Usuario user= null;
        ArrayList<Usuario> arr = AbrirArchivo.abrirArchivoUsuarios();
        for(Usuario u : arr){
            if(u.getPassword().equals(password) && u.getUsername().equals(username)) 
            {
                user = u;
                break;
            }
        }
        return user;
    }
}
