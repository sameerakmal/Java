import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArr {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            brr[i] = scan.nextInt();
        }
        int[] crr = new int[m+n];
        int p1 = 0, p2 = 0, p3 = 0;
        for (int i = 0; i < n + m; i++) {
            if(p1 == n){
                crr[p3] = brr[p2];
                p2++;
                p3++; 
            }
            else if(p2 == n){
                crr[p3] = arr[p1];
                p1++;
                p3++; 
            }
            else if(arr[p1] < brr[p2]){
                crr[p3] = arr[p1];
                p1++;
                p3++; 
            }
            else{
                crr[p3] = brr[p2];
                p2++;
                p3++; 
            }
        }
        System.out.println(Arrays.toString(crr));


        
        scan.close();
    }
}