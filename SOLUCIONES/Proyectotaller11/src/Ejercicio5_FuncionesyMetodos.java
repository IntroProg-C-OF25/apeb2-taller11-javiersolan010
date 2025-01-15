/***
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación
 * de un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 *
 * @author javier
 */
import java.util.Scanner;
public class Ejercicio5_FuncionesyMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamanio de la matriz cuadrada:");
        int n = scanner.nextInt();

        
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        
        realizarOperaciones(matriz);
    }

    
    public static void realizarOperaciones(int[][] matriz) {
        int suma = 0;
        int resta = 0;
        int multiplicacion = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                resta -= matriz[i][j];
                multiplicacion *= matriz[i][j];
            }
        }

        System.out.println("Resultados de las operaciones:");
        System.out.println("Suma de la matriz: " + suma);
        System.out.println("Resta de la matriz: " + resta);
        System.out.println("Multiplicacion de la matriz: " + multiplicacion);
    }
}
/***
 * Ingrese el tamanio de la matriz cuadrada:
 3
Ingrese los elementos de la matriz:
Elemento [0][0]: 3
Elemento [0][1]: 3
Elemento [0][2]: 2
Elemento [1][0]: 1
Elemento [1][1]: 4
Elemento [1][2]: 2
Elemento [2][0]: 5
Elemento [2][1]: 4
Elemento [2][2]: 3
Resultados de las operaciones:
Suma de la matriz: 27
Resta de la matriz: -27
Multiplicacion de la matriz: 8640
* 
 */
