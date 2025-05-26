package LinkedList;
import java.util.*;

public class Implementation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list);
    }
}


