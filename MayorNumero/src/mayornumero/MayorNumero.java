package mayornumero;

import java.util.Scanner;

/**
 *
 * @author maryse
 * 
 * Este programa determina el mayor de dos números ingresados y lo visualiza en 
 * pantalla; la entrada de los datos enteros se realiza a través del uso de Scanner;
 * por último, la selección del mayor se realiza con el * operador > y la sentencia if.
 * 
 */

public class MayorNumero {

    public void NumeroMayor(){
        int n1, n2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca primer entero: ");
        n1 = entrada.nextInt();
        System.out.print("Introduzca segundo entero: ");
        n2 = entrada.nextInt();
        if (n1 > n2) {
            System.out.println(" El mayor es " + n1);
        } else {
            System.out.println(" El mayor es " + n2);
        }        
    }
    public static void main(String[] args) {
        MayorNumero NumMay = new MayorNumero();
        NumMay.NumeroMayor();
    }

}
