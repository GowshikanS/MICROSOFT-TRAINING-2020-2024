class Solution {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] finalArr=new int[nums1.length+nums2.length];
		int x=0;
		int i=0;
		int j=0;
		while(x<finalArr.length) {
			if(j==nums2.length && i!=nums1.length) {
				finalArr[x]=nums1[i];
				i++;
				x++;
			}else if(i==nums1.length && j!=nums2.length) {
				finalArr[x]=nums2[j];
				j++;
				x++;
			}else if(nums1[i]<nums2[j]) {
				finalArr[x]=nums1[i];
				i++;
				x++;
			}else if(nums2[j]<nums1[i]) {
				finalArr[x]=nums2[j];
				j++;
				x++;
			}else {
				finalArr[x]=nums2[j];
				j++;
				x++;
				finalArr[x]=nums1[i];
				i++;
				x++;
			}
		}
		if(finalArr.length%2==0) {
			
			return (Double.valueOf(finalArr[finalArr.length/2])+Double.valueOf(finalArr[(finalArr.length/2)-1]))/Double.valueOf(2);
		}else {
			return Double.valueOf(finalArr[finalArr.length/2]);
		}
	}
}
