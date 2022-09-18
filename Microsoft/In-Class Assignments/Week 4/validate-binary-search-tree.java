class Solution {

	ArrayList<Integer> res = new ArrayList<>();
    public void inOrder(TreeNode root){   //In this method I'm actually storing the InOrder values of the tree .
		if(root!=null)
        { 
            inOrder(root.left);
            res.add(root.val);
            inOrder(root.right);
        }     
    }
	
    public boolean isValidBST(TreeNode root) {
	
        inOrder(root)
        for(int i=0;i<res.size()-1;i++)
        {
            if(res.get(i)>=res.get(i+1))     //we are checking if the arrayList is not sorted (which means it is not a binary tree)
                return false;                       // so we return false
        }
        return true;
    }
}
