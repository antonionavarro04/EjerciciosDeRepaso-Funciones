package ejercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    // ? Creamos una función que multiplique los dos valores que le hemos pasado
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ^ Definimos dos variables de nombre a y b, siendo estas de tipo double
        double a, b;

        // ^ Definimos otra variable resultado para guardar el resultado de la operación
        double resultado;

        // ! Pedimos al Usuario el valor de a y b
        System.out.print("Introduce el valor de 'a': ");
        a = read.nextDouble();
        System.out.print("Introduce el valor de 'b': ");
        b = read.nextDouble();

        // ^ Cerramos el Scanner tras su uso
        read.close();
        
        // ? Salto de Linea Triple
        System.out.println("\n---------------------------\n");

        // ! Llamamos a la función multiply pasandole los valores de a y b, el resultado devuelto lo guardaremos en la variable resultado
        resultado = multiply(a, b);

        // ! Imprimimos el resultado de la operación
        System.out.println("La operación: " + a + " x " + b + " = " + resultado);
    }
}
