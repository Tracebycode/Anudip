import java.util.Scanner;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum of two integers: " + calc.add(a, b));

        System.out.print("Enter three integers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println("Sum of three integers: " + calc.add(x, y, z));

        System.out.print("Enter two decimal numbers: ");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(d1, d2));

        scanner.close();
    }
}
