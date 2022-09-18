class Solution {
    public int searchInsert(int[] nums, int target) {
       
        int rangeStart = 0;
        int rangeEnd = nums.length;
        int pntr = (int)(nums.length)/2;
        boolean found = false;
        
        while(!found){
            if(nums[pntr] == target){
                return pntr;
            }
            if(nums[pntr] > target){
               
                if (pntr == 0 || nums[pntr-1] < target){
                    return pntr;
                }
                
                rangeEnd = pntr;
                pntr = (rangeStart + rangeEnd) / 2;
            } else {
               
                if (pntr == nums.length - 1 || nums[pntr + 1] > target){
                    return pntr + 1;
                }
                
                rangeStart = pntr;
                pntr = (rangeStart + rangeEnd) / 2;
            }
        }
        
        return -1;
    }
}
