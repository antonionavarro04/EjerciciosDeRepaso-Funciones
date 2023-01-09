package ejercicio5;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static double millesToMeters(int millas) {
        return millas * 1.60934D;
    }
    public static void main(String[] args) {
        // ^ Definimos una variable millas de tipo entero
        int millas;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario el valor de millas
        System.out.print("Introduce las millas: ");
        millas = read.nextInt();

        // ? Salto de Linea Triple
        System.out.println("\n---------------------\n");

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ! Imprimimos el resultado
        System.out.println(millas + "mi = " + millesToMeters(millas) + "km");
    }
}
