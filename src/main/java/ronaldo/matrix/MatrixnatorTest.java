package ronaldo.matrix;

public class MatrixnatorTest {
    public static void main(String[] args) {
        // Matriz de Floats
        System.out.println("--- Printing Matrix (Floats) ---");
        float[][] floatMatrix = {
                {1.00f, 0.00f, 0.00f},
                {0.00f, 1.00f, 0.00f},
                {0.00f, 0.00f, 1.00f}
        };
        Matrixnator.printFloatMatrix(floatMatrix);
        System.out.println("\n");

        // Matriz de Doubles
        System.out.println("--- Printing Matrix (Doubles) ---");
        double[][] doubleMatrix = {
                {123.456, 789.012, 345.678},
                {987.654, 321.098, 765.432},
                {111.222, 333.444, 555.666}
        };
        Matrixnator.printDoubleMatrix(doubleMatrix);
        System.out.println("\n");

        // Matriz de Inteiros
        System.out.println("--- Printing Matrix (Integers) ---");
        int[][] intMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Matrixnator.printIntMatrix(intMatrix);
        System.out.println("\n");
    }
}