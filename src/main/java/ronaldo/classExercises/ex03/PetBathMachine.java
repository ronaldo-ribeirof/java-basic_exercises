package ronaldo.classExercises.ex03;

public class PetBathMachine {
    private int estado; // 0 - livre, 1 - ocupada
    private int limpeza; // 0 - limpa, 1 - suja
    private boolean petNaMaquina;
    private boolean petLimpo;
    private int nivelAgua;
    private int nivelShampoo;

    public PetBathMachine() {
        estado = 0;
        limpeza = 0;
        petNaMaquina = false;
        petLimpo = false;
        nivelAgua = 0;
        nivelShampoo = 0;
    }

    public void darBanho() {
        if (estado == 1 && limpeza == 0 && petNaMaquina) {
            if (nivelAgua >= 10 && nivelShampoo >= 2) {
                nivelAgua -= 10;
                nivelShampoo -= 2;
                petLimpo = true;
                System.out.println("Banho finalizado!");
            } else {
                System.out.println("Nível insuficiente de água ou shampoo.");
            }
        } else if (estado == 0) {
            System.out.println("Não há pet na máquina.");
        } else if (limpeza == 1) {
            System.out.println("A máquina está suja. Por favor, limpe-a antes de dar outro banho.");
        }
    }

    public void abastecerAgua(int litros) {
        if (litros > 0 && litros <= 2) {
            if (nivelAgua + litros <= 30) {
                nivelAgua += litros;
                System.out.println("Você abasteceu " + litros + "l de água");
            } else {
                System.out.println("Você não pode abastecer mais que 30 litros de água");
            }
        } else {
            System.out.println("Quantidade inválida. Insira entre 1 a 2 litros.");
        }
    }

    public void abastecerShampoo(int litros) {
        if (litros > 0 && litros <= 2) {
            if (nivelShampoo + litros <= 10) {
                nivelShampoo += litros;
                System.out.println("Você abasteceu " + litros + "l de shampoo");
            } else {
                System.out.println("Você não pode abastecer mais que 10 litros de shampoo");
            }
        } else {
            System.out.println("Quantidade inválida. Insira entre 1 a 2 litros.");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("O nível de água atual é: " + nivelAgua + "l");
    }

    public void verificarNivelShampoo() {
        System.out.println("O nível de shampoo atual é: " + nivelShampoo + "l");
    }

    public void verificarEstado() {
        if (estado == 1) {
            System.out.println("Há pet na máquina.");
        } else {
            System.out.println("A máquina está livre.");
        }
    }

    public void colocarPet() {
        if (estado == 0 && limpeza == 0) {
            estado = 1;
            petNaMaquina = true;
            petLimpo = false;
            System.out.println("O pet foi colocado na máquina.");
        } else if (estado == 1) {
            System.out.println("A máquina está ocupada. Por favor, aguarde.");
        } else if (limpeza == 1) {
            System.out.println("A máquina está suja. Por favor, limpe-a antes de colocar um pet.");
        }
    }

    public void retirarPet() {
        if (estado == 1 && petNaMaquina) {
            if (!petLimpo) {
                limpeza = 1;
                System.out.println("O pet ainda não foi limpo. A máquina ficará suja após sua retirada.");
            }
            estado = 0;
            petNaMaquina = false;
            petLimpo = false;
            System.out.println("O pet foi retirado da máquina.");
        } else {
            System.out.println("A máquina está livre. Não há pet para retirar.");
        }
    }

    public void limparMaquina() {
        if (estado == 0 && limpeza == 1) {
            if (nivelAgua >= 3 && nivelShampoo >= 1) {
                nivelAgua -= 3;
                nivelShampoo -= 1;
                limpeza = 0;
                System.out.println("A máquina foi limpa.");
            } else {
                System.out.println("Nível insuficiente de água ou shampoo para limpeza.");
            }
        } else if (estado == 1) {
            System.out.println("A máquina está ocupada. Por favor, aguarde.");
        } else {
            System.out.println("A máquina já está limpa.");
        }
    }
}