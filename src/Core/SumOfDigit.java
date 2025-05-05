package Core;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;

        while (num > 0) {
            count = num % 10;
            num /= 10;
            sum += count;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}
