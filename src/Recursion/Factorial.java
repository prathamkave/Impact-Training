package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.print(fact(5));
    }

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fn = fact(n - 1);
        return n * fn;
    }
}
