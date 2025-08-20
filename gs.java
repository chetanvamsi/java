import java.util.*;
public class gs{
    public static void main(String[] args){
        //the functionality of object is done when we use ibjects
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        System.out.println("Enter the number:");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("the value of a is greater than b");
        }
        else if(a==b){
            System.out.println("the value of a is equal to b");
        }
        else{
            System.out.println("the value of b is greater than a");
        }
    }
}