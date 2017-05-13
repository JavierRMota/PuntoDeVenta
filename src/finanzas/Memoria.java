
package finanzas;

import archivos.EscribirArchivo;

/*
 * Clase Memoria
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: mayo 12, 2017.
 * Proyecto final
 */
public class Memoria extends Electronico{
    private final int capacidadGB;
    private final String tipo;
    public final String[] tiposMemoria = {"USB", "SD","MicroSD"};
    private static final String SUFIJO = "MEM";
    private static final double PRECIO_MIN = 150.0;
    private static final double PRECIO_MAX = 500.0;
    private String codigoEntrada;

    public Memoria(int capacidad, String tipo, double precio) {
        this.tipo = tipo;
        this.capacidadGB = capacidad;
        if(precio<PRECIO_MIN){
            this.precio = PRECIO_MIN;
        }else if (precio>PRECIO_MAX){
            this.precio = PRECIO_MAX;
        }
        else{
            this.precio = precio;
        }
        if (this.tipo.equalsIgnoreCase("USB")){
            this.codigoEntrada = "USB";
        }else if (this.tipo.equalsIgnoreCase("SD")){
            this.codigoEntrada = "SD";
        }else if (this.tipo.equalsIgnoreCase("MicroSD")){
            this.codigoEntrada = "MSD";
        }else this.codigoEntrada="MEM";
        generarCodigo();
     
    }
    
    private void generarCodigo(){
        for(int i = 0; i<Electronico.electronicos.length;i++){
            if (Electronico.electronicos[i] == null){//De esa forma se logra que se reciclen los códigos una vez que se vende un artículo
                this.codigo = Electronico.PREFIJO + SUFIJO + "||"+this.codigoEntrada+"00" + i;
                Electronico.electronicos[i] = this.codigo; //Lo guarda en el array de artículos electrónicos
                break;
            }
        }
    }
    


    public String getTipo() {
        return tipo;
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
    public String getCodigo() {
        return this.codigo;
    }
    
    @Override
    public String toString() {
        return this.codigo+"\tMemoria "+ this.tipo+" "+this.capacidadGB+" $"+this.precio;
    }
}
