package trabajo;
import java.util.*;

/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Administrador extends Persona {
    
    private int No_Admin;
    private ArrayList<Cliente> clientes;

    @Override
    public String toString() {
        return "Administrador," + No_Admin + "," + clientes +",";
    }
    
    public Administrador (String nombre, int No_Admin){
        super(nombre);
        this.No_Admin = No_Admin;
        this.clientes = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente cliente) throws InputMismatchException {
        clientes.add(cliente);
    }    

    public int getNo_Admin() {
        return No_Admin;
    }
    
}
