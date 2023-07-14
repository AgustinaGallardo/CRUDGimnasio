import Service.ServicioCliente;
import Service.ServicioGimnasio;
import Service.ServicioRutina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ServicioGimnasio service = new ServicioGimnasio();
    service.ejecutarMenu();
    }
}