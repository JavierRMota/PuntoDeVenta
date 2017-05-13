/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import archivos.AbrirArchivo;
import archivos.EscribirArchivo;
import finanzas.Ventas;
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
    public ArrayList<Usuario> verUsuarios() 
    {
        ArrayList<Usuario> arr = new ArrayList<>();
        for(Usuario u : AbrirArchivo.abrirArchivoUsuarios() )
        {
            if(u instanceof Persona)
            {
                Empleado e = (Empleado) u;
                arr.add(new Empleado(e.getUsername(), e.getPassword(), e.getRazonSocial(), e.getDireccion(), e.getCorreo(), e.getEdad(), e.getRfc()));
            }
        }
        return arr;
    }

    @Override
    public double corteCaja()
    {
        ArrayList<Ventas> ventas = Ventas.getVentas();
        double corte=0;
        for(Ventas v: ventas)
        {
            corte+=v.getTotal();
        }
        EscribirArchivo.escribirCorte();
        return corte;
        
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
