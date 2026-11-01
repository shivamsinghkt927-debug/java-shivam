public class shivam {
    static class Node{
        int data;
        Node Right;
        Node Left;
        public Node(int data){ 
            this.data = data;
             this.Right=this.Left=null; }
    public static Node CreateMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror = CreateMirror(root.Left);
        Node rightMirror = CreateMirror(root.Right);
        root.Left = rightMirror;
        root.Right = leftMirror;
        return root;
    }
    public static void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.Left);
        PreOrder(root.Right);
    }
public static void main(String[] args) {
        Node root = new Node(1);
        root.Left = new Node(2);
        root.Right = new Node(3);
        root.Left.Left = new Node(4);
        root.Left.Right = new Node(5);
        root=CreateMirror(root);
        PreOrder(root);
}
}}