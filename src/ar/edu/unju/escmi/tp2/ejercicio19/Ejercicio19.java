package ar.edu.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {

    public static void main(String[] args) {
        String texto1 = "Hola";
        String texto2 = "Hola";
        String texto3 = new String("Hola");

        System.out.println("Comparacion de Texto1 y Texto2 con ==");
        System.out.println(texto1 == texto2);
        System.out.println("Comparacion de Texto1 y Texto2 con equals");
        System.out.println(texto1.equals(texto2));
        System.out.println("Comparacion de Texto1 y Texto3 con ==");
        System.out.println(texto1 == texto3);
        System.out.println("Comparacion de Texto1 y Texto3 con equals");
        System.out.println(texto1.equals(texto3));
        // La comparacion del texto1 y texto 3 con == devuelve false porque texto3 fue
        // creado con new String() y ocupa un espacio en memoria diferente.
        // La comparacion del texto1 y texto 2 con == devuelve true porque ambos apuntan
        // al mismo objeto en memoria.
        // La comparacion del texto1 y texto 3 con equals devuelve true porque compara
        // el contenido de los objetos, no compara la posicion que ocupan.
        // En este caso, texto1 y texto2 tienen el mismo contenido ("Hola"), por lo que
        // equals devuelve true.
    }
}
