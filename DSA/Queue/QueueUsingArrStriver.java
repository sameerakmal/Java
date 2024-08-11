class Queue{
    private int[] arr;
    private int start, end, currsize, maxsize;
    public Queue(){
        arr = new int[16];
        start = -1;
        end = -1;
        currsize = 0;
    }

    public Queue(int maxsize){
        this.maxsize = maxsize;
        arr = new int[maxsize];
        start = -1;
        end = -1;
        currsize = 0;
    }

    public void push(int newElement){
        if(currsize == maxsize){
            System.out.println("Queue is full");
            System.exit(1);
        }
        if(end == -1){
            start = 0;
            end = 0;
        }
        else{
            end = (end + 1) % newElement;
        }
        arr[end] = newElement;
        System.out.println("The element pushed is " + newElement);
        currsize++;
    }

    public int pop(){
        if(start == -1){
            System.out.println("Queue Empty");
            System.exit(1);
        }
        int popped = arr[start];
        if(currsize == 1){
            start = -1;
            end = -1;
        }
        else{
            start = (start + 1) % maxsize;
        }
        currsize--;
        return popped;
    }

}
public class QueueUsingArrStriver {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.push(5);
        q.push(9);
        q.push(8);
        q.push(6);
        q.push(4);
        q.push(2);
        System.out.println(q.pop());
        q.push(1);



    }
}
