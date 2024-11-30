
import java.util.Arrays;

public class KthSmallest {
    public static int findKthLargest(int[] arr, int k) {
        int l = Arrays.stream(arr).min().getAsInt();
        int h = Arrays.stream(arr).max().getAsInt();
        int n = arr.length;
        while(l <= h){
            int m = (l + h)/2;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] < m) cnt++;
            }
            if(cnt <= (k-1)) l = m + 1;
            else h = m-1;
        }
        return h;
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 20, 15};
        
        int ans = findKthLargest(arr,4);
        System.out.println(ans);
        
    }
}
