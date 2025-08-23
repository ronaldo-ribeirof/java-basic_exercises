package ronaldo.classExercises.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetBathMachine maquina = new PetBathMachine();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu PetBathMachine ---");
            System.out.println("1. Colocar pet na máquina");
            System.out.println("2. Dar banho no pet");
            System.out.println("3. Retirar pet da máquina");
            System.out.println("4. Limpar máquina");
            System.out.println("5. Abastecer água");
            System.out.println("6. Abastecer shampoo");
            System.out.println("7. Verificar nível de água");
            System.out.println("8. Verificar nível de shampoo");
            System.out.println("9. Verificar estado da máquina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquina.colocarPet();
                    break;
                case 2:
                    maquina.darBanho();
                    break;
                case 3:
                    maquina.retirarPet();
                    break;
                case 4:
                    maquina.limparMaquina();
                    break;
                case 5:
                    System.out.print("Quantos litros de água (1 ou 2)? ");
                    int agua = scanner.nextInt();
                    maquina.abastecerAgua(agua);
                    break;
                case 6:
                    System.out.print("Quantos litros de shampoo (1 ou 2)? ");
                    int shampoo = scanner.nextInt();
                    maquina.abastecerShampoo(shampoo);
                    break;
                case 7:
                    maquina.verificarNivelAgua();
                    break;
                case 8:
                    maquina.verificarNivelShampoo();
                    break;
                case 9:
                    maquina.verificarEstado();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}