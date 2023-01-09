package ejercicio3;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static int minimo(int a, int b) {
        int resultado = a;

        // ! Comprobaremos que numero es menor, en caso de que ninguno sea menor devolveremos a
        if (b < a) {
            resultado = b;
        }

        return resultado;
    }
    public static void main(String[] args) {
        // ^ Definimos dos variables, a y b
        int a, b;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los valores de a y b al usuario
        System.out.print("Introduce el valor de 'a': ");
        a = read.nextInt();
        System.out.print("Introduce el valor de 'b': ");
        b = read.nextInt();
        
        // ? Salto de Línea Triple
        System.out.println("\n--------------------------\n");
        
        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ! Mostramos el resultado final
        System.out.println("El numero minimo es: " + minimo(a, b));
    }
}
