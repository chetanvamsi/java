import java.util.*;
public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of a circle: ");
        Double pi = 3.14;
        Double radius = sc.nextDouble();
        Double area = pi * radius * radius;
        System.out.println("Area of circle :" + area);
        sc.close();
    }
}


