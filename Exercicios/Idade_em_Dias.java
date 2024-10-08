/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido. */

import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
   Scanner leia = new Scanner(System.in);
        
        int  n , anos , meses , dia;

        n = leia.nextInt();

        anos = n / 365;
        meses = n % 365;
        meses = meses / 30;
        dia = (n % 365) % 30;

        System.out.printf("%d ano(s)\n",anos);    
        System.out.printf("%d mes(es)\n",meses); 
        System.out.printf("%d dia(s)\n",dia); 
        
    }
}