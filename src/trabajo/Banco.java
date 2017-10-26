package trabajo;
import java.util.*;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Banco {
    private String Nombre;
    private int id;
    private ArrayList<Administrador> admins;
    private ArrayList<Cuenta> cuentas ;
    private TreeMap< Integer, Cliente> clientes;
    private Cliente cliente;

    public Banco(String Nombre, int id) throws InputMismatchException{
        this.Nombre = Nombre;
        this.id = id;
        this.admins = new ArrayList<>();
        this.clientes = new TreeMap<>();
        this.cuentas = new ArrayList<>();
    }
  
     public void crearCliente(String nombre, int documento)throws InputMismatchException{
        Cliente a = new Cliente(nombre, documento);
        clientes.put(a.getDocumento(), a);
    }
    
    public void crearAdministrador(String nombre, int No_Admin) throws InputMismatchException{
        Administrador administrador = new Administrador(nombre,No_Admin);
        admins.add(administrador);
    }
    
    public void crearCuentas(int id, double credito, Cliente dueño) throws InputMismatchException{
        Cuenta cuenta = new Cuenta(id,credito,dueño);
        cuentas.add(cuenta);
    }
    
    
}
