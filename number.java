import java.util.*;
public class number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int t = sc.nextInt();
        int n[] = new int[t];
        int i, even = 0, odd = 0;
        System.out.println("Enter the numbers:");
        for(i=0; i<n.length; i++){
            n[i] = sc.nextInt();
            if(n[i] % 2 == 0){
                
            even = even + 1;
        }
        else{
            odd = odd + 1;
        }
        }
    System.out.println("The number of even numbers is:"+ even);
    System.out.println("The number of odd numbers is:"+ odd);
    sc.close();
    }
}
    

