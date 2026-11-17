package Functions;
import java.util.*;
public class Circumference {
    public static double Circle(double r){
        double circumference = 2*3.14*r;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(Circle(r));
        sc.close();
    }
}
