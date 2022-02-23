// Operadores Unários.
package Operadores;

/**
 *
 * @author Arthur
 * 2022.02
 */

import java.util.Scanner; 
// Classe para entrada de dados por meio do teclado.

public class OperadoresUnários {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Operadores Unários:");
        System.out.println(" ++ => Incremento = Acrescenta uma unidade no valor já existente"
                + "\n -- => Decremento = Diminui uma unidade no valor já existente");
        System.out.println("Exemplo:");
        System.out.println(" Incremento: a++ => a = a + 1");
        System.out.print("Informe um valor: ");
        int valor1 = sc.nextInt();
        valor1++;
        int resultado = valor1;
        System.out.println("Resultado = "+ resultado);
        System.out.println(" Decremento: a-- => a = a - 1");
        System.out.print("Informe um valor: ");
        int valor2 = sc.nextInt();
        valor2--;
        int resultado2 = valor2;
        System.out.println("Resultado = "+ resultado2);
        
        
    }
    
}
