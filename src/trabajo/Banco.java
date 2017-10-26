package trabajo;
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
  
     public void crearCliente(String nombre, int documento)throws InputMismatchException{
        Cliente c = new Cliente(nombre, documento);
        clientes.put(c.getDocumento(), c);
    }
    
    public void crearAdministrador(String nombre, int No_Admin) throws InputMismatchException{
        Administrador a = new Administrador(nombre,No_Admin);
        admins.put(a.getNo_Admin(), a);
    }
    
    public void crearCuentas(int id, double credito, Cliente dueño) throws InputMismatchException{
        Cuenta cu = new Cuenta(id,credito,dueño);
        cuentas.put(cu.getId(), cu);
    }
    
    
}
