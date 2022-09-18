class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length,j=0,z=-1; 
        int[] temp=new int[len]; 
        for(int i=target;i<len;i++){
            temp[j]=nums[i]; 
            j++; 
        } 
        for(int i=0;i<target;i++){
            temp[j]=nums[i]; 
            j++;
        } 
        for(int i=0;i<len;i++){
            if(temp[i]==target){
                return i;
            } 
        }  
        return z;
    } 
    
}
