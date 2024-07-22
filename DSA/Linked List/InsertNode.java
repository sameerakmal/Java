class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class InsertNode {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }


    private static void printLL(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            
        }
        System.out.println();
    } 

    private static Node insertHead(Node head, int el){
        // Node temp = new Node(el, head);
        // return temp;
        return new Node(el, head); 
    }

    private static Node insertTail(Node head, int el){
        if(head == null){
            return new Node(el);
        }
        Node temp = head;
        Node newvar = new Node(el);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newvar;
        return head;
    }

    private static Node insertK(Node head, int el, int k){
        if(head == null){
            if(k == 1) return new Node(el);
            else return null;
        }
        if (k == 1) {
            return new Node(el,head);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if(cnt == k-1){
                Node x = new Node(el);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    
    private static Node insertBeforeVal(Node head, int el, int val){
        if(head == null){
            return null;
        }
        if (head.data == val) {
            return new Node(el,head);
        }
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.data == val){
                Node x = new Node(el);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
        public static void main(String[] args) {
        int[] arr = {9,8,7,6};
        // int el = 4;
        // int k = 1;
        Node head = convertArr2LL(arr);
        head = insertBeforeVal(head, 66, 6);

        printLL(head);
        
    }
}
