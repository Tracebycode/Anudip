// Write a Java program that allows the user to create a bank account and perform transactions such as deposit, withdrawal, and balance inquiry. Using a conditional operator (ternary operator ), display the message whether minimum balance is maintained or not. Steps: ● Create a class BankAccount ● Add three member variables: String accountHolderName , int accountNumber and int balance; ● Add a constructors using all three members ● Add getters and setters. ● Add method deposit (int), withdraw(int) ● Implement the methods by increasing or decreasing the balance ● In the main method create a bank account ● Withdraw money from this account and/or deposit into this account ● Get the balance ● Create a string variable “status” inside the main method ● Assign values to status as “Minimum Balance Maintained” if balance is above or equal to 5000. Otherwise values of status will be “Minimum Balance not Maintained”. Use conditional operator (ternary operator ) to assign the values of the status. ● Display the status

import java.util.Scanner;

class BankAccount{
    int balance;
    String accountHolderName;
    int accountNumber;


    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance =  balance;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

public class accountTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();
        
        BankAccount account = new BankAccount(name, accountNumber, initialBalance);
        
        System.out.print("Enter amount to deposit: ");
        int depositAmount = scanner.nextInt();
        account.deposit(depositAmount);
        
        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        account.withdraw(withdrawAmount);
        
        int currentBalance = account.getBalance();
        
        String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Status: " + status);
        
        scanner.close();
    }
    
}


