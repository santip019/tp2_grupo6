package ar.edu.unju.escmi.tp2.ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        byte numero;

        do{
            System.out.println("Ingrese valor numerico para comprobar si este es un mes del año: ");
            numero = sc.nextByte();
            switch ( numero ){
            case 1:
            System.out.println("El valor corresponde a el mes de ENERO");
            break;
            case 2:
            System.out.println("El valor corresponde a el mes de FEBRERO");
            break;
            case 3:
            System.out.println("El valor corresponde a el mes de MARZO");
            break;
            case 4:
            System.out.println("El valor corresponde a el mes de ABRIL");
            break;
            case 5:
            System.out.println("El valor corresponde a el mes de MAYO");
            break;
            case 6:
            System.out.println("El valor corresponde a el mes de JUNIO");
            break;
            case 7:
            System.out.println("El valor corresponde a el mes de JULIO");
            break;
            case 8:
            System.out.println("El valor corresponde a el mes de AGOSTO");
            break;
            case 9:
            System.out.println("El valor corresponde a el mes de SEPTIEMBRE");
            break;
            case 10:
            System.out.println("El valor corresponde a el mes de OCTUBRE");
            break;
            case 11:
            System.out.println("El valor corresponde a el mes de NOVIEMBRE");
            break;
            case 12:
            System.out.println("El valor corresponde a el mes de DICIEMBRE");
            break;
            default:
            System.out.println("No existe ese mes");
            continuar = false;
            break;
            }
        }while ( continuar );
        sc.close();
    }

}
