package trabajo;
import java.util.*;
import java.util.Scanner;

/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Trabajo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Cliente a = new Cliente("A", 1);
        Banco b = new Banco("Bancolombia",1);
        Administrador c = new Administrador ("C", 2);
        
        System.out.println("Ingrese el Número de Documento del Cliente");
        int x = 0;
        try { x = s.nextInt();
        } catch(InputMismatchException e){
            System.out.println("El Número de Documento sólo puede estar compuesto por números enteros");
        }    
        
        b.crearCliente("a",x);
        
        //a.addAdmin(c);
        //System.out.println(a.getAdmin().toString());
    }
}
