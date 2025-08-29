package ar.edu.unju.escmi.tp2.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int dni = 45678901;
        char persona = 'A';
        byte edadFam = 55;
        String procer = "José de San Martín";
        short numeroBingo = 27;
        double precioCelular = 350000.50; //double porque en los precios de celulares siempre hay centavos
        float estatura = 1.50f;
        float pesoMascota = 12.5f;
        String fechaIni = "15/08/2025";
        String fechaFin = "29/11/2025";

        System.out.println("Mi DNI es: " + dni);
        System.out.println("La letra de ejemplar de mi DNI es: " + persona);
        System.out.println("La edad de mi familiar es: " + edadFam + " años");
        System.out.println("Un prócer argentino importante es: " + procer);
        System.out.println("Un número de bingo podría ser: " + numeroBingo);
        System.out.println("El precio de un celular es: $" + precioCelular);
        System.out.println("Mi estatura es: " + estatura + " metros");
        System.out.println("El peso de mi mascota es: " + pesoMascota + " kg");
        System.out.println("El 2do cuatrimestre inicia el: " + fechaIni);
        System.out.println("El 2do cuatrimestre finaliza el: " + fechaFin);
    }
}