
import java.util.*;
public class age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the birth year:");
        int birthyear = sc.nextInt();
        int currentyear = 2025;
        int age = currentyear - birthyear;
        System.out.println("Age: " + age); 
        sc.close();
    }
}
