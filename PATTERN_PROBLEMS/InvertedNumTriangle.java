package PATTERN_PROBLEMS;
import java.util.*;
public class InvertedNumTriangle {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        cs.close();
    }
}
