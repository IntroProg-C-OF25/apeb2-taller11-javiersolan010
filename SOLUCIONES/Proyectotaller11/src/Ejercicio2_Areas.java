/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular
 * el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada
 * procedimiento/función debe recibir los datos necesarios y generar el valor
 * correspondiente. Se debe invocar a los procedimientos desde un método
 * principal; Si el usuario ingresa 1 se llama al procedimiento
 * obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo;
 * 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 *
 * @author javier
 */

import java.util.Scanner;

public class Ejercicio2_Areas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Calcular el area de un cuadrado");
        System.out.println("2. Calcular el area de un triangulo");
        System.out.println("3. Calcular el area de un rectangulo");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el valor del lado del cuadrado: ");
                double lado = scanner.nextDouble();
                double areaCuadrado = obtenerAreaCuadrado(lado);
                System.out.println("El area del cuadrado es: " + areaCuadrado);
                break;

            case 2:
                System.out.print("Ingrese la base del triangulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triangulo: ");
                double alturaTriangulo = scanner.nextDouble();
                double areaTriangulo = obtenerAreaTriangulo(baseTriangulo, alturaTriangulo);
                System.out.println("El area del triangulo es: " + areaTriangulo);
                break;

            case 3:
                System.out.print("Ingrese la base del rectangulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectangulo: ");
                double alturaRectangulo = scanner.nextDouble();
                double areaRectangulo = obtenerAreaRectangulo(baseRectangulo, alturaRectangulo);
                System.out.println("El area del rectangulo es: " + areaRectangulo);
                break;

            default:
                System.out.println("Opcion no valida. Por favor, seleccione una opcion correcta.");
                break;
        }

        scanner.close();
    }

    public static double obtenerAreaCuadrado(double lado) {
        return lado * lado * lado * lado;
    }

    public static double obtenerAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double obtenerAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}

/**
 * *
 * Seleccione una opcion: 1. Calcular el area de un cuadrado 2. Calcular el area
 * de un triangulo 3. Calcular el area de un rectangulo 2 Ingrese la base del
 * triangulo: 6 Ingrese la altura del triangulo: 12 El area del triangulo es:
 * 36.0
 */
