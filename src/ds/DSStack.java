package ds;

public class DSStack {

    private Node top;
    public void push(int data){
        Node node = new Node(data);
        if(top ==null){
            top = node;
            return;
        }

        node.setNext(top);
        top = node;
    }

    public Node pop(){
        if(top==null){
            System.out.println("Empty Stack");
            return null;
        }
        Node temp = top;
        top = top.getNext();
        System.out.println(temp.getData()+ " popped...");
        return temp;
    }

    public Node peak(){
        return top;
    }

    public void printStack(){
        System.out.println("printing stack->");
        if(top==null){
            System.out.println("empty stack");
            return;
        }
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }


    private class Node{

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

