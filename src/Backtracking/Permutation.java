package Backtracking;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        printperm(str,"",0);
    }

    public static void printperm(String str,String perm,int idx) {
        if (str.length()==0) {
            System.out.print(perm+" ");
            return;
        }
        for (int i=0;i<str.length();i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            printperm(newstr,perm+curr,idx+1);
        }
    }
}
