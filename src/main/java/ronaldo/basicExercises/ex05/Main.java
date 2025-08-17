package ronaldo.basicExercises.ex05;

/*
Aprendi sobre o switch!
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose a season of the year (1-4): ");
        System.out.println("1 - Spring");
        System.out.println("2 - Summer");
        System.out.println("3 - Fall");
        System.out.println("4 - Winter");
        System.out.println("Your choice is: ");
        int season = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

        System.out.println("The");
        switch (season) {
            case 1 -> System.out.println("Spring");
            case 2 -> System.out.println("Summer");
            case 3 -> System.out.println("Fall");
            case 4 -> System.out.println("Winter");
            default -> System.out.println("Invalid choice");
        }

        System.out.println("is coming!");

    }
}
