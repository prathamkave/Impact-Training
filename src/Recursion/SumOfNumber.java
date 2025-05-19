package Recursion;

public class SumOfNumber {
    public static void main(String[] args) {
        printsum(0,10,0);
    }

    public static void printsum(int i,int n,int sum) {
        if (i == n+1) {
            System.out.println(sum);
            return;
        }

        sum += i;
        printsum(i+1,n,sum);
    }
}
