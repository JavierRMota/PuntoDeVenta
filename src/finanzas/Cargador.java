
package finanzas;

import archivos.EscribirArchivo;

/*
 * Clase Cargador
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public class Cargador extends Electronico{
    private final String entrada;
    public final String[] tiposEntrada = {"lightning", "microUSB"};
    private static final String SUFIJO = "CAR";
    private static final double PRECIO_MIN = 25.0;
    private static final double PRECIO_MAX = 150.0;
    private String codigoEntrada; 
    

    public Cargador(String entrada, double precio) {
        this.entrada = entrada;
        
        if(precio<PRECIO_MIN){
            this.precio = PRECIO_MIN;
        }else if (precio>PRECIO_MAX){
            this.precio = PRECIO_MAX;
        }
        else{
            this.precio = precio;
        }
        if (this.entrada.equalsIgnoreCase("lightning")){
            this.codigoEntrada = "LN";
        }else if (this.entrada.equalsIgnoreCase("microUSB")){
            this.codigoEntrada = "MUSB";
        }else this.codigoEntrada ="CARG";
        generarCodigo();
        
        
        
    }

    private void generarCodigo(){
        for(int i = 0; i<Electronico.electronicos.length;i++){
            if (Electronico.electronicos[i] == null){
                this.codigo = Electronico.PREFIJO + SUFIJO + "||"+this.codigoEntrada+"00" + i;
                Electronico.electronicos[i] = this.codigo; //Lo guarda en el array de artículos electrónicos
                break;
            }
        } 
    }
    
    public String getEntrada() {
        return entrada;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }
    
    @Override
    public void setPrecio(double precio) {
        if(precio<PRECIO_MIN){
            this.precio = PRECIO_MIN;
        }else if (precio>PRECIO_MAX){
            this.precio = PRECIO_MAX;
        }
        else{
            this.precio = precio;
        }
    }

    @Override
    public String toString() {
        return this.codigo+"\tMemoria "+ this.entrada+" $"+this.precio;            
    }
    
    
}
