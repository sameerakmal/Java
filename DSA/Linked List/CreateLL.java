class Node {
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

public class CreateLL {

    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]); // 
        Node mover = head; // Stores address of the head
        for(int i = 1; i < arr.length;i++){
            Node temp = new Node(arr[i]); 
            mover.next = temp; // At first step, the mover points(->) to temp.
            mover = mover.next; // Now, mover will move(>>) to temp.
            // mover = temp;
        }
        return head;
    } 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convertArr2LL(arr);
        // System.out.println(head.data);

        //Traveral in LL
        Node temp = head; 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    }

}
