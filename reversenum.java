import java.util.*;
public class reversenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the reversed array elements are:");
        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

