import java.util.*;
public class evennum {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The even numbers are:");
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    sc.close();
    }
}

