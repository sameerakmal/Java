class Stack{
    private int[] arr = new int[5];
    private int idx = 0;

    void push(int x){
        if(idx == arr.length){
            System.out.println("Stack is full");
            return;
        }
        arr[idx] = x;
        idx++;
    }

    int pop(){
        if(idx == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1] = 0;
        idx--;
        return top;
    }

    int peek(){
        if (idx == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[idx-1];
    }

    void display(){
        for (int i = 0; i < idx-1; i++) {
            System.out.println(arr[i]);
        }
    }
    int size(){
        return idx;
    }
}
public class StackUsingArrPrac {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());

        
    }
}
