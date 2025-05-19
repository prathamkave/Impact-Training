package Recursion;

public class Occurance {
    static int first = -1,last = -1;
    public static void main(String[] args) {
        findoccurance("abaacdaefaah",0,'a');
    }

    public static void findoccurance(String str,int idx,char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element && first == -1) first = idx;
        else last = idx;
        findoccurance(str,idx+1,element);
    }
}
