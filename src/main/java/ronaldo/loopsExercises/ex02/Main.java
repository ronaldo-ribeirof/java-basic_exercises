package ronaldo.loopsExercises.ex02;

/*
Código que recebe altura e peso, e calcula o IMC
Fórmula: IMC = peso/(altura * altura).
Respostas exibidas de acordo com o resultado:

Se <= 18,5: Abaixo do peso
Se entre 18,6 e 24,9: Peso ideal
Se entre 25,0 e 29,9: Levemente acima do peso
Se entre 30,0 e 34,9: Obesidade grau I
Se entre 35,0 e 39,9: Obesidade grau II (Severa)
Se >= 40,0: Obesidade grau III (Mórbida)
 */

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Altura (m): ");
        float altura = Float.parseFloat(scanner.nextLine());
        System.out.print("Peso (Kg): ");
        float peso = Float.parseFloat(scanner.nextLine());

        float imc = peso/(altura*altura);

        System.out.println("IMC: "+imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc > 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc > 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc > 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}
