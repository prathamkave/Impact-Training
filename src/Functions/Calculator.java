package Functions;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (ch) {
            case '+':{
                System.out.println(a+b);
                break;
            }
            case '-':{
                System.out.println(a-b);
                break;
            }
            case '*':{
                System.out.println(a*b);
                break;
            }
            case '/':{
                System.out.println(a/b);
                break;
            }
            case '%':{
                System.out.println(a%b);
                break;
            }
            default:{
                System.out.println("Invalid Input!");
                break;
            }
        }
    }
}
