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
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void agregarente(Cliente cliente){
        clientes.add(cliente);
    }
    
    
}
