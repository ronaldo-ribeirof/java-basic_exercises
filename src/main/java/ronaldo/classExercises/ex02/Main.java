package ronaldo.classExercises.ex02;

/*
Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
Ligar o carro;
Desligar o carro;
Acelerar;
diminuir velocidade;
virar para esquerda/direita
verificar velocidade;
trocar a marcha
Siga as seguintes regras na implementação

Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
O carro desligado não pode realizar nenhuma função;
Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
Quando diminuir a velocidade do carro ele deve decrementar 1 km de
sua velocidade (pode chegar no minimo a 0km);
o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
A velocidade do carro deve respeitar os seguintes limites para cada velocidade
se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        String opcao = "";

        while (!opcao.equalsIgnoreCase("sair")) {
            System.out.println("==== Menu do Carro ====");
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar");
            System.out.println("4. Diminuir velocidade");
            System.out.println("5. Virar para esquerda/direita");
            System.out.println("6. Verificar velocidade");
            System.out.println("7. Trocar marcha");
            System.out.println("Digite 'sair' para encerrar o programa");
            System.out.println("=======================");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1": {
                    carro.ligarCarro();
                    break;
                }
                case "2": {
                    carro.desligarCarro();
                    break;
                }
                case "3": {
                    carro.acelerar();
                    break;
                }
                case "4": {
                    carro.desacelerar();
                    break;
                }
                case "5": {
                    System.out.println("Digite 'e' para virar à esquerda ou 'd' para virar à direita:");
                    String direcao = scanner.nextLine();
                    if (direcao.equalsIgnoreCase("e")) {
                        carro.virarEsquerda();
                    } else if (direcao.equalsIgnoreCase("d")) {
                        carro.virarDireita();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                }
                case "6": {
                    carro.verificarVelocidade();
                    break;
                }
                case "7": {
                    System.out.println("Digite 'a' para aumentar a marcha ou 'd' para diminuir a marcha:");
                    String troca = scanner.nextLine();
                    if (troca.equalsIgnoreCase("a")) {
                        carro.aumentarMarcha();
                    } else if (troca.equalsIgnoreCase("d")) {
                        carro.diminuirMarcha();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
            }

        }

    }
}
