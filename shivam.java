
import java.util.ArrayList;

public class shivam {
static class Node{
    int data;
    Node left;
    Node Right;
    public Node(int data){
        this.data=data;
        this.left=this.Right=null;
    }
}
public static void preorder(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+"");
    preorder(root.left);
    preorder(root.Right);
}

public static void GetInorder(Node root,ArrayList<Integer>inorder){
    if(root==null){
        return;
    }
    GetInorder(root.left,inorder);
    inorder.add(root.data);
    GetInorder(root.Right,inorder);
}
public static Node CreateBST(ArrayList<Integer>inorder,int st,int end){
    if(st>end){
        return null;

    }
    int mid =(st+end)/2;
    Node root=new Node(inorder.get(mid));
    root.left=CreateBST(inorder,st,mid-1);
    root.Right=CreateBST(inorder,mid+1,end);
    return root;
}
public static Node BalancedBST(Node root){
    ArrayList<Integer>inorder=new ArrayList<>();
    GetInorder(root,inorder);
    return CreateBST(inorder,0,inorder.size()-1);
}

public static void main(String[] args){
    Node root=new Node(5);
    root.left=new Node(2);
    root.left.left=new Node(4);
    root.left.left=new Node(1);
    root.Right=new Node(6);
    root.Right.Right=new Node(7);
    root.Right.Right.Right=new Node(8);
    root=BalancedBST(root);
    preorder(root);
}
}