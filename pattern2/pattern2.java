

public class pattern2 {
    public static void main(String[] args) {
        // Create an instance of the Singleton class
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                if((i==2 && j==2 || i==3 && j==3)){            
                    System.out.print("  ");
            }
            else{
                System.out.print("* ");
            }
        }
        System.out.println(" ");

    }

}
}

