package Recursion;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        String str = "abbccda";
        removeduplicate(str,0,"");

    }

    public static void removeduplicate(String str,int idx,String newString) {
        if (idx == str.length()) {
            System.out.print(newString);
            return;
        }

        char curr = str.charAt(idx);
        if (map[curr-'a']) removeduplicate(str,idx+1,newString);
        else {
            newString += curr;
            map[curr-'a'] = true;
            removeduplicate(str,idx+1,newString);
        }
    }


}
