import java.util.*;
public class greeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your names:");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        System.out.println("Enter your ages:");
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        System.out.println("Hello " + name1 + "what's your age really: " + age1);
        System.out.println("Hello " + name2 + "what's your age really: " + age2);
        sc.close();
    }
}
