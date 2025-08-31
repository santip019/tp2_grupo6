package ar.edu.unju.escmi.tp2.ejercicio17;
public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        Integer num1 = 50; //si el valor está en el rango de -128 a 127, Java almacena estos objetos en una caché especial
        Integer num2 = 50; //si asignas el mismo valor a dos objetos en este rango, ambos objetos apuntarán a la misma dirección de memoria
        System.out.println("Referencia de num1 es: " + System.identityHashCode(num1));
        System.out.println("Referencia de num2 es: " + System.identityHashCode(num2));//imprimir la referencia de memoria de cada objeto

        if ( num1 == num2)//si los valores son iguales, las referencias también lo serán, por lo que el resultado de la comparación será true
        System.out.println("Las referencias son iguales (==)");
        else
        System.out.println("Las referencias NO son iguales (==)");

        if ( num1.equals(num2) )// .equals() compara el contenido o valor de los objetos, no sus referencias de memoria
        System.out.println("Los valores son iguales(.equals())");
        else
        System.out.println("Los valores NO son iguales(.equals())");
    }
    {/*NOTA: Si cambias los valores a un número fuera del rango, como num1=200 num2=200,
    mostrara que las referencias serán diferentes, pero equals() seguirá devolviendo true */}
}
