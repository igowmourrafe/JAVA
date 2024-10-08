/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser
decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de 
notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo forn
ecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: 
“Presentation Error”. */

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
   Scanner leia = new Scanner(System.in);
        
        int ins , atual , n1 , n2 , n5 , n10 , n20 , n50 , n100 , resto;

        ins = leia.nextInt();

        atual = ins;

        n100 = atual / 100;
        resto = atual % 100;
        n50 = resto / 50;
        resto = resto % 50;
        n20 = resto / 20;
        resto = resto % 20;
        n10 = resto / 10;
        resto = resto % 10;
        n5 = resto / 5;
        resto = resto % 5;
        n2 = resto / 2;
        resto = resto % 2;
        n1 = resto / 1;
        resto = resto % 1;
        System.out.printf("%d\n",ins);
        System.out.printf("%d nota(s) de R$ 100,00\n",n100);
        System.out.printf("%d nota(s) de R$ 50,00\n",n50);
        System.out.printf("%d nota(s) de R$ 20,00\n",n20);
        System.out.printf("%d nota(s) de R$ 10,00\n",n10);
        System.out.printf("%d nota(s) de R$ 5,00\n",n5);
        System.out.printf("%d nota(s) de R$ 2,00\n",n2);
        System.out.printf("%d nota(s) de R$ 1,00\n",n1);     
        
    }
	
