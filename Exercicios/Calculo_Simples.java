
/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de
uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um val
or com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e
um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

 */

 import java.io.IOException;
 import java.util.Scanner;
  
 public class Main {
  
     public static void main(String[] args) throws IOException {
     Scanner leia = new Scanner(System.in);
 
         int cod , cod2 , quant , quant2;
         double valor , valor2 , pagar;
 
 
         cod = leia.nextInt();
         quant = leia.nextInt();
         valor = leia.nextDouble();
         cod2 = leia.nextInt();
         quant2 = leia.nextInt();
         valor2 = leia.nextDouble();
         pagar = quant * valor + quant2 * valor2 ;
 
         System.out.printf("VALOR A PAGAR: R$ %.2f\n",pagar);
  
     }
  
 }
