class Solution {
    
    public void help(List<List<Integer>> ans,TreeNode root,int curr_level){
        
        if(root==null)return;
        
        if(ans.size()==curr_level)
        ans.add(new AArrayList());
        
        List<Integer> reqList=ans.get(curr_level);
        reqList.add(root.val);
            
        help(ans,root.left,curr_level+1);
        help(ans,root.right,curr_level+1);
        
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(root==null)return ans;
         help(ans,root,0);
        return ans;
        
    }
}


