/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finanzas;

import archivos.EscribirArchivo;

/**
 *
 * @author Lenin
 */
public class Bebida extends Consumible{
    private static final String SUFIJO = "B";
    private String codigoTipo;
    private final String tipo;
    public final String[] tiposBebida = {"Alcoholica", "Energetica","Refresco", "Jugo", "Agua"};
    private static String[] bebidas = new String[30]; //Capacidad para 30 artículos de bebida

    public Bebida(String tipo, double precio) {
        this.tipo = tipo;
        if (precio>0){
            this.precio = precio;
        }
        
        if (this.tipo.equalsIgnoreCase("Alcoholica")){
            this.codigoTipo = "AL";
        }else if (this.tipo.equalsIgnoreCase("Energetica")){
            this.codigoTipo = "EN";
        }else if (this.tipo.equalsIgnoreCase("Refresco")){
            this.codigoTipo = "RF";
        }else if (this.tipo.equalsIgnoreCase("Jugo")){
            this.codigoTipo = "JG";
        }else if (this.tipo.equalsIgnoreCase("Agua")){
            this.codigoTipo = "H2O";
        }
        generarCodigo();
        EscribirArchivo.addProducto(this);
    }

    @Override
    public void setPrecio(double precio) {
        if (precio>0){
            this.precio = precio;
        }
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }
    
    private void generarCodigo(){
        for(int i = 0; i<Bebida.bebidas.length;i++){
            if (Bebida.bebidas[i] == null){
                this.codigo = Consumible.PREFIJO + Bebida.SUFIJO + "||"+this.codigoTipo+"00" + i;
                Bebida.bebidas[i] = this.codigo; //Lo guarda en el array de artículos electrónicos
                break;
            }
        } 
    }
    
    @Override
    public String toString() {
        return this.codigo+"\tBebida "+ this.tipo+" $"+this.precio;
    }
    
}
