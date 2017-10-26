package trabajo;

import java.util.ArrayList;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Cliente extends Persona{
    
    private int documento;
    private Administrador admin;
    private ArrayList<Cuenta> cuentas;

    @Override
    public String toString() {
        return "Cliente," + nombre + "," + documento + "," + admin + "," + cuentas+",";
    }
    
    public Cliente(String nombre, int documento) {
        super(nombre);
        this.documento = documento;
        this.cuentas = new ArrayList <>();
    }
    
    public void addCuentas (Cuenta cuenta) throws IllegalArgumentException {
        this.cuentas.add(cuenta);
    }
    
    public void addAdmin (Administrador admin) throws IllegalArgumentException {
        this.admin = admin;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    
}

