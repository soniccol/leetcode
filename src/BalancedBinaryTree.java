package leetcode;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean isBalanced(TreeNode root) {
    	if(root==null){
    		return true;
    	}
    	
    	if(root.left==null&&root.right==null){
    		return true;
    	}
    	
    	if(Math.abs(getDepth(root.left)-getDepth(root.right))>1){
    		return false;
    	}
    	
    	return isBalanced(root.left)&&isBalanced(root.right);
    }
    
    public int getDepth(TreeNode root){
    	if(root==null)
    		return 0;
    	
    	return 1+Math.max(getDepth(root.left), getDepth(root.right));  
    }
    
}
