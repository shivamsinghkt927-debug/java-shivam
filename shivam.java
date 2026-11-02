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
public static Node CreateBST(int arr[],int st,int end){
    if(st>end){
        return null;

    }
    int mid =(st+end)/2;
    Node root=new Node(arr[mid]);
    root.left=CreateBST(arr,st,mid-1);
    root.Right=CreateBST(arr,mid+1,end);
    return root;
}
public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7};
    Node root=CreateBST(arr,0,arr.length-1);
    preorder(root);
}
}