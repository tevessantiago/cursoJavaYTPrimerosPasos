public class manipula_cadenas_II {
    public static void main(String[] args) {
        String frase = "Hoy es un dia estupendo para aprender a programar en Java";
        String frase_resumen = frase.substring(0, 28) + " irnos a la playa y olvidarnos de todo..."
                               + " y " + frase.substring(29, frase.length()); 
        System.out.println(frase_resumen);
    }    
}
