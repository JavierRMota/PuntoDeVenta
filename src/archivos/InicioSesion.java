/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.util.ArrayList;
import java.util.Arrays;
import personas.*;


/**
 *
 * @author Javier
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
