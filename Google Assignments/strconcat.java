class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int N=2*n;
        int []arr=new int[N];
        int i=0; 
        while(i<n){
            arr[i]=nums[i]; 
            i++;
        } 
        for(int j=0;j<n;j++){
            arr[i]=nums[j]; 
            i++;
        } 
        return arr;
    }
}
