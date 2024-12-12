import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Sum_of_max_of_subarrays {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,3,2));
        int n = arr.size();
        int[] gl = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            
            while(!st.isEmpty() && arr.get(st.peek()) <= arr.get(i)){
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
            while (!st.isEmpty() && arr.get(st.peek()) <= arr.get(i)) {
                st.pop();
            }
            if (!st.isEmpty()) gr[i] = st.peek();
            else gr[i] = n;
            st.push(i);
        }

        long max_sum = 0;
        for(int i = 0; i < n; i++){
            int start = gl[i] - i;
            int end = i - gr[i];
            max_sum += (start * end) * arr.get(i);
        }
        System.out.println(max_sum);
        
        scan.close();
    }
}