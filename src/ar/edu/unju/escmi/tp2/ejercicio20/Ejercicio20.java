package ar.edu.unju.escmi.tp2.ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {

        String textoOriginal = "Mala";
        String textoModificado = textoOriginal.replace("la", "lo");

        System.out.println("El texto Original es: " + textoOriginal);
        System.out.println("El texto Modificado es: " + textoModificado);
        // El Texto Original no se modifica porque las cadenas en java de clase String
        // son inmutables.
        // Cuando se realiza una modificacion, se crea un nuevo objeto String con el
        // nuevo valor.
    }
}
