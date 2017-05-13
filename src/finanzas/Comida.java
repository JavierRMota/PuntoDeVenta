
package finanzas;

import archivos.EscribirArchivo;

/*
 * Clase Comida
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public class Comida extends Consumible{
    private static final String SUFIJO = "CM";
    private String codigoTipo;
    private final String tipo;
    public final String[] tiposComida = {"Rapida", "Dulces","Botana", "Mascotas"};
    private static String[] comidas = new String[30]; //Capacidad para 30 artículos de comida

    public Comida(String tipo, double precio) {
        this.tipo = tipo;
        if (precio>0){
            this.precio = precio;
        }
        
        if (this.tipo.equalsIgnoreCase("Rapida")){
            this.codigoTipo = "RD";
        }else if (this.tipo.equalsIgnoreCase("Dulces")){
            this.codigoTipo = "DUL";
        }else if (this.tipo.equalsIgnoreCase("Botana")){
            this.codigoTipo = "BN";
        }else if (this.tipo.equalsIgnoreCase("Mascotas")){
            this.codigoTipo = "MAS";
        }else this.codigoTipo="COM";
        generarCodigo();
        
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
        for(int i = 0; i<Comida.comidas.length;i++){
            if (Comida.comidas[i] == null){
                this.codigo = Consumible.PREFIJO + Comida.SUFIJO + "||"+this.codigoTipo+"00" + i;
                Comida.comidas[i] = this.codigo; //Lo guarda en el array de artículos electrónicos
                break;
            }
        } 
    }
    
    @Override
    public String toString() {
        return this.codigo+"\tComida "+ this.tipo+" $"+this.precio;
    }
}