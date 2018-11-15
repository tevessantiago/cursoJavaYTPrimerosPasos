import java.util.*;
public class Evalua_edad {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu edad, por favor.");
        
        int edad = entrada.nextInt();
        
        if(edad < 18){
            System.out.println("Sos nene o adolescente");
        }
        else if(edad < 40){
            System.out.println("Sos joven");
        }
        else if (edad < 65){
            System.out.println("Sos maduro");
        }
        else{
            System.out.println("Cuidate ):");
        }
    }
}
