import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Sum_of_min_of_subarrays_907 {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        int[] arr = {3,1,2,4};
        int n = arr.length;
        int[] gl = new int[n];
        final int MOD = 1_000_000_007;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.size() > 0){
                gl[i] = st.peek();
            }
            else{
                gl[i] = -1;
            }
            st.push(i);
            
        }

        int[] gr = new int[n];
        st = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) gr[i] = st.peek();
            else gr[i] = n;
            st.push(i);
        }

        long max_sum = 0;
        for(int i = 0; i < n; i++){
            int start = i - gl[i];
            int end = gr[i] - i;
            max_sum = (max_sum + (long) start * end * arr[i]) % MOD;
        }
        System.out.println((int)max_sum);
        
        scan.close();
    }
}