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
class DLL{

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

    private static Node deleteAtHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;

        head.back = null;
        prev.next = null;

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArr2DLL(arr);
        head = deleteAtHead(head);
        printDLL(head);
    }
}