package src.sample;

import java.util.*;

public class LeetCode {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
       // int s = removeDuplicates(nums);
      //  System.out.println(s);

        int[] max = {7,1,5,3,6,4};
        int mx = maxProfit(max);
        //.out.println(mx);

       // rotate(max, 2);
       // singleNumber(nums);

        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
      //  int[] nums3 = intersect(nums1,nums2);

        plusOne(nums1);
    }

    public static int removeDuplicates(int[] nums) {
        int l = nums.length;
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!al.contains(nums[i])) {
                al.add(Integer.valueOf(nums[i]));
            }
        }
        for (int i = 0; i < l; i++) {
            if (al.size() > i) {
                nums[i] = al.get(i);
                System.out.println(nums[i]);
            } else {
                nums[i] = '_';
            }
        }
        System.out.println(nums);
        return al.size();

    }

    public static int maxProfit(int[] prices) {
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            int k = 0;
            for (int s = i + 1; s < prices.length; s++) {
                if (prices[i] - prices[s] > 0) {
                    if (k < prices[i] - prices[s]) {
                        k = prices[i] - prices[s];
                    }
                }
            }
            al.add(k);
        }
        return Collections.max(al);
    }

    public static void rotate(int[] nums, int k) {
        int[] rev = new int[nums.length];
        int l = nums.length-k;
        for(int s=0; s<nums.length;s++) {
            if ((nums.length - k + s) < nums.length) {
                rev[s] = nums[l + s];
            } else {
                if (s - l <= k) {
                    rev[s] = nums[s - l];
                }
            }
            System.out.println(rev[s]);
        }
    }

    public static Optional singleNumber(int[] nums) {
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i: nums){
            if(hs.containsKey(i)){
                hs.put(i,hs.get(i)+1);
            }else{
                hs.put(i,1);
            }
        }
        //return hs.stream().filter(x -> (hs.get(x) == 1)).collect(Collectors.toList());
        int k = 0;
        // for(Map.Entry<Integer,Integer> i: hs.entrySet()){
        //     if(i.getValue()==1){
        //         k = i.getKey();
        //         break;
        //     }
        // }
        Optional o = hs.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).findFirst();
        if(o.isPresent());
        System.out.println(o.get());
        return o;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int index=0;
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){

            if(index == 0){
                for(int k=0;k<nums2.length;k++){
                    if(nums1[i]==nums2[k]){
                        index = k;
                        al.add(nums1[i]);
                        break;
                    }
                }
            }else if(index+1<nums2.length){
                for(int k=index+1;k<nums2.length;k++){
                    if(nums1[i]==nums2[k]){
                        index = k;
                        al.add(nums1[i]);
                        break;
                    }else{
                        index = 0;
                        //al.removeAll(al);
                    }
                }
            }

        }
        int[] aryNum = new int[al.size()];
        for (int i = 0; i < al.size(); i++){
            aryNum[i] = al.get(i);
            System.out.println(al.get(i));
        }
        return aryNum;
    }

    public static int[] plusOne(int[] digits) {
        int sum = 0;
        int factor = 1;
        for(int i =0;i< digits.length;i++){
            factor = 10*(digits.length-i);
            sum = factor*digits[i];
        }
        sum = sum+1;
        String s = new String(String.valueOf(sum));

        char[] chr = s.toCharArray();
        int[] finalary = new int[chr.length];
        for(int i=0;i<chr.length;i++){
            finalary[i]=(int)chr[i];
        }
        return finalary;

    }



}
