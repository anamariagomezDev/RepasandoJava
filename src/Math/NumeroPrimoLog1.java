package Math;

import java.util.Scanner;  // Importamos la clase Scanner para poder leer la entrada del usuario

public class NumeroPrimoLog1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("Ingrese un número (o escriba 'salir' para terminar): ");
            String input = sc.next(); // Leer la entrada como String

            if (input.equalsIgnoreCase("salir")) { // Permitir salir escribiendo "salir"
                break; // Salimos del bucle
            }

            try {
                n = Integer.parseInt(input); // Intentamos convertir la entrada a un número entero
                int contador = 0; // Contador de divisiones

                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        contador++; // Incremental
                    }
                }

                if (contador == 2) {
                    System.out.println(n + " es un número primo."); // Espacio agregado antes del texto
                } else {
                    System.out.println(n + " no es un número primo.");  // Espacio agregado antes del texto
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido."); // Manejo de errores de entrada
            }
        }

        sc.close(); // Cerramos el Scanner para evitar fugas de recursos
        System.out.println("Programa terminado.");
    }
}