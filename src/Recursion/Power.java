package Recursion;

public class Power {
    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.print(Power(a,b));
    }

    public static int Power(int a,int b) {
        if (b == 0) return 1;

        int fn = Power(a,b-1);
        return a * fn;
    }
}
