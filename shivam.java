public class shivam{
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data < key) {
            return search(root.right, key);
        }
        return true;
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        inorder(root);
        System.out.println();
        if (search(root, 5)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}