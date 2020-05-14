/**
16. 3Sum Closest
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

Example:

Given array nums = [-1, 2, 1, -4], and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/

class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int low = nums[0]+ nums[1] + nums[nums.length -1];
		for(int i = 0; i< nums.length; i++) {
			int left = i+1;
			int right = nums.length -1;
			
			while(left < right) {
				int sum = nums[i]+ nums[left] + nums[right];
				if(Math.abs(low - target) > Math.abs(sum - target)) {
					low = sum;
				}
				if(sum == target) {
					return sum;
				}else if(sum > target) {
					right --;
				}else {
					left++;
				}
			}
		}
		return low;
    }
}