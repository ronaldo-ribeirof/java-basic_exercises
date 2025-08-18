package ronaldo.classExercises.ex01;

/*

todos os execicios devem ter um menu de interativo para chamar as funções
e ter uma opção de sair para finalizar a execução

ex01
Escreva um código onde temos uma conta bancaria que possa realizar
as seguintes operações:
Consultar saldo
consultar cheque especial
Depositar dinheiro;
Sacar dinheiro;
Pagar um boleto.
Verificar se a conta está usando cheque especial.
Siga as seguintes regras para implementar

A conta bancária deve ter um limite de cheque especial
somado ao saldo da conta;

O valor do cheque especial é definido no momento da criação da conta,
de acordo com o valor depositado na conta em sua criação;

Se o valor depositado na criação da conta for de R$500,00 ou menos
o cheque especial deve ser de R$50,00

Para valores acima de R$500,00 o cheque especial deve ser de
50% do valor depositado;

Caso o limite de cheque especial seja usado, assim que possível
a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        String res = "";

        while (!res.equals("sair")) {
            System.out.println("===== MENU INTERATIVO =====");
            System.out.println("=== Escolha uma opção: ===");
            System.out.println("1. Criar conta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Consultar cheque especial");
            System.out.println("4. Depositar dinheiro");
            System.out.println("5. Sacar dinheiro");
            System.out.println("6. Pagar um boleto");
            System.out.println("7. Verificar se a conta está usando cheque especial");
            System.out.println("Digite ''sair'' para sair.");

            res = scanner.nextLine();

            switch (res){
                case "1": {
                    System.out.println("Digite o nome da conta: ");
                    String nomeConta = scanner.nextLine();
                    System.out.println("Digite o saldo da conta: ");
                    double valorTemp = Double.parseDouble(scanner.nextLine());

                    contas.add(new ContaBancaria(nomeConta, valorTemp));
                    break;
                }
                case "2": {
                    System.out.println("Digite o nome da conta: ");
                    String nomeConta = scanner.nextLine();

                    var conta = acessarConta(nomeConta, contas);

                    if (conta != null) {
                        conta.consultarSaldo();
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                }
                case "3": {
                    System.out.println("Digite o nome da conta: ");
                    String nomeConta = scanner.nextLine();

                    var conta = acessarConta(nomeConta, contas);

                    if (conta != null) {
                        conta.consultarChequeEspecial();
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                }
                case "4": {
                    System.out.println("Digite o nome da conta: ");
                    String nomeConta = scanner.nextLine();

                    var conta = acessarConta(nomeConta, contas);

                    if (conta != null) {
                        System.out.println("Digite a quantia a ser depositada: ");
                        double valorTemp = Double.parseDouble(scanner.nextLine());
                        conta.depositarDinheiro(valorTemp);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                }
                case "5": {
                    System.out.println("Digite o nome da conta: ");
                    String nomeConta = scanner.nextLine();

                    var conta = acessarConta(nomeConta, contas);

                    if (conta != null) {
                        System.out.println("Digite a quantia a ser sacada: ");
                        double valorTemp = Double.parseDouble(scanner.nextLine());
                        conta.sacarDinheiro(valorTemp);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                }
                case "6": {
                    System.out.println("Digite o nome da conta: ");
                    String nomeConta = scanner.nextLine();

                    var conta = acessarConta(nomeConta, contas);

                    if (conta != null) {
                        System.out.println("Digite o valor do boleto: ");
                        double valorTemp = Double.parseDouble(scanner.nextLine());
                        conta.pagarBoleto(valorTemp);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                }
                case "7": {
                    System.out.println("Digite o nome da conta: ");
                    String nomeConta = scanner.nextLine();

                    var conta = acessarConta(nomeConta, contas);

                    if (conta != null) {
                        if (conta.verificarUsoCheque()) {
                            System.out.println("A conta está usando cheque especial");
                        } else {
                            System.out.println("A conta NÃO está usando cheque especial");
                        }
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                }
            }
        }
    }

    public static ContaBancaria acessarConta(String nomeConta, ArrayList<ContaBancaria> contas) {
        for (ContaBancaria c : contas) {
            if (c.getNome().equalsIgnoreCase(nomeConta)) {
                return c;
            }
        }
        return null;
    }
}
