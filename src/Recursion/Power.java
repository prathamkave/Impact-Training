package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.print(Power(3,5));
    }

    public static int Power(int a,int b) {
        if (b == 0) return 1;

        int fn = Power(a,b-1);
        return a * fn;
    }
}
