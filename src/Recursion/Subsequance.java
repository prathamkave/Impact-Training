package Recursion;

import java.util.*;

public class Subsequance {
    public static void main(String[] args) {
        String str = "abc";
        subsequance(str,"");
    }

    public static void subsequance(String str,String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subsequance(str.substring(1),ans);
        subsequance(str.substring(1),ans+ch);
        return;
    }
}
