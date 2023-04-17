/*
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
 */
package subprogconjavaej1;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean primo = true;

        System.out.println("Ingrese un numero");
        int num = leer.nextInt();

        if (numPrimo(num) == true) {
            System.out.println("El numero es primo");

        } else {
            System.out.println("El numero no es primo");
        }
    }

    public static boolean numPrimo(int num) {
        boolean primo = true;
        int cont = 0;

        for (int i = 1; i <= num; i++) {

            
            if (num % i == 0) {
                cont++;

                if (num == 1) {
                    primo = false;
                    break;

                }
                if (cont > 2) {
                    primo = false;
                   
                    break;
                } else {
                    primo = true;

                    
                }

            }
        }

        return primo;
    }
    
}
