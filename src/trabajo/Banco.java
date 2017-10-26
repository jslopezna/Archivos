package trabajo;
import java.io.*;
import java.util.*;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Banco {
    private String Nombre;
    private int id;
    public TreeMap<Integer, Administrador> admins;
    public TreeMap<Integer, Cuenta> cuentas ;
    public TreeMap< Integer, Cliente> clientes;
    private Cliente cliente;

    public Banco(String Nombre, int id) throws InputMismatchException{
        this.Nombre = Nombre;
        this.id = id;
        this.admins = new TreeMap<>();
        this.clientes = new TreeMap<>();
        this.cuentas = new TreeMap<>();
    }
  

     public void crearCliente(String nombre, int documento)throws InputMismatchException, FileNotFoundException, IOException{
        Cliente c= new Cliente(nombre,documento);
        File f = new File("Clientes.txt");
        if(!(f.exists())){
            f.createNewFile();
        }
        PrintWriter guardar = new PrintWriter(new FileWriter(f, true));
        guardar.println(c);
        guardar.close();
        clientes.put(c.getDocumento(), c);
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
        admins.put(administrador.getNo_Admin(), administrador);
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
        cuentas.put(cuenta.getId(), cuenta);
    }
}
    
    

