package Patterns;

import java.util.Scanner;

public class Invert_Of_180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Column: ");
        int m = sc.nextInt();

        for (int i = n; i>=1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
