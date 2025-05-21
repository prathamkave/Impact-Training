package Recursion;

public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) {
        String str = "23";
        printcomb(str,0,"");
    }

    public static void printcomb(String str,int idx,String comb) {
        if (idx == str.length()) {
            System.out.print(comb+" ");
            return;
        }
        char curr = str.charAt(idx);
        String map = keypad[curr-'0'];
        for (int i=0;i<map.length();i++){
            printcomb(str,idx+1,comb+map.charAt(i));
        }
    }
}
