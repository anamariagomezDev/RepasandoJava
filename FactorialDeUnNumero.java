import java.util.Scanner;

public class FactorialDeUnNumero {

    public static class Factorial {

           /* El **factorial** de un número es el producto de todos los números enteros
           positivos menores o iguales a ese número. Se denota como n!. Por ejemplo:

            5!=5×4×3×2×1=120
            3!=3×2×1=63!=3×2×1=6
            0!=10!=1 (por convención) */

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Para leer la entrada del usuario
            char continuar;  // Variable para controlar si el usuario desea continuar

            do {
                System.out.print("Ingrese un número: ");
                int n = sc.nextInt();  // Lee el número entero ingresado por el usuario

                long factorial = 1;  // Usamos long para manejar números grandes

                // Calculamos el factorial
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }

                System.out.println("El factorial de " + n + " es: " + factorial);  // Imprime el resultado

                // Preguntamos si desea ingresar otro número
                System.out.print("¿Desea ingresar otro número? (s/n): ");
                continuar = sc.next().charAt(0);  // Lee la respuesta del usuario

            } while (continuar == 's' || continuar == 'S');  // Repite mientras el usuario ingrese 's' o 'S'

            System.out.println("Programa terminado.");  // Mensaje de finalización
        }
    }
}
