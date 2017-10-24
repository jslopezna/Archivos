package trabajo;

import java.util.ArrayList;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Banco {
    private String Nombre;
    private int id;
    private ArrayList<Administrador> admins;
    private ArrayList<Cuenta> cuentas ;
    private ArrayList<Cliente> clientes;
    private Cliente cliente;

    public Banco(String Nombre, int id) {
        this.Nombre = Nombre;
        this.id = id;
        this.admins = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }
  
     public void crearCliente(String nombre, int documento)throws IllegalArgumentException{
         Cliente a= new Cliente(nombre,documento);
        clientes.add(a);
    }
    
    public void crearAdministrador(String nombre, int No_Admin){
        Administrador administrador = new Administrador(nombre,No_Admin);
        admins.add(administrador);
    }
    
    public void agregarCuentas(int id, double credito, Cliente dueño) throws IllegalArgumentException{
        Cuenta cuenta = new Cuenta(id,credito,dueño);
        cuentas.add(cuenta);
    }
    
    
}
