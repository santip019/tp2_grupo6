package ar.edu.unju.escmi.tp2.ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num = 3;
        double resultado = Math.pow((num * (num + 1)) / 2, 2);
        System.out.println(resultado);

        /*
        
         La clase Math de Java forma parte del paquete java.lang, por lo cual, está disponible 
        automáticamente en cualquier programa Java y no necesita ser importada explícitamente.
        Proporciona métodos estáticos para realizar operaciones matemáticas y trigonométricas.
         Al ser métodos estáticos, se pueden usar directamente llamando a la clase 
        sin necesidad de crear un objeto de Math. 

         Math.pow() proporciona una forma estandarizada de realizar exponenciaciones. 
        Este método toma dos argumentos: la base (el número que se eleva a una potencia) 
        y el exponente (exponente al que se eleva el número base), ambos de tipo double, 
        y devuelve un resultado de tipo double.
         Math.pow (double base , double exponente)

        */
    }
}
