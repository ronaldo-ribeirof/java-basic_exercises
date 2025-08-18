package ronaldo.dioChallenges.calculoFreteRapido;
/*
Uma empresa de logística precisa calcular o valor total de um frete
com base no peso da carga e no valor do frete por quilo.

A entrada deve conter:

O peso em quilos (double).
O valor do frete por quilo (double).

O programa deverá retornar o valor total do frete, formatado com duas casas decimais.

Retorno numérico formatado.


Entrada	Saída
10
5	50.00

3.5
12	42.00

7
7.5	52.50
 */


import java.util.Scanner;

public class CalculoFreteRapido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Leia o peso em quilos:
        //double peso = Double.parseDouble(scanner.nextLine());
        double peso = scanner.nextDouble();

        // TODO: Leia o valor do frete por quilo:
        //double frete = Double.parseDouble(scanner.nextLine());
        double frete = scanner.nextDouble();

        // TODO: Calcule o valor total do frete:
        double valorTotal = peso*frete;

        // TODO: Exiba o valor formatado com duas casas decimais:
        System.out.printf("%.2f\n", valorTotal);

        scanner.close();
    }
}