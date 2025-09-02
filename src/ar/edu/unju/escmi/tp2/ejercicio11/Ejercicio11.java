package ar.edu.unju.escmi.tp2.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        for (byte i=1; i<=5; i++)
        {
            System.out.println("Ingrese el "+i+"° número: ");
            num = sc.nextInt();
            
            if (num%2 == 0)
             System.out.println("El número "+num+" es par");
            else
             System.out.println("El número "+num+" no es par");
        }
        sc.close();
    }

}
