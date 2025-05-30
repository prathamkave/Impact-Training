package LinkedList;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        Collections.reverse(list);
        System.out.println(list);
    }
}
//    public void reverseList() {
//        if(head == null || head.next == null) {
//            return;
//        }
//        Node prevNode = head;
//        Node currNode = head.next;
//        while(currNode != null) {
//            Node nextNode = currNode.next;
//            currNode.next = prevNode;
//            prevNode = currNode;
//            currNode = nextNode;
//        }
//        head.next = null;
//        head = prevNode;
//    }
//
//    public Node reverseListRecursive(Node head) {
//        if(head == null || head.next == null) return head;
//
//
//        Node newHead = reverseListRecursive(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
