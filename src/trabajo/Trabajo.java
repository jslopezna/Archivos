package trabajo;
/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Trabajo {

    public static void main(String[] args) {
        
        Cliente a = new Cliente("A", 1);
        
        Administrador c = new Administrador ("C", 2);
        
        a.addAdmin(c);
        //System.out.println(a.getAdmin().toString());
    }
    
}
