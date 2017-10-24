package trabajo;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Cuenta {
    private int id;
    private double credito;
    private Cliente dueño;
    
    public Cuenta (int id, double credito, Cliente dueño){
        this.id = id;
        this.credito = credito;
        this.dueño = dueño;
    }
    
}
