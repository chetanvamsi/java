import java.util.*;
public class student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subjects:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int total = (sub1 + sub2 + sub3);
        int average = (sub1 + sub2 + sub3)/2;
        System.out.println("Total marks: " + total + "\nAverage marks: " + average);
        sc.close();
    }
    
}
