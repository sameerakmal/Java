import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_II_1209 {

    public static String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek().charac == c){
                st.peek().cnt++;
                if(st.peek().cnt == k){
                    st.pop();
                }
            }
            else{
                st.push(new Pair(c, 1));
            }
        }

        StringBuilder ans = new StringBuilder();
        for(Pair p : st){
            ans.append(String.valueOf(p.charac).repeat(p.cnt));
        }
        return ans.toString();
    }
    private static class Pair{
        char charac;
        int cnt;
        
        Pair(char charac, int cnt){
            this.charac = charac;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        System.out.println(removeDuplicates("abcd", 2));    
        System.out.println(removeDuplicates("edee", 3)); 
        System.out.println(removeDuplicates("pbbcggttciiippooaais", 2)); 
        
        scan.close();
    }
}