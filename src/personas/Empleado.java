/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.ArrayList;
import finanzas.*;

/**
 *
 * @author Javier
 */
public class Empleado extends Persona implements Usuario{
    private String user, pwd;

    public Empleado(String username, String password, String nombre, String direccion, String correo, int edad, String rfc) {
        super(nombre, direccion, correo, edad, rfc);
        this.pwd=password;
        this.user=username;
    }

    @Override
    public ArrayList<Persona> verUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double corteCaja() {
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
        return this.user + "\t"+ this.pwd + "\t"+ this.razonSocial + "\t"+ this.rfc + "\t"+ this.direccion + "\t" + this.correo + "\t" + this.edad;
    }
    
}
