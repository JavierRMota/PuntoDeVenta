
package personas;

import archivos.*;
import java.util.ArrayList;
import finanzas.*;

/*
 * Clase Empleado
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
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
    public double[] corteCaja() {
        ArrayList<Ventas> ventas = Ventas.getVentas();
        double [] corte= new double[] {0.0};
        for(Ventas v: ventas)
        {
            if(v.getTipo().equalsIgnoreCase("Efectivo"))
                corte[0]+=v.getTotal();
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
