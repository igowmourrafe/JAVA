
/*Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula:

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para 
chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior". */

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner leia = new Scanner(System.in);

        int A , B , C;

        A = leia.nextInt();
        B = leia.nextInt();
        C = leia.nextInt();

        if(A > B && A > C){
            System.out.printf("%d eh o maior\n",A);            
        }
        else if(B > C){
            System.out.printf("%d eh o maior\n",B);  
        }
        else{
            System.out.printf("%d eh o maior\n",C); 
        }
    }
}
