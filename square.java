import java.util.*;
public class square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int square = num*num;
        System.out.println("The square of the number is: " + square);
        sc.close(); 
    }
}