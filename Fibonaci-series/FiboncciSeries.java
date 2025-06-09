public class FiboncciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms to display
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for(int i=0;i<=n;i++){
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
             
        }
        }
    }
