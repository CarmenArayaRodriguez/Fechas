import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        // Se crea un objeto scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in);

        String fecha1, fecha2;

        // Se solicita y valida la primera fecha
        do {
            System.out.println("Ingrese la primera fecha como DD/MM/AAAA:");
            fecha1 = scanner.nextLine();
            if (!validarFecha(fecha1)) {
                System.out.println("El formato de fecha ingresado no es válido, intente nuevamente.");
            }
        } while (!validarFecha(fecha1));

        // Ss solicita y valida la segunda fecha
        do {
            System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
            fecha2 = scanner.nextLine();
            if (!validarFecha(fecha2)) {
                System.out.println("El formato de fecha ingresado no válido, intente nuevamente.");
            }
        } while (!validarFecha(fecha2));

        // Se convierten las fechas de String a integer
        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1.substring(6, 10));

        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2.substring(6, 10));

        // Se comparan las dos fechas para determinar quién es mayor
        String mensajeResultado;
        if (anio1 < anio2 || (anio1 == anio2 && mes1 < mes2) || (anio1 == anio2 && mes1 == mes2 && dia1 < dia2)) {
            mensajeResultado = "Persona 1 es mayor";
        } else if (anio1 > anio2 || (anio1 == anio2 && mes1 > mes2) || (anio1 == anio2 && mes1 == mes2 && dia1 > dia2)) {
            mensajeResultado = "Persona 2 es mayor";
        } else {
            mensajeResultado = "Tienen la misma edad";
        }

        // Se muestra el resultado
        System.out.println(mensajeResultado);

        // Se cierra el objeto scanner
        scanner.close();
    }

    // Método para validar el formato de las fechas
    public static boolean validarFecha(String fecha) {
        return fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    }
}
