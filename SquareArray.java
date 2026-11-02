// import java.util.*;
public class SquareArray {
    public static void main(String[] args) {
        // Create an array of size 10
        int[] squaresArray = new int[10];

        // Add squares of the numbers from 0 to 9 to the array
        for (int j = 0; j < 10; j++) {
            squaresArray[j] = j * j;
        }

        // Print the array
        for (int square : squaresArray) {
            System.out.print(square + " ");
        }
    }
}
