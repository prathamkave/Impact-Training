package Queue;

public class Implementation {
    public static void main(String args[]) {
        QueueLL.Queue q = new QueueLL.Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
