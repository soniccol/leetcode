package leetcode;

public class MaxDepthBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int maxDepth(TreeNode root) {
        if(root!=null){
        	return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
        }else{
        	return 0;
        }
    }
}
