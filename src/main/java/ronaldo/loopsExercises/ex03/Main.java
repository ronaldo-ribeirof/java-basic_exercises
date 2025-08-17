package ronaldo.loopsExercises.ex03;

/*
Código que o usuário escreve um primeiro número,
um segundo maior que o primeiro, e escolhe par ou impar.
O código deve informar todos os números pares ou ímpares
no intervalo informado, incluindo os números digitados,
em ordem decrescente.
 */

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.println("Digite o segundo número (maior que o primeiro): ");
        int segundo = scanner.nextInt();
        System.out.println("Escolha 'par' ou 'impar': ");
        String escolha = scanner.next().toLowerCase();

        for (int i = segundo; i >= primeiro; i--) {
            if (escolha.equals("par") && i%2 == 0) {
                System.out.println(i);
            } else if (escolha.equals("impar") && i%2 != 0) {
                System.out.println(i);
            }
        }
    }
}
