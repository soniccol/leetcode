/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        java.util.Stack<TreeNode> st = new java.util.Stack<TreeNode>();
        List<Integer> result = new java.util.ArrayList<Integer>();
        if(root==null) return result;
        st.push(root);
        while(st.empty()==false){
            TreeNode node = st.peek();
            result.add(node.val);
            st.pop();
            
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
            
        }
        return result;
    }
}
