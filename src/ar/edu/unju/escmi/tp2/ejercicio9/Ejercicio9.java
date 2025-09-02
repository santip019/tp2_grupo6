package ar.edu.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        short anio = sc.nextShort();

        if ((anio%4 == 0 && anio%100 != 0) || anio%400 == 0)
         System.out.println("El año " +anio+ " es bisiesto");
        else
         System.out.println("El año " +anio+ " no es bisiesto");
    
        sc.close();
    }
}
