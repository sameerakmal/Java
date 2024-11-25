import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner scan = null;
        
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            scan = new Scanner(System.in);
        }
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 10; i > 0; i--) {
            hs.add(i);
        }
        hs.remove(7);
        System.out.println(hs);
        scan.close();
    }
}