package Patterns;

import java.util.Scanner;

public class Block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row: ");
        int n = sc.nextInt();
        System.out.print("Enter Column: ");
        int m = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
