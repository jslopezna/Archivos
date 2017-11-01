package trabajo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Trabajo {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        //Cliente a = new Cliente("", 1);
        Banco b = new Banco("Banco de Hierro", 1234);
        //Administrador c = new Administrador ("C", 2);

        try {
            b.crearAdministrador( "Jorge", 123);
        } catch (InputMismatchException e) {
            System.out.println(" NO FUE POSIBLE CREAR EL ADMINISTRADOR ");
        }

        try {
            b.crearCliente("Leonardo", 987654321);
        } catch (InputMismatchException e) {
            System.out.println(" NO FUE POSIBLE CREAR EL CLIENTE");
        }

        try {
            b.crearCliente("Donatello", 123456789);
        } catch (InputMismatchException e) {
            System.out.println(" NO FUE POSIBLE CREAR EL CLIENTE");
        }
int id = 0;
        try {
            
            double credito = 0.0;
            b.crearCuentas(id, credito, b.clientes.get(987654321));
        } catch (InputMismatchException e) {
            System.out.println(" NO FUE POSIBLE CREAR LA CUENTA ");
        }
        try{
        b.admins.get(123).agregarCliente(b.clientes.get(987654321));
        }catch(InputMismatchException e){
          System.out.println(" NO se ecncontro cliente ");  
        }
        b.admins.get(123).agregarCliente(b.clientes.get(123456789));    
        
        b.clientes.get(987654321).addAdmin(b.admins.get(123));
        b.clientes.get(123456789).addAdmin(b.admins.get(123));
        
        b.clientes.get(987654321).addCuentas(b.cuentas.get(id));

        b.guardarTodo();

        /*int x = 0;
        try { x = s.nextInt();
        } catch(InputMismatchException e){
            System.out.println("El Número de Documento sólo puede estar compuesto por números enteros");
<<<<<<< HEAD (6ba8e27) - 
        }    
        
        try {
            b.crearCliente("a", 47156);
            
            
            //a.addAdmin(c);
            //System.out.println(a.getAdmin().toString());
        } catch (IOException ex) {
            Logger.getLogger(Trabajo.class.getName()).log(Level.SEVERE, null, ex);
        }
=======
        }   
        b.crearCliente("a",x);
        
        int c = 0;
        try { c = s.nextInt();
        } catch(InputMismatchException e){
            System.out.println("El Número de Documento sólo puede estar compuesto por números enteros");
        }   
        b.crearAdministrador("b", c);
        
        int v = 0;
        int id = 0;
        double credito = 0;        
        try { v = s.nextInt();
        } catch(InputMismatchException e){
            System.out.println("El Número de Documento sólo puede estar compuesto por números enteros");
        }   
        b.crearCuentas(v, id, b.crearCliente(nombre, c));
        //a.addAdmin(c);
        //System.out.println(a.getAdmin().toString());*/
    }
}
