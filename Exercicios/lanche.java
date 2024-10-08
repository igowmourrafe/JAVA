/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.



Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal. */

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
   Scanner leia = new Scanner(System.in);
        
         int cod , q ; 
         double paga;
         paga = 1;

         cod = leia.nextInt();
         q = leia.nextInt();

         switch (cod) {
          case 1:
            paga = q * 4.00;
            break;
          case 2:
            paga = q * 4.50;
            break;
          case 3:
            paga = q * 5.00;
            break;
          case 4:
            paga = q * 2.00;
            break;
          case 5:
            paga = q * 1.50;
            break;
        }
        System.out.printf("Total: R$ %.2f\n",paga);
     } 
 }