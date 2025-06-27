
import java.util.Scanner;



public class amgstrong {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number to check if it is an Armstrong number:");
         int number = scanner.nextInt();
         int copynumber = number;
        int sum = 0;
        while(copynumber!=0){
            int lastdigit= copynumber % 10;
            sum += lastdigit * lastdigit * lastdigit; 
            copynumber /= 10; 
        }

        if(sum == number){
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
    
}
