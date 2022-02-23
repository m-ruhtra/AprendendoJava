// Operadores Aritiméticos com código funcional para resolução de operações simples.
package Operadores;

/**
 *
 * @author Arthur
 * 2022.02
 */

import java.util.Scanner; 
// Classe para entrada de dados por meio do teclado.
        
public class Operadores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Operadores Aritméticos: ");
        System.out.println(" + => Adição \n - => Subtração \n / => Divisão \n * => Multiplicação \n % => Resto da divisão");
        System.out.println("Exemplos: ");
        System.out.print("Informe dois números. \nNúmero 1: ");
        float numero1 = sc.nextFloat();
        System.out.print("Número 2: ");
        float numero2 = sc.nextFloat();
        float resultado = numero1+numero2;
        System.out.println("Adição: ");
        System.out.println(numero1 +" + "+numero2+" = "+resultado);
        System.out.println("Subtração: ");
        float resultado2 = numero1-numero2;
        System.out.println(numero1 +" - "+numero2+" = "+resultado2);
        System.out.println("Divisão: ");
        float resultado3 = numero1/numero2;
        System.out.println(numero1 +" / "+numero2+" = "+resultado3);
        System.out.println("Multiplicação: ");
        float resultado4 = numero1*numero2;
        System.out.println(numero1 +" x "+numero2+" = "+resultado4);
        System.out.println("Resto da divisão: ");
        float resultado5 = numero1%numero2;
        System.out.println(numero1 +" % "+numero2+" = "+resultado5);
    }
    
}
