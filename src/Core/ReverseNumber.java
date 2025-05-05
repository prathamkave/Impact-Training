package Core;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt() , rev , ans = 0;

        while (num > 0){
            rev = num % 10;
            num /= 10;
            ans = (ans*10)+rev;
        }
        System.out.println("Reverse of the Number is :" + ans);
    }
}