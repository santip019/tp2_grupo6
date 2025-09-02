package ar.edu.unju.escmi.tp2.ejercicio8;

public class Ejercicio8 {

    public static void main(String[] args) {
        int a = 5, b = 10, c = 2, d = 6;
        System.out.println("El valor de a sin modificar es: " + a);
        System.out.println("El valor de b sin modificar es: " + b);
        System.out.println("El valor de c sin modificar es: " + c);
        System.out.println("El valor de d sin modificar es: " + d);
        a += 5;
        b -= 2;
        c *= 3;
        d /= 2;
        System.out.println("El valor de a modificado es: " + a);
        System.out.println("El valor de b modificado es: " + b);
        System.out.println("El valor de c modificado es: " + c);
        System.out.println("El valor de d modificado es: " + d);

    }
}