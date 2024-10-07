import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un númerp entero: ");

        x = sc.nextInt();

        if(x%2==0){
            System.out.println("El número es par.");
        }else{
            System.out.println("El número es impar.");
        }

    }
}