import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese su nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        
        // Leer el nombre del usuario
        String nombre = scanner.nextLine();
        
        // Imprimir un mensaje con el nombre del usuario
        System.out.println("Hola, " + nombre + "! Bienvenido al mundo de Java.");
        
        // Cerrar el Scanner
        scanner.close();
    }
}
