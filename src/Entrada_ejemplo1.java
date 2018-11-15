import java.util.*;

public class Entrada_ejemplo1 {
    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in); // Se construye un objeto de tipo scanner que nos va a proporcionar valores tomados de un archivo (en este caso al consola, system.in)
        
        System.out.println("Introduce tu nombre, por favor.");
        
        // La consola (entrada) se queda esperando un string (nextLine) y lo almacena dentro de nombre_usuario.
        String nombre_usuario = entrada.nextLine();
        
        System.out.println("Introduce edad, por favor");
        
        // La consola (entrada) se queda esperando un entero (nextInt) y lo almacena dentro de edad.
        int edad = entrada.nextInt();
        
        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años.");
}
}
