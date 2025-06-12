

public class division {
        public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number to be divided: ");
        double dividend = sc.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = sc.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double quotient = dividend / divisor;
            double remainder = dividend % divisor;
            System.out.println("The result of dividing " + dividend + " by " + divisor + " is: " + quotient);
            System.out.println("The remainder of dividing " + dividend + " by " + divisor + " is: " + remainder);
        }
        sc.close();
    }
}
