/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finanzas;

/**
 *
 * @author Lenin
 */
public abstract class Consumible extends Articulo{
    protected static final String PREFIJO = "AC";
    
    public Consumible() {
        //No es necesario invocar al constructor del padre pues sólo hay default
    }
}
