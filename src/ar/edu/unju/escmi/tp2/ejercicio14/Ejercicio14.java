package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        // Crear un array de 8 posiciones, que permita almacenar números enteros. Los
        // valores deben ser pedidos por consola. Mostrar por consola el índice y el
        // valor almacenado en esa posición.

        int enteros[] = new int[8];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Ingrese Un numero para la Posicion: " + i + " : ");
            enteros[i] = scanner.nextInt();
        }

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("El valor almacenado en la posicion " + i + " es: " + enteros[i]);
        }
    }
}
