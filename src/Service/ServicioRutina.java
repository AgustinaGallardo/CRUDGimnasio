package Service;
import Entity.Rutina;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ServicioRutina {
    private List<Rutina> listaRutinas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int contador =0;
    public void instanciarRutina(){
        Rutina rutina = new Rutina();
        System.out.println("Ingrese el nombre de la rutina");
        rutina.setNombre(sc.nextLine());
        System.out.println("Ingrese la duracion");
        rutina.setDuracion(Integer.parseInt(sc.nextLine()));
        System.out.println("Ingrese el nivel de dificultad");
        rutina.setNivelDificultad(sc.nextLine());
        System.out.println("Ingrese la descripción de la rutina");
        rutina.setDescripcion(sc.nextLine());
        rutina.setId(contador);
        contador++;
        crearRutina(rutina);
    }
    private void crearRutina(Rutina rutina){
        listaRutinas.add(rutina);
    }
    public List<Rutina> obtenerRutinas(){
        if(listaRutinas.isEmpty()){
            System.out.println("La lista de rutina esta vacía");
            return null;
        }else{
            System.out.println("La lista de rutinas es:");
            return listaRutinas;
        }
    }
    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion){
       boolean encontrado = false;
        for (Rutina r: listaRutinas) {
            if(r.getId() == id){
               r.setDescripcion(descripcion);
                r.setDuracion(duracion);
                r.setNivelDificultad(nivelDificultad);
                r.setNombre(nombre);
                encontrado = true;
                System.out.println("Se actualizo correctamente!!");
            }
        }
        if(!encontrado){
            System.out.println("El id no existe, o no existe ninguna rutina con ese numero de id");
        }
    }
    public void eliminarRutina(int id){
        boolean encontrdo =false;
        for (Rutina r:listaRutinas) {
            if(r.getId() == id){
                listaRutinas.remove(r);
                encontrdo = true;
                System.out.println("La rutina se elimino correctamente");
                break;
            }
        }
        if(!encontrdo){
            System.out.println("El numero de id es incorrecto");
        }
    }
}
