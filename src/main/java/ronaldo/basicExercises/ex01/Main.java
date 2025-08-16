package ronaldo.basicExercises.ex01;

/*
Escreva um código que receba o nome e o ano de nascimento de alguém
e imprima na tela a seguinte mensagem: Olá fulano, você tem X anos
*/

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Ano de Nascimento: ");
        int anoNascimento = Integer.parseInt(scanner.nextLine());

        System.out.printf("Seu nome é %s, você tem %d anos.\n", nome, LocalDate.now().getYear() - anoNascimento);
    }
}