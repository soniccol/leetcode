package leetcode;
/**
 *  * Definition for a binary tree node.
 *   * public class TreeNode {
 *    *     int val;
 *     *     TreeNode left;
 *      *     TreeNode right;
 *       *     TreeNode(int x) { val = x; }
 *        * }
 *         */
public class InvertBinaryTree {
public TreeNode invertTree(TreeNode root) {
     if(root==null) return root;
     if(root.right==null&&root.left==null) return root;

      TreeNode temp=null;
      temp=root.right;
      root.right=root.left;
      root.left=temp;

      if(root.right!=null) invertTree(root.right);
      if(root.left!=null) invertTree(root.left);

      return root;

}
}
