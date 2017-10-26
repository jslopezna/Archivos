package trabajo;
import java.util.InputMismatchException;

/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Cuenta {
    private int id;
    private double credito;
    private Cliente dueño;

    @Override
    public String toString() {
        return "Cuenta," + id + "," + credito + "," + dueño;
    }
    
    public Cuenta (int id, double credito, Cliente dueño) throws InputMismatchException{
        this.id = id;
        this.credito = credito;
        this.dueño = dueño;
    }

    public int getId() {
        return id;
    }
    
}
