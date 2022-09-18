class Solution {
List list=new ArrayList<>();
public List inorderTraversal(TreeNode root) {
if(root==null)
return list;
inorderTraversal(root.left);
list.add(root.val);
inorderTraversal(root.right);
return list;
}
}
