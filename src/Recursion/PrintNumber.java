package Recursion;

public class PrintNumber {
    public static void main(String[] args) {
        int n = 10;
        Decreasing(n);
        n = 1;
        Increasing(n);

    }

    public static void Decreasing(int n) {
        if (n == 1) {
            return;
        }
        System.out.println(n);
        Decreasing(n-1);
    }

    public static void Increasing(int n) {
        if (n == 11) {
            return;
        }
        System.out.println(n);
        Decreasing(n+1);
    }


}
