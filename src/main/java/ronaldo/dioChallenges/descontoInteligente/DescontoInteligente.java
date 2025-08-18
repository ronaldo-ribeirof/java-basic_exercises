package ronaldo.dioChallenges.descontoInteligente;

/*

Descrição
Uma loja online deseja calcular o valor final de um produto após
aplicar um desconto percentual.

Entrada
A entrada deve conter:

O valor original do produto (double).
A porcentagem de desconto (double).

Saída
Deverá retornar o valor final do produto,
formatado com duas casas decimais.
Caso a porcentagem de desconto seja inválida
(menor que 0 ou maior que 100), deverá retornar a mensagem
Desconto invalido.

Retorno numérico formatado ou mensagem de erro: "Desconto invalido."


Entrada	Saída
100
10	90.00

250
15	212.50

80
5	76.00

90
150	Desconto invalido

 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class DescontoInteligente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia o valor original do produto:
        double valorOriginal = scanner.nextDouble();


        // TODO: Leia a porcentagem de desconto:
        double desconto = scanner.nextDouble();


        // TODO: Verifique se o desconto está dentro de um intervalo válido:
        if (desconto < 0 || desconto > 100) {
            System.out.println("Desconto invalido");
            scanner.close();
            return;
        }

        // TODO: Calcule o valor final do produto:
        double valorFinal = valorOriginal - (valorOriginal * (desconto/100));

        // Formata e exibe o valor com duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(valorFinal));

        scanner.close();
    }
}
