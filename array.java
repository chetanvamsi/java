import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[6];
        System.out.println("Enter the numbers:");
        for(int i=0; i<=5; i++){
            n[i] = sc.nextInt();
        }
        System.out.println("our array has following numbers");
        for(int i=0; i<=5; i++){
            System.out.println(n[i]);
        }
        sc.close();
    }
}
