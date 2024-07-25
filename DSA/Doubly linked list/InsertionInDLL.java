class Node{
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1; 
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class InsertionInDLL {
    private static Node convertArr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void printDLL(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node insertBeforeHead(Node head, int val){
        Node newHead = new Node(val, head, null);
        head.back = newHead;
        return newHead;
    }

    private static Node insertBeforeTail(Node head, int val){
        if(head.next == null){
            return insertBeforeHead(head, val);
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newTail = new Node(val, tail, prev);
        prev.next = newTail;
        tail.back = newTail;
        return head;
    }

    private static Node insertBeforeK(Node head, int val, int k){
        if(k == 1){
            return insertBeforeHead(head, val);
        }
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(val, temp, prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    private static void insertBeforeNode(Node givennode, int val){
        Node prev = givennode.back;
        Node newNode = new Node(val, givennode, prev);
        prev.next = newNode;
        givennode.back = newNode;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArr2DLL(arr);
        insertBeforeNode(head.next.next, 10);
        printDLL(head);

    }
}
