class Solution {
    public int firstMissingPositive(int[] nums) {

		Arrays.sort(nums);

		int i = 1;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] <= 0) {
				continue;
			}

			if (nums[j] < i) {
				// ignore
			} else if (nums[j] != i) {
				return i;
			} else {
				i++;
			}
		}
		return i;
	}
}
