/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author Javier
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
