package ronaldo.matrix.ex01;

import java.util.Scanner;
import ronaldo.matrix.Matrixnator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qtde de linhas da matriz: ");
        int qtdeLinhas = Integer.parseInt(scanner.nextLine());

        System.out.print("Qtde de colunas da matriz: ");
        int qtdeColunas = Integer.parseInt(scanner.nextLine());

        float[][] matrix = new float[qtdeLinhas][qtdeColunas];

        for (int l = 0; l < qtdeLinhas; l++) {
            for (int c = 0; c < qtdeColunas; c++) {
                System.out.printf("Digite o valor do elem. da linha %d, coluna %d: ", l+1, c+1);
                matrix[l][c] = Float.parseFloat(scanner.nextLine());
            }
        }
        Matrixnator.printFloatMatrix(matrix);
    }
}
