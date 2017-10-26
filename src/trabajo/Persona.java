package trabajo;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public abstract class Persona {

    public String nombre;
    
    public Persona(String nombre) throws IllegalArgumentException {
        this.nombre = nombre;
    }
    
}
