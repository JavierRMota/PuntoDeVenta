
package personas;

/*
 * Clase Cliente
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public class Cliente extends Persona{

    public Cliente(String nombre, String direccion, String correo, int edad, String rfc) {
        super(nombre, direccion, correo, edad, rfc);
    }

    @Override
    public String toString() {
        return this.razonSocial+"\t"+this.rfc+"\t"+this.direccion+"\t"+this.correo+"\t"+this.edad;
    }
    public void facturar()
    {
        
    }
    public String getNombre()
    {
        return this.razonSocial;
    }
    public String getRfc()
    {
        return this.rfc;
    }

    
}
