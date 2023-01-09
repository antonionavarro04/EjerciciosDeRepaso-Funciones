package ejercicio4;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static int dimeSigno(int a) {
        int resultado = 0;

        // ! Si es mayor a 0 devolvemos '1', en caso contrario '-1', y si no es ninguna de las dos 0
        if (a > 0) {
            resultado = 1;
        } else if (a < 0) {
            resultado = -1;
        }

        return resultado;
    }
    public static void main(String[] args) {
        // ^ Definimos una variable resultado
        int resultado;

        // ^ Definimos la variable a de tipo entero
        int a;

        // ^ Definimos una variable mensaje de tipo String
        String mensaje;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario el valor de a
        System.out.print("Introduce el valor de 'a': ");
        a = read.nextInt();
        
        // ? Salto de Línea Triple
        System.out.println("\n--------------------\n");
        
        // ^ Ceramos el Scanner tras su uso
        read.close();

        // ! Llamamos a la función y guardamos el resultado en la variable resultado
        resultado = dimeSigno(a);

        // ! Segun lo que nos haya devuelto cambiaremos el valor de la variable mensaje
        switch (resultado) {
            case -1:
                mensaje = "Negativo";
                break;
            case 0:
                mensaje = "Cero";
                break;
            case 1:
                mensaje = "Positivo";
                break;
            default:
                mensaje = "Error";
                break;
        }

        // ! Imprimimos el resultado
        System.out.println("El numero " + a + " es: " + mensaje);
    }
}
