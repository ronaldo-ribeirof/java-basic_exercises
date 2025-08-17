package ronaldo.matrix.ex01;

import java.util.Scanner;
import java.util.Arrays;
import ronaldo.matrix.Matrixnator;

public class Main {
    public static void printMatrixI(float[][] m) {
        int numLinhas = m.length;
        int numColunas = m[0].length;

        for (int l = 0; l < numLinhas; l++) {
            System.out.print("|");
            for (int c = 0; c < numColunas; c++) {
                System.out.printf(" %3.2f |", m[l][c]);
            }
            System.out.println();
        }
        System.out.println("Printed by Me.");
    }

    public static void printMatrixII(float[][] m) {
        int numLinhas = m.length;
        for (int l = 0; l < numLinhas; l++) {
            System.out.println(Arrays.toString(m[l]));
        }
        System.out.println("Printed by Me.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qtde de linhas da matriz: ");
        int qtdeLinhas = Integer.parseInt(scanner.nextLine());

        System.out.print("Qtde de colunas da matriz: ");
        int qtdeColunas = Integer.parseInt(scanner.nextLine());

        float[][] matrix = new float[qtdeLinhas][qtdeColunas];

        for (int linha = 0; linha < qtdeLinhas; linha++) {
            for (int coluna = 0; coluna < qtdeColunas; coluna++) {
                System.out.printf("Digite o valor do elem. da linha %d, coluna %d: ", linha+1, coluna+1);
                matrix[linha][coluna] = Float.parseFloat(scanner.nextLine());
            }
        }
        Matrixnator.printFloatMatrix(matrix);
        System.out.println();
        printMatrixI(matrix);
        System.out.println();
        printMatrixII(matrix);

    }
}
