package trabajo;

import java.util.ArrayList;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Cliente extends Persona{
    
    private int documento;
    private Administrador admin;
    private ArrayList<Cuenta> cuentas;
    
    public Cliente(String nombre, int documento) {
        super(nombre);
        this.documento = documento;
        this.cuentas = new ArrayList <>();
    }

    public void addAdmin (Administrador admin) throws IllegalArgumentException {
        this.admin = admin;
    }
}

