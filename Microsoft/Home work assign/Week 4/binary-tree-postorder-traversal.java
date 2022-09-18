public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
        return res;
    }
	
    Stack<TreeNode> stack = new Stack<>();
    TreeNode h = root;
    stack.push(h);
    TreeNode c = null;
    
    while (!stack.isEmpty()) {
         c = stack.peek();
         if (c.left != null && h != c.left && h != c.right) {
             stack.push(c.left);
         } else if (c.right != null && h != c.right){
             stack.push(c.right);
         } else {
             res.add(stack.pop().val);
             h = c;   
         }
    }
    return res;
}
