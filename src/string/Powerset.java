package string;

public class Powerset {
    public static void main(String[] args) {
        String input = "abc";
       printPowerset(input, "",0);
    }

    private static void printPowerset(String input, String current, int index) {
        if(index>=input.length()){
            System.out.println(current);
            return;
        }

         printPowerset(input, current+input.charAt(index), index+1);
         printPowerset(input, current, index+1);

    }
}
