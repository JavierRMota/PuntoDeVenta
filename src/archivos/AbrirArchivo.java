/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import finanzas.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import personas.*;

/**
 *
 * @author Javier
 */
public class AbrirArchivo {
    
    public static ArrayList<Usuario> abrirArchivoUsuarios()
    {
        Scanner entrada = null;
        String username,password, direccion, correo, rfc, nombre;
        int edad;
        ArrayList<Usuario> arr = new ArrayList<>();
        try {
		entrada = new Scanner(new FileReader("users.txt"));
		entrada.useDelimiter("[\t\n\r]+");
		while (entrada.hasNextLine() ) {
                    username = entrada.next();
                    password= entrada.next();
                    if(username.equals("admin")){
                        arr.add(new Admin(username,password));
                        
                    }
                    else
                    {
                        nombre = entrada.next();
                        rfc = entrada.next();
                        direccion= entrada.next();
                        correo= entrada.next();
                        edad = entrada.nextInt();
                        
                        arr.add(new Empleado(username,password,nombre,direccion,correo,edad, rfc));  
                    }
		}				 
        }		
        catch (FileNotFoundException e) 
        {
            System.err.println(e);
            System.out.println("Archivo NO encontrado!!");
        } 
        catch (InputMismatchException e)
        {
            System.err.println(e);
            System.out.println("Error en el tipo de datos!!");
        }
        catch (NoSuchElementException e) 
        {
            System.err.println(e);
            System.out.println("Error durante la lectura, faltan datos!!");
        }
        finally 
        {
            entrada.close();
            
        }
        return arr;
    }
    public static String[] getArticulos()
    {
        Scanner entrada = null;
        String linea;
        ArrayList<String> arr = new ArrayList<>();
        try {
		entrada = new Scanner(new FileReader("articulos.txt"));
		entrada.useDelimiter("[\t\n\r]+");
		while (entrada.hasNextLine() ) {
                    linea= entrada.nextLine();
                    arr.add(linea);  
		}				 
        }		
        catch (FileNotFoundException e) 
        {
            System.err.println(e);
            System.out.println("Archivo NO encontrado!!");
        } 
        catch (InputMismatchException e)
        {
            System.err.println(e);
            System.out.println("Error en el tipo de datos!!");
        }
        catch (NoSuchElementException e) 
        {
            System.err.println(e);
            System.out.println("Error durante la lectura, faltan datos!!");
        }
        finally 
        {
            entrada.close();
            String[] articulos = new String[arr.size()];
            for (int x=0; x<arr.size();x++)
            {
                articulos[x]=arr.get(x);
                
                /*String[] arr2 = articulos[x].split(" ");
                StringBuilder tipo = new StringBuilder(arr2.length-2);
                for(int a=1;a<arr2.length-1;x++)
                {
                    tipo.append(arr2[a]);
                }
                tipo.trimToSize();
                switch (arr2[0].split("\t")[1])
                {
                    case "Bebida":
                        Bebida b = new Bebida(tipo.toString(),parseDouble(arr2[arr2.length-1].substring(1)));
                        break;
                    case "Cargador":
                        Cargador c1 = new Cargador(tipo.toString(),parseDouble(arr2[arr2.length-1].substring(1)));
                        break;
                    case "Comida":
                        Comida c2 = new Comida(tipo.toString(),parseDouble(arr2[arr2.length-1].substring(1)));
                        break;
                    case "Memoria":
                        Memoria m = new Memoria(tipo.toString(),parseDouble(arr2[arr2.length-1].substring(1)));
                        break;
                }*/
            }
            
            return articulos;
                    
        }
        
    }
    
}
