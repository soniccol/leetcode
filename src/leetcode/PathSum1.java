class PathSum1 {
    //Stack Version
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
           
            if(cur.left==null&&cur.right==null){
                if(cur.val==sum) return true;
            }
            
            if(cur.right!=null){
                cur.right.val+=cur.val;
                stack.push(cur.right);
            }
            
            if(cur.left!=null){
                cur.left.val+=cur.val;
                stack.push(cur.left);
            }
        }
        return false;
    }
    //Recursive Version
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        
        if(root.left==null&&root.right==null){
            return root.val==sum;
        }
        
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
        
    }
    
}
