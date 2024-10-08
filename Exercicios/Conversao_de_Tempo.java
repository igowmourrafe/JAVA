/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido. */

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
   Scanner leia = new Scanner(System.in);
        
        int seg , hora , min , restoseg;

        seg = leia.nextInt();

        hora = seg / 3600;
        min = seg % 3600;
        min = min / 60;
        restoseg = seg % 60;

        System.out.printf("%d:%d:%d\n",hora,min,restoseg);      
        
    }
}