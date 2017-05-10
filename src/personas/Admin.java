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
public class Admin implements Usuario{
    private String user, pwd;
    public Admin(String username, String password)
    {
        this.user=username;
        this.pwd=password;
    }

    @Override
    public ArrayList<Persona> verUsuarios() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double corteCaja()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword()
    {
        return this.pwd;
    }

    @Override
    public String getUsername()
    {
        return this.user;
    }
    
    @Override
    public String toString()
    {
        return this.user + "\t" + this.pwd;
    }
    
}
