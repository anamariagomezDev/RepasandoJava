package Math;

import java.util.Scanner;  // Importamos la clase Scanner para poder leer la entrada del usuario

public class FactorialDeUnNumero {

    /* El **factorial** de un número es el producto de todos los números enteros
       positivos menores o iguales a ese número. Se denota como n!. Por ejemplo:

       5! = 5 × 4 × 3 × 2 × 1 = 120
       3! = 3 × 2 × 1 = 6
       0! = 1 (por convención) */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creamos un objeto Scanner para leer datos del usuario
        char continuar;  // Variable para controlar si el usuario desea continuar

        do {
            try {
                System.out.print("Ingrese un número: ");
                int n = sc.nextInt();  // Lee el número entero ingresado por el usuario

                long factorial = 1;  // Usamos long para manejar números grandes

                // Calculamos el factorial
                for (int i = 1; i <= n; i++) {
                    factorial *= i;  // Multiplicamos para obtener el factorial
                }

                System.out.println("El factorial de " + n + " es: " + factorial);  // Imprime el resultado

            } catch (Exception e) {
                // Capturamos cualquier excepción que ocurra durante la lectura de entrada
                System.out.println("Entrada inválida. Asegúrese de ingresar un número entero.");
                sc.next();  // Limpiamos el buffer del scanner para evitar que el programa entre en un bucle infinito
                continuar = 's';  // Forzamos la repetición del ciclo al ingresar un valor no numérico
                continue;  // Continuamos con la siguiente iteración del bucle
            }

            // Preguntamos si desea ingresar otro número
            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = sc.next().charAt(0);  // Lee la respuesta del usuario

        } while (continuar == 's' || continuar == 'S');  // Repite mientras el usuario ingrese 's' o 'S'

        System.out.println("Programa terminado.");  // Mensaje de finalización
        sc.close();  // Cerramos el Scanner al final del programa
    }
}
