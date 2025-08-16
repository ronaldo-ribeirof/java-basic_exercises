package ronaldo.exercises.ex04;

/*
Escreva um programa que leia o nome e a idade de duas pessoas
e mostre na tela a diferença de idade entre elas.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes =  new String[2];
        int[] idades =  new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Nome %d: ", i+1);
            nomes[i] =  scanner.nextLine();
            System.out.printf("Idade %d: ", i+1);
            idades[i] =  Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("Diferença de idade entre %s e %s: %d", nomes[0], nomes[1], (idades[0] > idades[1] ? idades[0]-idades[1] : idades[1]-idades[0]));
    }
}