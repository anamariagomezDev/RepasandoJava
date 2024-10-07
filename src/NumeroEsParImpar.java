import java.util.Scanner;  // Importamos la clase Scanner para poder leer la entrada del usuario

public class NumeroEsParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Creamos un objeto Scanner para leer datos del usuario

        int x;  // Declaramos una variable entera para almacenar el número ingresado por el usuario

        char respuesta;  // Variable para almacenar la respuesta del usuario (si quiere continuar o no)

        do {  // Inicia el bucle `do-while`. Este bucle garantiza que el código dentro del bloque se ejecute al menos una vez
            System.out.println("Ingrese un número entero: ");
            x = sc.nextInt();  // Leemos un número entero ingresado por el usuario y lo almacenamos en la variable `x`

            // Verificamos si el número es par o impar
            if (x % 2 == 0) {  // Si el resto de `x` dividido por 2 es 0, entonces es par
                System.out.println("El número es par.");
            } else {  // Si no, es impar
                System.out.println("El número es impar.");
            }

            // Preguntamos al usuario si desea continuar ingresando más números
            System.out.println("¿Desea ingresar otro número? (s/n): ");
            respuesta = sc.next().charAt(0);  // Leemos la respuesta del usuario (solo el primer carácter)

        } while (respuesta == 's' || respuesta == 'S');  // Continuamos el bucle mientras el usuario ingrese 's' o 'S'

        System.out.println("Programa terminado.");  // Mensaje final cuando el usuario decide no continuar
    }
}

