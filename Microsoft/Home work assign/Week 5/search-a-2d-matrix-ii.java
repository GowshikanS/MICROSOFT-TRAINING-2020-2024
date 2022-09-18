class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
        int n = mat[0].length-1;
        int i=0;
        while(i<mat.length && n >=0 ){
            if(mat[i][n] == t) return true;
            if(mat[i][n] > t) n--;
            else i++;
        }
        return false;
    }
}
