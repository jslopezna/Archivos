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
        
        Administrador c = new Administrador ("C", 2);
        try{int x= s.nextInt();
        Banco b = new Banco("Bancolombia",1);}catch(InputMismatchException e){
            System.out.println("error");
        };
        
        //b.crearCliente("a",x);
        a.addAdmin(c);
        //System.out.println(a.getAdmin().toString());
    }
    
}
