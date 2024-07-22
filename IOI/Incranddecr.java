public class Incranddecr {
        public static void main(String[] args) {
            int a = 5;
            int b = 3;
            int c = -1;
            int d = 0;
            int e = -5;
            int result = --c - a-- + ++e + --b - d-- + ++d - a++ + ++b + c++ - b-- + --a;
    
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);
            System.out.println("result = " + result);
        }
    }
    
