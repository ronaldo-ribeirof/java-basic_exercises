package ronaldo.classExercises.ex01;

public class ContaBancariaTest {
    public static void main(String[] args) {
        System.out.println("=== TESTES DE CONTA BANCÁRIA ===");

        // Teste 1: Conta com saldo abaixo de R$500
        ContaBancaria conta1 = new ContaBancaria("João", 400);
        System.out.println("\n[Conta João]");
        conta1.consultarSaldo(); // Esperado: R$400
        conta1.consultarChequeEspecial(); // Esperado: R$50

        conta1.sacarDinheiro(430); // Usa R$30 do cheque especial
        conta1.consultarSaldo(); // Esperado: –R$30
        System.out.println("Usando cheque especial? " + conta1.verificarUsoCheque()); // true

        conta1.depositarDinheiro(50); // Deve cobrar taxa de R$6
        conta1.consultarSaldo(); // Esperado: R$14
        System.out.println("Usando cheque especial? " + conta1.verificarUsoCheque()); // false

        // Teste 2: Conta com saldo acima de R$500
        ContaBancaria conta2 = new ContaBancaria("Maria", 1000);
        System.out.println("\n[Conta Maria]");
        conta2.consultarSaldo(); // Esperado: R$1000
        conta2.consultarChequeEspecial(); // Esperado: R$500

        conta2.pagarBoleto(1200); // Usa R$200 do cheque especial
        conta2.consultarSaldo(); // Esperado: –R$200
        System.out.println("Usando cheque especial? " + conta2.verificarUsoCheque()); // true

        conta2.depositarDinheiro(300); // Deve cobrar taxa de R$40
        conta2.consultarSaldo(); // Esperado: R$60
        System.out.println("Usando cheque especial? " + conta2.verificarUsoCheque()); // false

        // Teste 3: Tentativa de saque acima do limite total
        ContaBancaria conta3 = new ContaBancaria("Carlos", 200);
        System.out.println("\n[Conta Carlos]");
        conta3.consultarSaldo(); // R$200
        conta3.consultarChequeEspecial(); // R$50

        conta3.sacarDinheiro(300); // Excede limite (200 + 50 = 250)
        conta3.consultarSaldo(); // Deve continuar R$200
        System.out.println("Usando cheque especial? " + conta3.verificarUsoCheque()); // false

        // Teste 4: Pagamento de boleto sem usar cheque especial
        ContaBancaria conta4 = new ContaBancaria("Ana", 600);
        System.out.println("\n[Conta Ana]");
        conta4.consultarSaldo(); // R$600
        conta4.consultarChequeEspecial(); // R$300

        conta4.pagarBoleto(200); // Dentro do saldo
        conta4.consultarSaldo(); // Esperado: R$400
        System.out.println("Usando cheque especial? " + conta4.verificarUsoCheque()); // false

        // Teste 5: Depósito sem taxa (não usou cheque especial)
        conta4.depositarDinheiro(100); // Sem taxa
        conta4.consultarSaldo(); // Esperado: R$500

        System.out.println("\n=== FIM DOS TESTES ===");
    }
}