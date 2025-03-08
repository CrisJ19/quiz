import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo como límite: ");
        int limite = scanner.nextInt();
        
        if (limite < 0) {
            System.out.println("Por favor, ingrese un número positivo.");
            scanner.close();
            return;
        }
        
        int primero = 0;
        int segundo = 1;
        int contador = 0;
        long suma = 0; 
        
        System.out.println("Secuencia de Fibonacci hasta " + limite + ":");
        while (primero <= limite) {
            System.out.print(primero);
            suma += primero;
            contador++;
            if (segundo <= limite) {
                System.out.print(", ");
            }

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
        System.out.println(); 
        System.out.println("Número de términos generados: " + contador);
        System.out.println("Suma de todos los términos: " + suma);
        
        scanner.close();
    }
}
