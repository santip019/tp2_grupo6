package ar.edu.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        do {
            System.out.print("Ingrese un número entero entre 3 y 10: ");
            tamaño = sc.nextInt();
        } while (tamaño < 3 || tamaño > 10);

        int[] numeros = new int[tamaño];

        for (int i = 1; i < numeros.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        int suma = 0;
        System.out.println("\n=== Valores del array ===");
        for (int i = 1; i < numeros.length; i++) {
            System.out.println("Posición [" + i + "] = " + numeros[i]);
            suma += numeros[i];
        }

        System.out.println("\nSuma total de los valores: " + suma);

        sc.close();
    }

}
