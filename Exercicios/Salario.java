
/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe
por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas
casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, qua
ntidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depoi
s da igualdade. No caso do salário, também deve haver um espaço em branco após o $.*/

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner leia = new Scanner(System.in);
        
        int numero , horas;
        double valor , salario;

        numero = leia.nextInt();
        horas = leia.nextInt();
        valor = leia.nextDouble();
        salario = horas * valor;

        System.out.printf("NUMBER = %d\n",numero);
        System.out.printf("SALARY = U$ %.2f\n",salario);
 
    }
 
}
