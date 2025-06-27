
// public 1. Write a Java program that demonstrates various operations on a 3D array: 1. Initializing the 3D array with random values. 2. Finding the maximum value in the array. 3. Calculating the average of all elements. 4. Displaying the array.
import java.util.Random;

public class Array3d {
    public static void main(String[] args) {
        int[][][] array3d = new int[3][3][3];
        Random random = new Random();

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    array3d[i][j][k] = random.nextInt(100);
                }
            }
        }

        
        int maxValue = Integer.MIN_VALUE;
        for (int[][] matrix : array3d) {
            for (int[] row : matrix) {
                for (int value : row) {
                    if (value > maxValue) {
                        maxValue = value;
                    }
                }
            }
        }

        
        int sum = 0;
        int count = 0;
        for (int[][] matrix : array3d) {
            for (int[] row : matrix) {
                for (int value : row) {
                    sum += value;
                    count++;
                }
            }
        }
        double average = (double) sum / count;

        
        System.out.println("3D Array:");
        for (int[][] matrix : array3d) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Average Value: " + average);
    }
}
