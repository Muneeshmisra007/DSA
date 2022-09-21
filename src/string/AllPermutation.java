package string;

public class AllPermutation {
    public static void main(String[] args) {
        String input = "abc";
        allPermutation(input, "",0);
    }

    private static void allPermutation(String input, String current, int index) {
        if(index>=input.length()){
            System.out.println(current);
            return;
        }

        allPermutation(input, current+input.charAt(index), index+1);
        allPermutation(input, current, index+1);

    }
}
