

public class vowel {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonent.");
        }
    }
    
}
