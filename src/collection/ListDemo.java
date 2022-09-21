package collection;

import java.util.*;

public class ListDemo {

    public static void main(String[] args){
        List<String> list = getList();
//        printByIterator(list);
//        loopByIndex(list);
//        loopByIndex(list);
      //  int valu=new Solution().findMin(new int[]{4,5,6,7,0,1,2});
        //System.out.println(valu);
        System.out.println(Character.isAlphabetic('a'));
        System.out.println(licenseKeyFormatting1("5F3Z-2e-9-w", 4));



    }
    public static String licenseKeyFormatting1(String s, int k) {

        char[] in = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int count=sb.length();
        int group = 0;
        while(count>=0){
            char c = s.charAt(count);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                c = Character.toUpperCase(c);
                if(group==k){
                    sb.insert(0, (count==0 ? "" : "-")+Character.toString(c));
                    group=0;
                }else{
                    sb.insert(0, Character.toString(c));
                    group++;
                }
            }
            count--;


        }

        return sb.toString();

    }

    public String licenseKeyFormatting(String s, int k) {

        char[] in = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int count=sb.length();
        int group = 0;
        while(count>=0){
            char c = s.charAt(count);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                c = Character.toUpperCase(c);
                if(group==k){
                    sb.insert(0, (count==0 ? "" : "-")+Character.toString(c));
                    group=0;
                }else{
                    sb.insert(0, Character.toString(c));
                    group++;
                }
            }
            count--;


        }

        return sb.toString();

    }

    private static void printByIterator(List<String> list){
        System.out.println("printByIterator...");
        if(list.size()>0){
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

        }
    }

    private static void loopByIndex(List<String> list){
        System.out.println("loopByIndex...");
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    private static void loopByItems(List<String> list){
        System.out.println("loopByItems...");
        for(String item: list){
            System.out.println(item);
        }
    }



    private static List<String> getList(){
        List<String> data = new ArrayList();
        data.add("Apple");
        data.add("Banana");
        data.add("Cherry");
        return data;
    }
}

class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid < nums.length - 1 && nums[mid] < nums[mid + 1] && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            if (nums[mid] < nums[start]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return nums[0];

    }
}
