
import java.util.Scanner;

// package phone_Number;

// public Write a phone number word decoder :
// Write a program in Java that’ll accept a phone number with letters and convert it to a phone number with only digits. For example, if you sent the program a phone number like 800888TEST, it should return (800) 888-8378. {
    
// }

class phone{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phone number with letters (e.g., 800888TEST): ");
        String input = scanner.nextLine().toUpperCase();
        
        
        scanner.close();
    }
}
