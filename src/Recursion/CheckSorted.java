package Recursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5};
        System.out.print(isSorted(arr,0));
    }

    public static boolean isSorted(int[] arr,int idx) {
        if (idx == arr.length-1) return true;

        if (arr[idx] <= arr[idx+1]) return isSorted(arr,idx+1);
        else return false;
    }
}
