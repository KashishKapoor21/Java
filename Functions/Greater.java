package Functions;
import java.util.*;
public class Greater {
    public static int GreaterNum(int a, int b){
        if(a != b){
            if(a>b){
                return a;
            }
            else{
                return b;
            }
        }
        else{
            System.out.println("Both are equal");
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        System.out.println(GreaterNum(a,b));
        cs.close();
    }
}
