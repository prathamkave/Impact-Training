package Core;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        int i = 0;
        while (num > 0) {
            num /= 10;
            i++;
        }
        System.out.println("Total Numbers are: "+ i);

    }
}
