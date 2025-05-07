package Arrays;

import java.util.Scanner;

public class Initialize {
    public static void main(String[] args) {
        int[] nums = {5,3,9,6,15};
        int temp = nums[0];

        for (int num : nums) {
            if(temp<num){
                temp = num;
            }
        }
        System.out.println(temp);

    }
}
