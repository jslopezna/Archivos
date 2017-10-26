package trabajo;

import java.io.*;
import java.util.*;

/*
 * @autores Aldo Marquez, Mateo Pacheco, Luis Suarez, Juan Esteban Muñoz
 */
public class Banco {

    private String Nombre;
    private int id;
    public TreeMap<Integer, Administrador> admins;
    public TreeMap<Integer, Cuenta> cuentas;
    public TreeMap< Integer, Cliente> clientes;
    private Cliente cliente;

    public Banco(String Nombre, int id) throws InputMismatchException {
        this.Nombre = Nombre;
        this.id = id;
        this.admins = new TreeMap<>();
        this.clientes = new TreeMap<>();
        this.cuentas = new TreeMap<>();
        File a = new File("Administradores.txt");
        if (a.exists()) {
            leerAdministrador(a.getAbsolutePath());
        }
        File c = new File("Clientes.txt");
        if (c.exists()) {
            leerCliente(c.getAbsolutePath());
            File cu = new File("Cuentas.txt");
            if (cu.exists()) {
                leerCuenta(cu.getAbsolutePath());
            }
        }
    }

    private void leerCliente(String archivo) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(archivo));

            sc.useDelimiter(",");
        } catch (FileNotFoundException e) {
            System.out.println("File not found -- " + archivo);
            e.printStackTrace();

            while (sc.hasNext()) {

                if (("{".equals(sc.next()))) {

                    sc.skip("{");
                } else if ("}".equals(sc.next())) {
                    sc.skip("}");
                }

                Cliente nuevoCliente = null;
                sc.next("Cliente");

                String nombre = sc.next().trim();
                String documento = sc.next().trim();
                sc.next("Administrador");
                sc.next();
                String admin_No = sc.next();
                sc.next(".");

                int d = 0;
                d = Integer.parseInt(documento);
                int ad = 0;
                ad = Integer.parseInt(admin_No);

                nuevoCliente = new Cliente(nombre, d);
                admins.get(ad).agregarCliente(nuevoCliente);
                nuevoCliente.addAdmin(admins.get(ad));
                clientes.put(nuevoCliente.getDocumento(), nuevoCliente);
            }

        }
    }

    public void crearCliente(String nombre, int documento) throws InputMismatchException, FileNotFoundException, IOException {
        Cliente c = new Cliente(nombre, documento);

        clientes.put(c.getDocumento(), c);
    }

    private void leerAdministrador(String archivo) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(archivo));

            sc.useDelimiter(",");
        } catch (FileNotFoundException e) {
            System.out.println("File not found -- " + archivo);
            e.printStackTrace();

            while (sc.hasNext()) {

                if (("{".equals(sc.next()))) {

                    sc.skip("{");
                } else if ("}".equals(sc.next())) {
                    sc.skip("}");
                }

                Administrador nuevoAdministrador = null;

                sc.next("Administrador");

                String nombre = sc.next().trim();
                String no_Admin = sc.next().trim();

                int d = 0;
                d = Integer.parseInt(no_Admin);
                nuevoAdministrador = new Administrador(nombre, d);
                admins.put(nuevoAdministrador.getNo_Admin(), nuevoAdministrador);

            }

        }
    }

    public void crearAdministrador(String nombre, int No_Admin) throws InputMismatchException, FileNotFoundException, IOException {
        Administrador administrador = new Administrador(nombre, No_Admin);
        admins.put(administrador.getNo_Admin(), administrador);
    }

    private void leerCuenta(String archivo) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File(archivo));

            sc.useDelimiter(",");

        } catch (FileNotFoundException e) {
            System.out.println("File not found -- " + archivo);
            e.printStackTrace();

            while (sc.hasNext()) {

                if (("{".equals(sc.next()))) {

                    sc.skip("{");
                } else if ("}".equals(sc.next())) {
                    sc.skip("}");
                }

                Cuenta nuevaCuenta = null;
                sc.next("Cuenta");

                String id = sc.next().trim();
                String credito = sc.next().trim();
                sc.next();
                String documento = sc.next();

                int d = 0;
                d = Integer.parseInt(id);
                double cred = 0;
                cred = Double.parseDouble(credito);
                int doc = 0;
                doc = Integer.parseInt(documento);

                nuevaCuenta = new Cuenta(d, cred, clientes.get(doc));
                clientes.get(doc).addCuentas(nuevaCuenta);
                cuentas.put(nuevaCuenta.getId(), nuevaCuenta);
            }

        }
    }

    public void crearCuentas(int id, double credito, Cliente dueño) throws InputMismatchException, FileNotFoundException, IOException {
        Cuenta cuenta = new Cuenta(id, credito, dueño);
        cuentas.put(cuenta.getId(), cuenta);
    }

    public void guardarTodo() throws IOException {
        File cu = new File("Cuentas.txt");
        if (!(cu.exists())) {
            cu.createNewFile();
        }
        File a = new File("Administradores.txt");
        if (!(a.exists())) {
            a.createNewFile();
        }
        File c = new File("Clientes.txt");
        if (!(c.exists())) {
            c.createNewFile();
        }

        PrintWriter adm = new PrintWriter(new FileWriter(a, true));
        adm.println(admins);
        adm.close();

        PrintWriter cuen = new PrintWriter(new FileWriter(cu, true));
        cuen.println(cuentas);
        cuen.close();

        PrintWriter cli = new PrintWriter(new FileWriter(c, true));
        cli.println(clientes);
        cli.close();
    }
}
