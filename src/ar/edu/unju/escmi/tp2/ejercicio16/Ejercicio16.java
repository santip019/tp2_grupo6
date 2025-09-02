package ar.edu.unju.escmi.tp2.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num;

        do {
            System.out.println("Ingrese un número entre 5 y 10: ");
            num = sc.nextByte();
            sc.nextLine();
        } while (num<5 || num>10);

        String[] nombres = new String[num];
        

        for(byte i=0; i<num; i++)
        {
            System.out.println("Ingrese el "+(i+1)+"° nombre: ");
            nombres[i] = sc.nextLine();
        }

        for(byte i=0; i<num; i++)
            System.out.println((i+1)+"° nombre: "+nombres[i]);

        for(byte i=(byte) (num - 1); i>=0; i--)
            System.out.println((i+1)+"° nombre: "+nombres[i]);
        
        sc.close();
    }
}
