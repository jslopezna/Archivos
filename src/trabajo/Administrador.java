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
        ArrayList<String> nombres = new ArrayList<>();
        for(Cliente c: clientes){
            nombres.add(c.getNombre());
        }
        return "Administrador," + nombre + "," + No_Admin + "," + nombres +"." + "," ;
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
