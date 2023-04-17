/*
 Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package subprogconjavaej1;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class SubprogconJavaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int suma, resta, multiplicacion, division;
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número");
        int num2 = leer.nextInt();

        suma = suma(num1, num2);
        System.out.println("la suma de los numeros es: " + suma);

        resta = resta(num1, num2);
        System.out.println("la resta de los numeros es: " + resta);

        multiplicacion = multiplicacion(num1, num2);
        System.out.println("la multiplicacion de los numeros es: " + multiplicacion);

        division = division(num1, num2);
        System.out.println("la division de los numeros es: " + division);

    }

    public static int suma(int num1, int num2) {
        int suma;
        suma = num1 + num2;

        return suma;

    }

    public static int resta(int num1, int num2) {

        int resta = num1 - num2;

        return resta;

    }

    public static int multiplicacion(int num1, int num2) {

        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static int division(int num1, int num2) {

        int division = num1 / num2;
        return division;
    }

}
