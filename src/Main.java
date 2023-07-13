import Service.ServicioCliente;
import Service.ServicioRutina;

import java.util.Scanner;

public class Main {
    /**
     * Crea al menos cinco clientes con datos ficticios.
     * Crea al menos cinco rutinas con datos ficticios.
     * Registra los clientes creados en el sistema utilizando el método correspondiente del servicio de clientes.
     * Agrega las rutinas creadas al sistema utilizando el método correspondiente del servicio de rutinas.
     * Obtén la lista de todos los clientes registrados y muéstralos por pantalla.
     * Obtén la lista de todas las rutinas registradas y muéstralas por pantalla.
     * Realiza una actualización en uno de los clientes existentes y muestra la lista de clientes actualizada.
     * Realiza una actualización en una de las rutinas existentes y muestra la lista de rutinas actualizada.
     * Elimina uno de los clientes existentes y muestra la lista de clientes final.
     * Elimina una de las rutinas existentes y muestra la lista de rutinas fina
     */
    public static void main(String[] args) {
        ServicioCliente serviceCliente = new ServicioCliente();
        ServicioRutina servicioRutina = new ServicioRutina();

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al gimnasio");
        System.out.println("Ingrese que opcion necesita");
        System.out.println("1:Ingresar un nuevo cliente");
        System.out.println("2:Obtener los clientes del gimnasio");
        System.out.println("3:Actualizar un cliente");
        System.out.println("4:Eliminar un cliente");
        System.out.println("5:Ingresar una nueva rutina");
        System.out.println("6:Obtener las rutina del gimnasio");
        System.out.println("7:Actualizar una rutina");
        System.out.println("8:Eliminar una rutina");
        System.out.println("0:Salir del gym virtual");
        int eleccion = -1;

        do {
            eleccion = Integer.parseInt(sc.nextLine());
            switch (eleccion) {
                case 1:
                    serviceCliente.registrarCliente();
                    break;
                case 2:
                    System.out.println(serviceCliente.obtenerClientes());
                    break;
                case 3:
                    System.out.println("Ingrese el numero de Id del cliente que quiere actualizar");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad");
                    int edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese la altura");
                    double altura = Double.parseDouble(sc.nextLine());
                    System.out.println("Ingrese el peso");
                    double peso = Double.parseDouble(sc.nextLine());
                    System.out.println("Ingrese el objetivo");
                    String obj = sc.nextLine();
                    serviceCliente.actualizarCliente(id, nombre, edad, altura, peso, obj);
                    break;
                case 4:
                    System.out.println("Ingrese el numero del id del cliente que quiere eliminar");
                    int idNuevo = Integer.parseInt(sc.nextLine());
                    serviceCliente.eliminarCliente(idNuevo);
                    break;
                case 5:
                    servicioRutina.instanciarRutina();
                    break;
                case 6:
                    System.out.println(servicioRutina.obtenerRutinas());
                    break;
                case 7:
                    System.out.println("Ingrese el id de la rutina que quiere actualizar");
                    int idNew = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el nombre de la rutina");
                    String nombreNew = sc.nextLine();
                    System.out.println("Ingrese la duracion de la rutina");
                    int duracionNew = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el nivel de dificultad");
                    String nivel = sc.nextLine();
                    System.out.println("Ingrese la descripcion de la rutina");
                    String desNew = sc.nextLine();
                    servicioRutina.actualizarRutina(idNew, nombreNew, duracionNew, nivel, desNew);
                    break;
                case 8:
                    System.out.println("Ingrese el id de la rutina que queire eliminar");
                    int idElim = Integer.parseInt(sc.nextLine());
                    servicioRutina.eliminarRutina(idElim);
                    break;
            }
        }while (eleccion != 0);
        System.out.println("Nos vemos la proxima!!!!");
    }
}