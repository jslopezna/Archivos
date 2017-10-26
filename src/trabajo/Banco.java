package trabajo;
import java.io.*;
import java.util.*;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Banco {
    private String Nombre;
    private int id;
    private ArrayList<Administrador> admins;
    private ArrayList<Cuenta> cuentas ;
    private ArrayList<Cliente> clientes;
    

    public Banco(String Nombre, int id) throws InputMismatchException{
        this.Nombre = Nombre;
        this.id = id;
        this.admins = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }
  
     public void crearCliente(String nombre, int documento)throws InputMismatchException, FileNotFoundException, IOException{
        Cliente a= new Cliente(nombre,documento);
        File f = new File("Clientes.txt");
        if(!(f.exists())){
            f.createNewFile();
        }
        PrintWriter guardar = new PrintWriter(new FileWriter(f, true));
        guardar.println(a);
        guardar.close();
        clientes.add(a);
    }
    
    public void crearAdministrador(String nombre, int No_Admin) throws InputMismatchException, FileNotFoundException, IOException{
        Administrador administrador = new Administrador(nombre,No_Admin);
        File f = new File("Administradores.txt");
        if(!(f.exists())){
            f.createNewFile();
        }
        PrintWriter guardar = new PrintWriter(new FileWriter(f, true));
        guardar.println(administrador);
        guardar.close();
        admins.add(administrador);
    }
    
    public void crearCuentas(int id, double credito, Cliente dueño) throws InputMismatchException, FileNotFoundException, IOException{
        Cuenta cuenta = new Cuenta(id,credito,dueño);
        File f = new File("Cuentas.txt");
        if(!(f.exists())){
            f.createNewFile();
        }
        PrintWriter guardar = new PrintWriter(new FileWriter(f, true));
        guardar.println(cuenta);
        guardar.close();
        cuentas.add(cuenta);
    }
    
    
}
