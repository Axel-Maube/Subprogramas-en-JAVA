/*
 Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package subprogconjavaej1;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String nom = null;
        int edad = 0;

        datos(edad, nom);

    }

    public static void datos(int edad, String nom) {
        Scanner leer = new Scanner(System.in);
        String mayoríaEdad;
        String opc;

        do {
            System.out.println("ingrese el nombre de la persona, seguida de su edad");

            nom = leer.nextLine();

            edad = leer.nextInt();

            if (edad > 18) {
                System.out.println("Es mayor de edad");

            } else {
                System.out.println("No es mayor de edad");
            }
            leer.nextLine();
            System.out.println("Desea seguir ingresando personas? si/no");
            opc = leer.nextLine();

        } while (opc.equalsIgnoreCase("si"));

    }

}
