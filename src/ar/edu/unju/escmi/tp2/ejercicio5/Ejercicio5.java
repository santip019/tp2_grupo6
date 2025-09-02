package ar.edu.unju.escmi.tp2.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a, b, c;
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextByte();
        
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextByte();
       
        System.out.println("Ingrese el valor de : ");
        c = sc.nextByte();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int resultadoA = a + b + c;
        int resultadoB = 2 * b + 3 * (a - c);
        double resultadoC = a / b;
        int resultadoD = a % b;
        double resultadoE = a / c;
        int resultadoF = a % c;
        double resultadoG = (a * b) / c;
        double resultadoH = a * (b / c);
        int resultadoI = (a * c) % b;
        int resultadoJ = a * (c % b);
        int resultadoK = (3 * a - 2 * b) % (2 * a - c);
        int resultadoL = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        double resultadoM = ((a - 3 * b) % (c + 2 * a)) / (a - c);
        int resultadoN = a - b - c * 2;
        
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



        sc.close();


    }
}
