
import java.util.Scanner;



public class odd_even {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int response = -1; 
    int evenCount = 0;
    int oddCount = 0;
    do{
        System.out.print("Enter a number till which you want to count odd and even number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
        } 
        for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }
        System.out.println("Total even numbers from 1 to " + n + ": " + evenCount);
        System.out.println("Total odd numbers from 1 to " + n + ": " + oddCount);
        
        System.out.print("Do you want to count again? Enter -1 if You need to count again else Any other number: ");
        response = scanner.nextInt();
        
        evenCount = 0;
        oddCount = 0;
    } while (response == -1);
    


    if (response != -1) {
        System.out.println("Thank you for using the Odd and Even Number Counter!");
    }
    scanner.close();  
}
}
