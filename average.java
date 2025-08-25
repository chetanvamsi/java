import java.util.*;
public class average {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int t = sc.nextInt();
        int n[] = new int[t];
        int sum = 0;
        System.out.println("Enter the numbers:");
        for(int i=0; i<n.length; i++){
            n[i] = sc.nextInt();
        }
        System.out.println("our array has following numbers");
        for(int i=0; i<n.length; i++){
            System.out.println(n[i]);
            sum = sum +n[i];
        }
        System.out.println("Sum of numbers is :"+ sum);
        float avg = sum/n.length;
        System.out.println("Average is:" + avg);
        sc.close();
    }
}

    

