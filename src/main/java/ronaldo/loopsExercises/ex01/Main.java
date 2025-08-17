package ronaldo.loopsExercises.ex01;

/*
Usuário insere um número e é gerada a tabuada de 1 a 10 para esse número.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número para gerar a tabuada: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("==============");
        System.out.println("Tabuada de " + numero);
        System.out.println("==============");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero*i);
        }
    };
}
