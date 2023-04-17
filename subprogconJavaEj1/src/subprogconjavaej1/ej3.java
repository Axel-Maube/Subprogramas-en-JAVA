/*
 Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €

 */
package subprogconjavaej1;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String moneda = null;
        int euros = 0;

        cambio(0, moneda);

    }

    public static void cambio(int euros, String moneda) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros a convertir");
        euros = leer.nextInt();
        System.out.println("Ingrese la moneda a la cual quiere convertir los euros: yenes, dólares o libras únicamente");
        moneda = leer.next();

        switch (moneda) {
            case "dolares":

                System.out.println("la cantidad ingresada: " + euros + " es " + (euros * 1.28611) + " dolares");

                break;
            case "libras":
                System.out.println("la cantidad ingresada: " + euros + " es " + (euros * 0.86) + " libras");
                break;
            case "yenes":
                System.out.println("la cantidad ingresada: " + euros + " es " + (euros * 129.852) + " yenes");
                break;
            default:

                System.out.println("El valor ingresado es incorrecto");
        }

    }

}
