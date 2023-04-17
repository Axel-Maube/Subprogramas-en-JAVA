/*
 Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo 
del segundo, sino informe que no lo son.
 */
package subprogramasconjavateoriaej1;

import java.util.Scanner;


public class subprogramasConJAVATeoriaEj2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese otro numero");
        int num2 = leer.nextInt();
        int esMultiplo = multiplo (num1, num2);
        if (esMultiplo==0) {
            System.out.println("Es multiplo");
        }else {
            System.out.println("No son multiplos");
        }

    }
    public static int multiplo (int a, int b){
        int resultado = a % b;
        return resultado;
    }
}
