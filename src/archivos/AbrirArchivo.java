/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
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
            return arr;
        }
    }
    
    
}
