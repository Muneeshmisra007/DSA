package ds;

public class DSQueue {
    Node front;
    Node rear;


    public void enqueue(int data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
            rear = node;
            return;
        }

        //adding at rear
        rear.setNext(node);
        rear = node;
    }

    public Node dequeue(){
        if(front==null){
            System.out.println(" empty Queue...");
            return null;
        }

        if(front.getNext()==null){
            Node temp = front;
            front = null;
            rear = null;
            System.out.println(" DeQueue... "+temp.getData());
            return temp;
        }

        Node temp = front;
        front = front.getNext();
        System.out.println(" DeQueue... "+temp.getData());
        return temp;
    }

    public void printQueue(){
        System.out.println("printing Queue->");
        if(front==null){
            System.out.println("empty Queue");
            return;
        }
        Node temp = front;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node front(){
        System.out.println(" Front... "+front.getData());
        return front;
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

}
