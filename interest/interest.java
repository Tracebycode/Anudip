

class interest {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
        
        double interest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest is: " + interest);
        double totalAmount = principal + interest;
        System.out.println("Total amount after " + time + " years is: " + totalAmount);
    }
}
