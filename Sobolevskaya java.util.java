import java.util.Scanner;

public class TayoVan {
    public static double calculateFunction(int x, double a, double b) {
        double result = Double.NaN;
        // Завдання 1: Обчислення значення функції f(x) з використанням if та switch-case
        System.out.println("Завдання 1: Обчислення значення функції f(x)");
        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть x (1, 2 або 3): ");
        int x = scanner.nextInt();
        double result = calculateFunction(x, a, b);
        if (!Double.isNaN(result)) {
            System.out.println("Результат: " + result);
        }