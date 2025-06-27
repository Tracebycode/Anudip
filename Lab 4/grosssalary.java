import java.util.Scanner;

public class grosssalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int response = -1; // Initialize response to enter the loop
        System.out.println("Welcome to the Gross Salary Calculator!");
       do { 
            double basicSalary;
            System.out.print("Enter the basic salary: ");
            basicSalary = scanner.nextDouble();
            if (basicSalary < 0) {
                System.out.println("Basic salary cannot be negative. Please try again.");
                continue;
            }
            double hra,da;
            if (basicSalary > 1500) {
                hra = basicSalary * 0.15;
                da = basicSalary * 0.60; 
            } else {
                hra = 3000; 
                da = basicSalary * 0.70; 
            }
            int grossSalary = (int) (basicSalary + hra + da);
            System.out.println("Gross Salary: " + grossSalary);
            System.out.print("Do you want to calculate again? Enter -1 if You need to calcuate again else Any other number: ");
             response = scanner.nextInt();

             
       } while (response==-1);

        if (response != -1) {
            System.out.println("Thank you for using the Gross Salary Calculator!");
        }
        scanner.close();

    }

    
}
