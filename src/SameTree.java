package leetcode;

public class SameTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class Solution {
	    public boolean isSameTree(TreeNode p, TreeNode q) {	        
	    	if(p==null&&q==null){
	    		return true;
	    	}else if(p==null||q==null){
	    		return false;
	    	}else{	    				    	
		    	return (p.val==q.val)&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
	    	}
	    }
	}
}
