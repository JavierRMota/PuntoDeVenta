/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import archivos.AbrirArchivo;
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
    public ArrayList<Usuario> verUsuarios() {
        ArrayList<Usuario> arr = new ArrayList<>();
        for(Usuario u : AbrirArchivo.abrirArchivoUsuarios() )
        {
            if(u instanceof Persona)
            {
                Empleado e = (Empleado) u;
                arr.add(new Empleado(e.getUsername(), "NO PERMITIDO", e.getRazonSocial(), e.getDireccion(), e.getCorreo(), e.getEdad(), e.getRfc()));
            }
        }
        return arr; 
    }

    @Override
    public double corteCaja() {
        Venta.getVentas();
        return 0.0;
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

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getCorreo() {
        return this.correo;
    }

    public String getRfc() {
        return rfc;
    }

    public int getEdad() {
        return this.edad;
    }
    
}
