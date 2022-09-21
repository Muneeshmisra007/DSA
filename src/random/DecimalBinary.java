package random;

public class DecimalBinary {

    public static void main(String[] args) {
       int binary = decimalToBinary(36);
        System.out.println(binary);
        int decimal = binaryToDecimal(binary);
        System.out.println(decimal);
    }

    public static int decimalToBinary(int n){

        int binary = 0;
        int i = 1;

        while(n>0){
            int remainder = n%2;

            binary = binary + i*remainder;
            n = n/2;
            i = i*10;
        }

        return binary;
    }

//111001= 1⋅2^5+1⋅2^4+1⋅2^3+0⋅2^2+0⋅2^1+1⋅2^0 = 57
    public static int binaryToDecimal(int n){

        int decimal = 0;
        int factor =1;

        while(n>0){
            int remainder = n%10;

            decimal = decimal + factor*remainder;
            n = n/10;
            factor = factor*2;
        }

        return decimal;
    }

}
