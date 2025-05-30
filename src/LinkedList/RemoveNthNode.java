package LinkedList;

public class RemoveNthNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        RemoveNthNode remover = new RemoveNthNode();
        ListNode result = remover.removeNthFromEnd(head, n);

        System.out.print("Updated Linked List: ");
        printList(result);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) return head.next;

        int ptf = size - n;
        ListNode prev = head;
        int cp = 1;

        while (cp != ptf) {
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
