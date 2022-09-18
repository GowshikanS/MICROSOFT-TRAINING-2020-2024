class Solution {

public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int i = 0, j = 0, k = 0, m = nums1.length, n = nums2.length;
    
    int t1 = (m+n)/2-1;
    
    int ele1 = 0;
    
    int t2 = t1+1;
    
    int ele2 = 0;
    
    while (i != m && j != n) {
        if (nums1[i] < nums2[j]) {
           
            
            if(k == t1){
                
                ele1 = nums1[i];
            
            }
            
            if(k == t2){
            
                ele2 = nums1[i];
                
                i++;
                k++;
                
                break;
            
            }
            
            i++;
            k++;
        }else {
            
            
            if(k == t1){
                
                ele1 = nums2[j];
            
            }
            
            if(k == t2){
            
                ele2 = nums2[j];
                
                i++;
                k++;
                
                break;
            
            }
            
            j++;
            k++;
        }
        
        
    }
    while (i != m) {

        
        if(k == t1){
                
                ele1 = nums1[i];
            
            }
            
        if(k == t2){

            ele2 = nums1[i];

            i++;
            k++;
            
            break;

        }
        
        i++;
        k++;
    }
    
    while (j != n) {
        
        if(k == t1){
                
                ele1 = nums2[j];
            
            }
            
        if(k == t2){

            ele2 = nums2[j];
            
            i++;
            k++;

            break;

        }
        
        j++;
        k++;
    }
    
    System.out.println(ele1+" "+ele2);
    
    if ((m+n)%2 != 0) {
        
        return ele2;
    }
    else {
        
        return ((double)ele1+(double)ele2)/2;
       
        }
}
}
