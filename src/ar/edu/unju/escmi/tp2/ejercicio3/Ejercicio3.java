package ar.edu.unju.escmi.tp2.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        final int CODIGO_POSTAL_JUJUY = 4600;
        final double PI = 3.1415926535;
        final byte DIAS_DE_LA_SEMANA = 7;
        final byte MESES_DEL_AÑO = 12;
        
        {/*RESPUESTA: En este caso, al tener declarado nuestro 'public static void main', 
        no es necesario declarar las constante como 'static final' si solo vamos a usar las constantes
        dentro de nuestro metodo main.
        
        Las constantes declaradas dentro de un método son constantes locales.
        Estas existen solo mientras el método se está ejecutando y no son accesibles
        fuera de él.

        Si declaráramos las constantes fuera del método main, para que el método main
        (que es 'static') pudiera acceder a ellas, estas deberían ser declaradas como 'static final'.
        */}
    }
}
