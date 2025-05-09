package Arrays;

import java.util.Scanner;

public class TraversalOfArray {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = nums.length;
        int col = nums[0].length;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(nums[i][j]+" ");
            }
        }
    }
}
