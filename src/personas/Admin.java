
package personas;

import archivos.AbrirArchivo;
import archivos.EscribirArchivo;
import finanzas.Ventas;
import java.util.ArrayList;

/*
 * Clase Admin
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
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
    public double[] corteCaja()
    {
         
        double [] corte=AbrirArchivo.getVentas();
        
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
