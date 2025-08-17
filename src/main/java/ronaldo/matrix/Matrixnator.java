package ronaldo.matrix;

public class Matrixnator {
    private static void printFrame(int numColunas, String start, String separator, String end) {
        System.out.print(start);
        for (int c = 0; c < numColunas; c++) {
            System.out.print("───────");
            if (c < numColunas - 1) System.out.print(separator);
        }
        System.out.println(end);
    }

    public static void printFloatMatrix(float[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Empty or null matrix.");
            return;
        }

        int numLinhas = matrix.length;
        int numColunas = matrix[0].length;
        int cellWidth = 7;

        printFrame(numColunas, "┌", "┬", "┐");

        for (int l = 0; l < numLinhas; l++) {
            System.out.print("│");
            for (int c = 0; c < numColunas; c++) {
                String value = String.format("%.2f", matrix[l][c]);
                int padding = cellWidth - value.length();
                int leftPadding = padding / 2;
                int rightPadding = padding - leftPadding;

                for (int i = 0; i < leftPadding; i++) {
                    System.out.print(" ");
                }
                System.out.print(value);
                for (int i = 0; i < rightPadding; i++) {
                    System.out.print(" ");
                }
                System.out.print("│");
            }
            System.out.println();
            if (l < numLinhas - 1) {
                printFrame(numColunas, "├", "┼", "┤");
            }
        }

        printFrame(numColunas, "└", "┴", "┘");
        System.out.println("Printed by Matrixnator.");
    }

    public static void printDoubleMatrix(double[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Empty or null matrix.");
            return;
        }

        int numLinhas = matrix.length;
        int numColunas = matrix[0].length;
        int cellWidth = 7;

        printFrame(numColunas, "┌", "┬", "┐");

        for (int l = 0; l < numLinhas; l++) {
            System.out.print("│");
            for (int c = 0; c < numColunas; c++) {
                String value = String.format("%.2f", matrix[l][c]);
                int padding = cellWidth - value.length();
                int leftPadding = padding / 2;
                int rightPadding = padding - leftPadding;

                for (int i = 0; i < leftPadding; i++) {
                    System.out.print(" ");
                }
                System.out.print(value);
                for (int i = 0; i < rightPadding; i++) {
                    System.out.print(" ");
                }
                System.out.print("│");
            }
            System.out.println();
            if (l < numLinhas - 1) {
                printFrame(numColunas, "├", "┼", "┤");
            }
        }

        printFrame(numColunas, "└", "┴", "┘");
        System.out.println("Printed by Matrixnator.");
    }

    public static void printIntMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Empty or null matrix.");
            return;
        }

        int numLinhas = matrix.length;
        int numColunas = matrix[0].length;
        int cellWidth = 7;

        printFrame(numColunas, "┌", "┬", "┐");

        for (int l = 0; l < numLinhas; l++) {
            System.out.print("│");
            for (int c = 0; c < numColunas; c++) {
                String value = String.valueOf(matrix[l][c]);
                int padding = cellWidth - value.length();
                int leftPadding = padding / 2;
                int rightPadding = padding - leftPadding;

                for (int i = 0; i < leftPadding; i++) {
                    System.out.print(" ");
                }
                System.out.print(value);
                for (int i = 0; i < rightPadding; i++) {
                    System.out.print(" ");
                }
                System.out.print("│");
            }
            System.out.println();
            if (l < numLinhas - 1) {
                printFrame(numColunas, "├", "┼", "┤");
            }
        }

        printFrame(numColunas, "└", "┴", "┘");
        System.out.println("Printed by Matrixnator.");
    }
}