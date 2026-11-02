public class shivam {
static class Info {
    int min;
    int max;
    boolean isBST;
    int size;

    Info(int min, int max, boolean isBST, int size) {
        this.min = min;
        this.max = max;
        this.isBST = isBST;
        this.size = size;
    }
}

static class Node{
    int data;
    Node left;
    Node Right;
    public Node(int data){
        this.data=data;
        this.left=this.Right=null;
    }
}
public static int MaxBST=0;
public static Info LargestBST(Node root){
    if(root==null){
        return new Info(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0);

    }
    Info leftInfo=LargestBST(root.left);
    Info rightInfo=LargestBST(root.Right);
    int size=leftInfo.size+rightInfo.size+1;
    int intmin = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
    int intmax = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
    if (!leftInfo.isBST || !rightInfo.isBST || root.data <= leftInfo.max || root.data >= rightInfo.min) {
        return new Info(intmin, intmax, false, size);
    }
    MaxBST = Math.max(MaxBST, size);
    return new Info(intmin,intmax,true,size);
}
}