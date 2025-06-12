package compound;

public class compound_interest {    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter rate of interest (in %): ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
        
        System.out.print("Enter number of times interest applied per year: ");
        int n = sc.nextInt();
        
        double amount = principal * Math.pow((1 + (rate / (n * 100))), (n * time));
        
        System.out.println("Total amount after " + time + " years is: " + amount);
    }
    
}
