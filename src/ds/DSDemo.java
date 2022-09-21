package ds;

public class DSDemo {

    public static void main(String[] args){

        //demoQueue();
        //fib(8);
        demoList();
    }

    private static void demoList(){
        DSLinkedList list = new DSLinkedList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        list.print();
        System.out.println("");
        DSLinkedList list1 = new DSLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(1);
        list1.reverseList();
        System.out.println("reversed..");
        list1.print();
        System.out.println(list.listAreIdentical(list.getHead(), list1.getHead()));
    }

    private static void demoQueue(){
        DSQueue qu = new DSQueue();
        qu.enqueue(5);
        qu.enqueue(6);
        qu.enqueue(7);
        qu.enqueue(8);
         qu.front();

        qu.printQueue();
        qu.dequeue();
        qu.printQueue();
        qu.dequeue();
        qu.printQueue();
        qu.dequeue();
        qu.printQueue();
        qu.dequeue();
        qu.printQueue();
    }

    private static void demoStack(){
        DSStack stack = new DSStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.push(99);
        stack.printStack();
    }

    private static int fib(int n){
        if(n<2){
           System.out.println(n);
           return 2;
        }
        System.out.println(n);
        return  fib(n-1)+fib(n-2);

    }
}


