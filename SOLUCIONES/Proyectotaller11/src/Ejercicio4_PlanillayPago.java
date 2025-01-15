/** *
 * Generar un procedimiento para calcular el valor de la planilla de luz y
 * otro procedimiento para calcular el valor del predio de un bien inmueble.
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del
 * cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor
 * del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el
 * siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar
 * el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para
 * obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera
 * el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado
 * en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento
 * calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que
 * se necesita en cada procedimiento se los debe ingresar por teclado.
 *
 * @author javier
 */
import java.util.Scanner;

public class Ejercicio4_PlanillayPago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cedula del cliente:");
        String cedula = scanner.nextLine();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        } else if (opcion == 2) {
            calcularPredio(nombre, cedula);
        } else {
            System.out.println("Opcion no valida.");
        }
    }

    public static void calcularValorLuz(String nombre, String cedula) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del kilovatio:");
        double valorKilovatio = scanner.nextDouble();

        System.out.println("Ingrese el numero de kilovatios consumidos en el mes:");
        double numeroKilovatios = scanner.nextDouble();

        double totalPagar = valorKilovatio * numeroKilovatios;

        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de $%.2f%n",
                nombre, cedula, totalPagar);
    }

    public static void calcularPredio(String nombre, String cedula) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del inmueble:");
        double valorInmueble = scanner.nextDouble();

        double valorPredio = valorInmueble * 0.02;

        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble valorado en $%.2f y tiene que pagar de predio $%.2f%n",
                nombre, cedula, valorInmueble, valorPredio);
    }
}


/**
 * *
 * Seleccione una opcion: 
 * 1. Calcular valor de la planilla de luz 
 * 2. Calcular valor del predio 
 * 1 
 * Ingrese el nombre del cliente: 
 * Javier Solano 
 * Ingrese la cedula del cliente: 
 * 1105992752 
 * Ingrese el valor del kilovatio: 
 * 7 
 * Ingrese el numero de kilovatios consumidos en el mes:
 * 18
 * Cliente Javier Solano con cedula 1105992752 debe cancelar el valor de $126,00
 */
