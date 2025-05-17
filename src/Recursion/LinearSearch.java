package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10,5,6,1,12,9};
        System.out.print(Search(nums,6,nums.length-1));
    }

    public static int Search(int[] nums,int n,int idx) {
        if (nums[idx] == n) return idx;
        if (idx == 0) return -1;

        return Search(nums,n,idx-1);
    }
}
