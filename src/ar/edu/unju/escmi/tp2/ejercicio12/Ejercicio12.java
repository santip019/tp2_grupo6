package ar.edu.unju.escmi.tp2.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte edades[];
        edades=new byte[5];

        System.out.println("Ingrese 5 edades: ");

        for(int i=0; i<edades.length; i++){
            edades[i]=sc.nextByte();
            if(edades[i]>=1 && edades[i]<=12){
            System.out.println("Es un niño");
            }
            else if(edades[i]>=13 && edades[i]<=20){
            System.out.println("Es un joven");
            }
            else{
            System.out.println("Es un adulto");
            }
        }
    }
}
