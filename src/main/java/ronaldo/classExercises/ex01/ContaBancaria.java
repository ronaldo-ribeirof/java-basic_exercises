package ronaldo.classExercises.ex01;

public class ContaBancaria {

    private final String nome;
    private double saldo;
    private final double cheque;
    private double chequeUsado;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        if (saldo < 501) {
            this.cheque = 50;
        } else {
            this.cheque = saldo*0.5;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$"+this.saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Cheque Especial: R$"+this.cheque);
    }

    public void depositarDinheiro(double valor) {
        saldo += valor;
        if (chequeUsado > 0 && saldo > 0) {
            double taxa = chequeUsado * 0.2;
            saldo -= taxa;
            System.out.println("Taxa de R$"+taxa+" cobrada pelo uso do cheque especial");
            chequeUsado = 0;
        }
    }

    public void sacarDinheiro(double valor) {
        double totalDisponivel = saldo+cheque;
        if (valor <= totalDisponivel) {
            saldo -= valor;
            if (saldo < 0) {
                chequeUsado = -saldo;
            }
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void pagarBoleto(double valor) {
        double totalDisponivel = saldo+cheque;
        if (valor <= totalDisponivel) {
            saldo -= valor;
            if (saldo < 0) {
                chequeUsado = -saldo;
            }
            System.out.println("Boleto pago!");
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public boolean verificarUsoCheque() {
        return saldo < 0;
    }

}
