import java.util.*;
public class location {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the guess element in the array");
        int target = sc.nextInt();
        System.out.println("Enter " + n + " elements");     
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }   
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                System.out.println("The element found in the array");
            }
        }
        sc.close();
    }
}
