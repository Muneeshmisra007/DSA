package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args){
        Stack<String> stack = getStack();
        popUsingIterator(stack);

        Stack<String> stack2 = getStack();
        popWithWhile(stack2);

        Stack<String> stack3 = getStack();
        checkAllElements(stack3);
        //Stack extends vector class, so we can access elements  using index also
        System.out.println("Element at potion 2: "+stack3.get(2));

        //Top element can be checked using peek() on stack, it will not pop the element
        System.out.println("Element at Top: "+stack3.peek());



    }

    private static Stack<String> getStack(){
        Stack stack = new Stack<String>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        return stack;
    }

    private static void popUsingIterator(Stack<String> stack){
        System.out.println("popUsingIterator...");
       Iterator itr=  stack.iterator();
       while(itr.hasNext()){
           System.out.println(stack.pop());
       }
        StringBuilder str1
                = new StringBuilder("AAAABBBCCCC");

    }

    private static void popWithWhile(Stack<String> stack){
        System.out.println("popWithWhile...");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void checkAllElements(Stack<String> stack){
        System.out.println("using Array...");
        Object[] array = stack.toArray();
        //now we can check in array without pooping elements
        System.out.println(Arrays.toString(array));
        //second way we can print
        System.out.println("Simple printing...");
        System.out.println(stack);

    }

}

class DemoIn{

    public static void main(String[] args){
        Parent parent = new Parent("Ram");
        parent.setAge(70);
        parent.print();
        Parent child = new Child("muneesh", 30);
        child.print();
    }
}

class Parent{
    protected int age;

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    public Parent(String name) {
        this.name = name;
    }



    void print(){
        System.out.println(name+"<>"+age);
    }


}

class Child extends Parent{
    public Child(String name, int age) {
        super(name);
        super.age = age;
    }


    @Override
    void print() {
        super.print();
        
    }
}

