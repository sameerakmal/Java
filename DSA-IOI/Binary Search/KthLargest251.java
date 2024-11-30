
import java.util.Arrays;

public class KthLargest251 {
        public static int findKthLargest(int[] arr, int k) {
            int l = Arrays.stream(arr).min().getAsInt();
            int h = Arrays.stream(arr).max().getAsInt();
            int n = arr.length;
            int ans = 0;
            while(l <= h){
                int m = (l + h)/2;
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if(arr[i] >= m) cnt++;
                }
                if (cnt >= k) {
                    l = m + 1;
                } else {
                    h = m - 1;
                }
            }
            return h;
            
        }
    public static void main(String[] args) {
        int[] arr = {99,99};
        
        int ans = findKthLargest(arr,1);
        System.out.println(ans);
        
    }
}
