public class CountNeg1351 {
    public static int countNegatives(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int ans = 0;
        for (int i = 0; i < r; i++) {
            int l = 0;
            int h = c-1;
            int cnt = 0;
            while(l <= h){
                int m = (l+h)/2;
                if(arr[i][m] < 0){
                    
                    cnt = r - m;
                    h = m - 1;
                }
                else{
                    l = m + 1;
                }
            }
            ans += cnt;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {3, 2},
            {1, 0}
        };
        
        int ans = countNegatives(arr);
        System.out.println(ans);
        
    }
}
