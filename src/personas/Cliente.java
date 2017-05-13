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
public class Cliente extends Persona{

    public Cliente(String nombre, String direccion, String correo, int edad, String rfc) {
        super(nombre, direccion, correo, edad, rfc);
    }

    @Override
    public String toString() {
        return this.razonSocial+"\t"+this.rfc+"\t"+this.direccion+"\t"+this.correo;
    }

    
}
