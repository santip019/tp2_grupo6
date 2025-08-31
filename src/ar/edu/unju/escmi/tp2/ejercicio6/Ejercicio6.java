package ar.edu.unju.escmi.tp2.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte radio;
        double resultado;
        System.out.println("Ingrese radio: ");
        radio = sc.nextByte();
        resultado = Math.PI * Math.pow(radio, 2);
        sc.close();
        System.out.println("El área del circulo es:" + resultado);
    }

}
