
package personas;

/*
 * Clase Persona
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public abstract class Persona {
    protected String razonSocial,direccion,correo, rfc;
    protected int edad;
    public Persona(String nombre, String direccion, String correo, int edad, String rfc)
    {
        this.razonSocial=nombre;
        this.direccion=direccion;
        this.correo=correo;
        this.rfc=rfc;
        if(edad>=18)
            this.edad=edad;
        else this.edad=18;
    }
    @Override
    public abstract String toString();
    
}
