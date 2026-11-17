package Functions;
import java.util.*;
public class OddSum {
    public static int SumOfOdds(int n){
        int sum=0;
        for(int i=1; i<=n; i+=2){
            // if(i % 2 != 0){
                sum = sum+i;
            // }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        System.out.println(SumOfOdds(n));
        sc.close();
    }
}
