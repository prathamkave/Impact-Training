package LinkedList;

public class Structure {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("list");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
    }
}
