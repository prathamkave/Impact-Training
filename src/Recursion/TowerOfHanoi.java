package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerofhanoi(3,"S","H","D");
    }

    public static void towerofhanoi(int n,String src,String helper,String dest) {
        if (n == 1) {
            System.out.println("Transfer disk "+ n +" from "+ src +" to "+ dest);
            return;
        }
        towerofhanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+ n +" from "+ src +" to "+ dest);
        towerofhanoi(n-1,helper,src,dest);

    }
}
