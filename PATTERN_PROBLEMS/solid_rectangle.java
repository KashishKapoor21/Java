package PATTERN_PROBLEMS;
import java.util.*;
class solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int r = sc.nextInt();
    for(int i =0; i<r; i++){
        for(int j =0; j< c; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
    } 
}
