package ejercicio2;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    // ? Definimos una funcion booleana que devuelva true en caso de ser mayor de edad y false en caso contrario
    public static boolean esMayorDeEdad(int edad) {
        boolean resultado = true;

        // ! Si la edad es menor a 18 el programa devolverá false en vez de true
        if (edad < 18) {
            resultado = false;
        }

        return resultado;
    }
    public static void main(String[] args) {
        // ^ Definimos la variable edad que recogerá la edad del usuario
        int edad;

        // ^ Definimos una variable fallos
        byte intentos = 0;

        // ^ Definimos una variable resultado de tipo boolean
        boolean resultado;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        do { // ! Pedimos al usuario su edad, (EXTRA: En caso de que introduzca un numero mayor a 150 o menor a 0 se pedirá de nuevo la edad)
            if (intentos > 0) {
                System.out.print("La edad debe estar comprendida entre '0 y 150', introduzcala de nuevo: ");
            } else {
                System.out.print("Introduce tu edad: ");   
            } edad = read.nextInt();
            intentos++;
        } while (edad < 0 || edad > 150);

        // ? Salto de Línea Triple
        System.out.println("\n------------------\n");

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ! Llamamos a la funcion esMayorDeEdad y le pasamos la edad como parametro, guardaremos el resultado en la variable resuoltado
        resultado = esMayorDeEdad(edad);

        // ! Imprimimos el resultado final
        if (resultado == true) {
            System.out.println("Eres Mayor de Edad");
        } else {
            System.out.println("Eres Menor de Edad");
        }
    }
}
