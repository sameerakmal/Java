import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ValidPerfSqr {
        static public boolean isPerfectSquare(int n) {
            int l = 1;
            int h = n;
            int ans = 0;
            while(l <= h){
                int m = (l + h)/2;
                long sqr = (long) m * m;
                if(sqr == n){
                    return true;
                }
                else if(m < n/m){
                    l = m + 1;
                }
                else{
                    h = m - 1;
                }
            }
            return false;
        }
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        System.out.println(isPerfectSquare(5));
        
        scan.close();
    }
}