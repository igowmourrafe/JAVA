
/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule 
a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:

Distancia =

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda 
linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais. */

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner leia = new Scanner(System.in);

        double X1 , X2 , Y1 , Y2 , Distancia;

        X1 = leia.nextDouble();
        Y1 = leia.nextDouble();
        X2 = leia.nextDouble();
        Y2 = leia.nextDouble();

        Distancia = Math.sqrt(Math.pow((X2 - X1),2) + Math.pow((Y2 - Y1),2));

        System.out.printf("%.4f\n",Distancia);
        
        
    }
}
