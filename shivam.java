public class shivam {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
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

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void PrintInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            PrintInRange(root.right, k1, k2);
        } else {
            PrintInRange(root.left, k1, k2);
        }
    }
public static boolean IsValidBST(Node root,Node min,Node max){
    if(root==null){
        return true;
    }
    if(min!=null &&root.data<=min.data){
         return false;}
        else if (max!=null && root.data>=max.data){
            return false;
        }
    return IsValidBST(root.left,min,root)&&IsValidBST(root.right,root,max);}
    public static void main(String[] args) {
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        Inorder(root);
        System.out.println();
        if(IsValidBST(root,null,null)){
            System.out.println("Valid BST");
        }else{
            System.out.println("Not a Valid BST");
        }}}