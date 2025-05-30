package Stacks;

public class Implement {
    public static void main(String[] args) {
        StackAL.Stack stack = new StackAL.Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}

