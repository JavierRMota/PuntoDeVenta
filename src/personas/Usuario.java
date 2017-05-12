/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public interface Usuario {
    ArrayList<Usuario> verUsuarios();
    double corteCaja();
    String getPassword();
    String getUsername();
    @Override
    String toString();
    
    
}
