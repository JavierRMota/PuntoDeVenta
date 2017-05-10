
package practica6;

/*
 * Clase ArregloVentas
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * Fecha: marzo 23, 2017.
 * Práctica #6 - Arreglos
 */
public class ArregloVentas {
    protected int[] ventas;

    public ArregloVentas() {
        this.ventas = new int[12];
    }
    public ArregloVentas(int[] ventas) {
        this.ventas = new int[12];
        for(int x=0;x<this.ventas.length;x++)
        {
            this.ventas[x]=ventas[x];
        }
    }
    public int getVenta(int pos)
    {
        if(pos>=0&&pos<this.ventas.length)
        {
            return this.ventas[pos];
        }
        return -1;
    }
    public void setVenta(int pos, int dato)
    {
        if(pos>=0&&pos<this.ventas.length && dato>=0)
        {
           this.ventas[pos]=dato;
        }
    }

    @Override
    public String toString() {
        return "\nEnero: "+this.ventas[0]
                +"\nFebrero: "+this.ventas[1]
                +"\nMarzo: "+this.ventas[2]
                +"\nAbril: "+this.ventas[3]
                +"\nMayo: "+this.ventas[4]
                +"\nJunio: "+this.ventas[5]
                +"\nJulio: "+this.ventas[6]
                +"\nAgosto: "+this.ventas[7]
                +"\nSeptiembre: "+this.ventas[8]
                +"\nOctubre: "+this.ventas[9]
                +"\nNoviembre: "+this.ventas[10]
                +"\nDiciembre: "+this.ventas[11];
    }
    
}
