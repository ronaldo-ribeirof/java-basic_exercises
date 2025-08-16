package ronaldo.matrix;
import java.util.Arrays;

public class Matrixnator {
    public static void printFloatMatrix(float[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty or null matrix.");
        } else {
            for (float[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println("Printed by Matrixnator.");
        }
    }

    public static void printDoubleMatrix(double[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty or null matrix.");
        } else {
            for (double[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println("Printed by Matrixnator.");
        }
    }

    public static void printIntMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty or null matrix.");
        } else {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println("Printed by Matrixnator.");
        }
    }
}