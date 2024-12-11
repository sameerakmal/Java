import java.util.*;

public class Next_Greater_Element_1_496 {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n2];
        int[] fans = new int[n1];
        Stack<Integer> st = new Stack<>();
        for (int i = n2-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                st.pop();
            }
            if (st.size() > 0) ans[i] = st.peek();
            else ans[i] = -1;
            st.push(nums2[i]);
        }
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(nums1[i] == nums2[j]){
                    fans[i] = ans[j]; 
                }
            }
        }
        return fans;
    }
}
