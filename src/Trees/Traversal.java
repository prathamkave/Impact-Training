package Trees;

public class Traversal {

    public static void preorder(Node root) {
        if(root == null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
