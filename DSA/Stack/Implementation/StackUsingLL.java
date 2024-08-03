class Node{
    int val;
    Node next;

    Node(int val1){
        this.val = val1;
    }
}
class Stack{
    Node head = null;
    int size = 0;


    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop(){
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = head.val;
        head = head.next;
        size--;
        return top;
    }

    int peek(){
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
    }

    boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }

    int size(){
        return size;
    }

    void display(){
        displayRec(head);
    }
    void displayRec(Node h){
        if(h == null) return;

        displayRec(h.next);
        System.out.println(h.val);
    }
}


public class StackUsingLL {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);      
        st.push(30);      
        st.push(40);      
        System.out.println(st.peek());
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        

    }
    
 
}
