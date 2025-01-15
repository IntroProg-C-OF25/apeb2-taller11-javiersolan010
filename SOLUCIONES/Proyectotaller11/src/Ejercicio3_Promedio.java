/** *
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el
 * promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el
 * promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9
 * el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la
 * función se la debe llamar desde un método principal. Los parámetros
 * necesarios para llamar a la función, deben ser ingresados solicitados
 * al usuario.
 *
 * @author javier
 */

import java.util.Scanner;

public class Ejercicio3_Promedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor decimal:");
        double valor1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo valor decimal:");
        double valor2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer valor decimal:");
        double valor3 = scanner.nextDouble();

        System.out.println("Ingrese el cuarto valor decimal:");
        double valor4 = scanner.nextDouble();

        String promedioCualitativo = calcularPromedioCualitativo(valor1, valor2, valor3, valor4);

        System.out.println("El promedio cualitativo es: " + promedioCualitativo);
    }

    public static String calcularPromedioCualitativo(double valor1, double valor2, double valor3, double valor4) {
        double promedio = (valor1 + valor2 + valor3 + valor4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            return "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            return "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            return "Sobresaliente";
        } else {
            return "Promedio fuera de rango";
        }
    }
}

/***
 *Ingrese el primer valor decimal:
 3
 *Ingrese el segundo valor decimal:
 4
 *Ingrese el tercer valor decimal:
 2
 *Ingrese el cuarto valor decimal:
 1
 *El promedio cualitativo es: Regular
 */
