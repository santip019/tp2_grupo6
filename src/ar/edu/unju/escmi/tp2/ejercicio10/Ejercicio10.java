package ar.edu.unju.escmi.tp2.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextByte();
        
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextByte();
       
        System.out.println("Ingrese el valor de c: ");
        c = sc.nextByte();

        boolean resultadoA = a > 3;
        boolean resultadoB = a > c;
        boolean resultadoC = a < c;
        boolean resultadoD = b < c;
        boolean resultadoE = b != c;
        boolean resultadoF = a == 3;
        boolean resultadoG = a * b == 15;
        boolean resultadoH = a * b == -30;
        boolean resultadoI = c / b < a;
        boolean resultadoJ = c / b == -10;
        boolean resultadoK = c / b == -4;
        boolean resultadoL = a + b + c == 5;
        boolean resultadoM = (a + b == 8) && (a - b == 2);
        boolean resultadoN = (a + b == 8) || (a - b == 6);
        boolean resultadoO = a > 3 && b > 3 && c < 3;
        boolean resultadoP = a > 3 && b >= 3 && c < -3;

        System.out.println("\n=== Resultados ===");
        System.out.println("a) " + resultadoA);
        System.out.println("b) " + resultadoB);
        System.out.println("c) " + resultadoC);
        System.out.println("d) " + resultadoD);
        System.out.println("e) " + resultadoE);
        System.out.println("f) " + resultadoF);
        System.out.println("g) " + resultadoG);
        System.out.println("h) " + resultadoH);
        System.out.println("i) " + resultadoI);
        System.out.println("j) " + resultadoJ);
        System.out.println("k) " + resultadoK);
        System.out.println("l) " + resultadoL);
        System.out.println("m) " + resultadoM);
        System.out.println("n) " + resultadoN);
        System.out.println("o) " + resultadoO);
        System.out.println("p) " + resultadoP);

        sc.close();

    }

}
