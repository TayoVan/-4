import java.util.Scanner;
import java.util.Random;

public class tayovanroflyyyy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // generiruy chislo (kazik)
        int attempts = 0;
        int guess = 0;

        System.out.println("Вгадайте число від 1 до 100:");

        // Цикл while працює, доки користувач не вгадає число (xxx computer meynya obigral tut()
        while (guess != targetNumber) {
            System.out.print("Введіть ваше припущення: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Загадане число більше.");
            } else if (guess > targetNumber) {
                System.out.println("Загадане число менше.");
            }
        }

        System.out.println("Вітаємо! Ви вгадали число з " + attempts + " спроб.");
        scanner.close();
    }
}
//na ocenochku vishe mb
import java.util.Scanner;
import java.util.Random;

public class tayovanroflyyyyc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // generiruy chislo (kazik)
        int attempts = 0;
        int guess;

        System.out.println("Вгадайте число від 1 до 100:");

        // Цикл do-while, який гарантує хоча б одне виконання циклу
        do {
            System.out.print("Введіть ваше припущення: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Загадане число більше.");
            } else if (guess > targetNumber) {
                System.out.println("Загадане число менше.");
            }
        } while (guess != targetNumber);

        System.out.println("Вітаємо! Ви вгадали число з " + attempts + " спроб.");
        scanner.close();
    }
}
