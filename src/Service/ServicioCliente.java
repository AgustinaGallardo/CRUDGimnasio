package Service;

import Entity.Cliente;
import Entity.Rutina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioCliente {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private Cliente cliente;
    private List<Cliente> listaClientes = new ArrayList<>();
    private int contador = 0;
    public ServicioCliente() {
        cliente = new Cliente();
    }
    public void registrarCliente(){
        System.out.println("Ingrese su nombre");
        cliente.setNombre(sc.nextLine());
        System.out.println("Ingrese su edad");
        cliente.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.println("Ingrese su altura");
        cliente.setAltura(Double.parseDouble(sc.nextLine()));
        System.out.println("Ingrese su peso");
        cliente.setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Cual es su objetivo?");
        cliente.setObjetivo(sc.nextLine());
        cliente.setId(contador);
        contador++;
        listaClientes.add(cliente);
    }
    public List<Cliente> obtenerClientes(){
        if(listaClientes.isEmpty()){
            System.out.println("La lista no contiene clientes");
           return null;
        }else{
            System.out.println("La lista de clientes es: ");
            return listaClientes;
        }
    }
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo){
        boolean encontrado = false;
        for (Cliente c: listaClientes) {
            if(c.getId() == id){
              /**  c.setNombre(nombre);
                c.setEdad(edad);
                c.setAltura(altura);
                c.setPeso(peso);
                c.setObjetivo(objetivo);*/
              encontrado = true;
              Cliente nuevoCliente = new Cliente(id, nombre, edad, altura,  peso, objetivo);
              int indice = listaClientes.indexOf(c);
              listaClientes.set(indice,nuevoCliente);
                System.out.println("El cliente se edito correctamente");
            }
        }
        if(!encontrado){
            System.out.println("El numero de id es incorrecto");
        }
    }
    public void eliminarCliente(int id){
        boolean encontrado = false;
        for (Cliente c: listaClientes) {
            if(c.getId() == id){
                listaClientes.remove(c);
                System.out.println("El cliente se elimino correctamente");
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("El numero de Id es incorrecto, intente de nuevo");
        }
    }
}
