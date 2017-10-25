package trabajo;
import java.util.ArrayList;

/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Administrador extends Persona {
    
    private int No_Admin;
    private ArrayList<Cliente> clientes;
    
    public Administrador (String nombre, int No_Admin){
        super(nombre);
        this.No_Admin = No_Admin;
        this.clientes = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente cliente) throws IllegalArgumentException {
        clientes.add(cliente);
    }    
}
