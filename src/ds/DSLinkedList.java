package ds;

public class DSLinkedList {

    private Node head;

    public void add(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        }else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }

    public Node getHead() {
        return head;
    }

    public void reverseList(){
        head = reverseList(head, null);
    }

    public void print(){

        Node current = head;
        System.out.print("List items: ");
        while(current!=null){
            System.out.print(current.getData()+", ");
            current = current.next;
        }
    }


    public boolean listAreIdentical(Node l1, Node l2) {
        if(l1 ==null && l2==null){
            return true;
        }

        if(l1 ==null || l2==null){
            return false;
        }

        if(l1.getData()!= l2.getData()){
            return false;
        }

        return listAreIdentical(l1.getNext(), l2.getNext());


    }

    //call reverseList(head, null)
    private Node reverseList(Node head, Node prev) {
        if(head == null){
            return prev;
        }
        Node next = head.getNext();
        head.setNext(prev);

        return reverseList(next, head);



    }


    class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
