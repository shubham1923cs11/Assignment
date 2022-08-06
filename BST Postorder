import java.util.Stack;
 
public class BinaryTreePostOrder {
 
    public static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data=data;
        }
    }
 
    
    public void postOrder(TreeNode root) {
        if(root !=  null) {
            postOrder(root.left);
            postOrder(root.right);
              
            System.out.printf("%d ",root.data);
        }
    }
