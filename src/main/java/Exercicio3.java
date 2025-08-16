/*
Escreva um código que receba a base e a altura de um retângulo,
calcule sua área e exiba na tela.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base of the rectangle: ");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.print("Height of the rectangle: ");
        int height = Integer.parseInt(scanner.nextLine());

        System.out.printf("Area of the rectangle: %d\n", base*height);
    }
}
