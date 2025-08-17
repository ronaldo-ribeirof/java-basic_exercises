package ronaldo.loopsExercises.ex04;

/*
Código que o usuário informa um número,
posteriormente informará x números,
ira continuar até que
o número informado dividido pelo primeiro número tenha resto diferente de 0,
além disso, números menores que o primeiro devem ser ignorados.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numInicial = Integer.parseInt(scanner.nextLine());

        int num = numInicial;
        while (num % numInicial == 0) {
            num = Integer.parseInt(scanner.nextLine());
            if (num < numInicial) {
                num = numInicial;
            }
        }
    }
}
