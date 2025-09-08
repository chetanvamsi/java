import java.util.*;
public class greaternum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int j = 0;
        int[] arr = new int[n];
        System.out.println("enter "+ n +" elements in the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i] > 50){
                j++;
            }
        }
        System.out.println("The number of elements greater than 50 are " + j);
        sc.close();
    }
}

