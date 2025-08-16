/*
Escreva um código que receba o tamanho do lado de um quadrado,
calcule sua área, e exiba na tela.
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Medida de um lado em cm: ");
        int lado = scanner.nextInt();
        System.out.printf("Área: %d cm\n", lado*lado);

    }
}
