import javax.swing.*;
public class Entrada_ejemplo2 {
    public static void main(String[] args) {
        
        // Se crea una ventana de dialogo para que el usuario pueda escribir un mensaje, el cual se guarde en nombre_usuario.
        // Al ser estatico, no tuve que crear un objeto e instanciarlo para utilizar el method showInputDialog, llamo directamente a la clase JOptionPane.
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor.");
        
        String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor.");
        
        int edad_usuario = Integer.parseInt(edad);
        
        System.out.println("Hola " + nombre_usuario + ", el año que viene tendrás " + (edad_usuario +1) + " años.");
        // Se parsea la edad a entero ya que no se pudo crear como int porque showInputDialog recibe y devuelve un string.
    }
    
}
