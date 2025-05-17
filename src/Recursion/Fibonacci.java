package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print(Fib(6));
    }

    public static int Fib(int n) {
        if (n <= 1) return n;
        return Fib(n-1) + Fib(n - 2);
    }
}
