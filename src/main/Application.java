package main;

import sorting.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        int[] res = new QuickSort().sort(new int[]{ 9,4,1,7,2,6});
        System.out.println(Arrays.toString(res));
//        System.out.println(new Solution().nextGreaterElement(
//                new int[]{2,4},new int[]{1,2,3,4}));
    }

   private static  int getInt(){
        return 5;
    }

}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack();
        HashMap<Integer, Integer> map = new HashMap();
        int[] temp = new int[nums1.length];
        for(int i =0; i<nums2.length; i++){
            if(stack.isEmpty()){
                stack.push(i);
            }else{
                int top = stack.peek();
                if(nums2[top]>nums2[i]){
                    stack.push(i);
                }else{
                    while(nums2[top]<nums2[i] && !stack.isEmpty()){
                        int topElement  = stack.pop();
                        map.put(nums2[topElement], nums2[i]);
                    }
                }
            }
        }

        for(int j =0;j<nums1.length; j++){
            int value = nums1[j];
            temp[j] = map.get(value)==null ? -1 : map.get(value);
        }

        return temp;
    }
}







