// Operadores de Atribuição.
package Operadores;

/**
 *
 * @author Arthur
 * 2022.02
 */

import java.util.Scanner; 
// Classe para entrada de dados por meio do teclado. 

public class OperadoresAtribuição {
    
    public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Operadores de Atribuição:");
         System.out.println(" Esses operadores atribuem um valor ao operando à sua esquerda baseado no valor do operando à direita");
         System.out.println(" += => Somar e atribuir:\n       a += b => a = a + b\n"
                       + " -= => Subtrair e atribuir:\n       a -= b => a = a - b\n"
                    + " *= => Multiplicar e atribuir:\n       a *= b => a = a * b\n"
                        + " /= => Dividir e atribuir:\n       a /= b => a = a / b\n"
               + " %= => Calcular o resto da divisão e atribuir:\n       a %= b => a = a % b");
         int a;
         float resultado;
         System.out.println(" "); //Pulo de linha para melhor visualização
         System.out.println("Exemplo:");
         System.out.println(" "); //Pulo de linha para melhor visualização
         System.out.print("Informe um valor inteiro para 'a': ");
         a = sc.nextInt();
         System.out.println(" Então 'a' = "+a);
          System.out.println(" "); //Pulo de linha para melhor visualização
         System.out.println("+= => Somar e atribuir:");
         System.out.print("Informe um valor: ");
         int valor1 = sc.nextInt();
         System.out.println("'a' = "+ a + " + "+ valor1);
         int resultado1 =  a += valor1;
         System.out.println("Agora 'a' vale: "+ resultado1);
         
         System.out.println(" ");//Pulo de linha para melhor visualização
         System.out.println("-= => Subtrair e atribuir:");
         System.out.println("'a' está valendo: "+a);
         System.out.print("Informe outro valor: ");
         int valor2 = sc.nextInt();
         System.out.println("'a' = "+ a + " - "+ valor2);
         int resultado2 =  a -= valor2;
         System.out.println("Agora 'a' vale: "+ resultado2);
         
         System.out.println(" ");//Pulo de linha para melhor visualização
         System.out.println("*= => Multiplicar e atribuir:");
         System.out.println("'a' está valendo: "+a);
         System.out.print("Informe outro valor: ");
         int valor3 = sc.nextInt();
         System.out.println("'a' = "+ a + " x "+ valor3);
         int resultado3 =  a *= valor3;
         System.out.println("Agora 'a' vale: "+resultado3);
         
         System.out.println(" ");//Pulo de linha para melhor visualização
         System.out.println("/= => Dividir e atribuir:");
         System.out.println("'a' está valendo: "+a);
         System.out.print("Informe outro valor: ");
         int valor4 = sc.nextInt();
         System.out.println("'a' = "+ a + " / "+ valor4);
         float resultado4 =  a /= valor4; 
    //ARRUMAR resultado4 para mostrar números decimais.
         System.out.println("Agora 'a' vale: "+resultado4);
         
         System.out.println(" ");//Pulo de linha para melhor visualização
         System.out.println("%= => Calcular o resto e atribuir:");
         System.out.println("'a' está valendo: "+a);
         System.out.print("Informe outro valor: ");
         int valor5 = sc.nextInt();
         System.out.println("'a' = Resto da divisão de "+ a + " por "+ valor5);
         float resultado5 = a %= valor5;
         System.out.println("Agora 'a' vale: "+resultado5);
         
         
        
    }
    
}
