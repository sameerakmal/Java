
import java.util.Arrays;

public class PaintersPartition {
    static public int paint(int w, int n, int[] arr) {
        int l = Arrays.stream(arr).max().getAsInt();
        int h = Arrays.stream(arr).sum();
        int mod = 10000003;
        int ans = 0;
        while(l <= h){
            int m = l + (h - l)/2;
            if(check(w,arr,m)){
                ans = m;
                h = m - 1;
            }
            else{
                l = m + 1;
            }
        }
        return (int) ((long) ans * n % mod);
    }
    static boolean check(int w, int[] arr, int m){
        int p = 1;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if(s > m){
                p++;
                s = arr[i];
            }
            if(p > w) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {1, 10};
        int ans = paint(2,5,arr);
        System.out.println(ans);
    }
}
