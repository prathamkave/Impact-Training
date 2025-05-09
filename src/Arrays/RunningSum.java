package Arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.print(Arrays.toString(runningSum(num)));
    }

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;

        for (int i =0;i<nums.length;i++){
            sum += nums[i];
            ans[i] = sum;
        }

        return ans;
    }
}
