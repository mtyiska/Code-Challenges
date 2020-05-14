/**
15. 3Sum
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
**/

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> sum = new ArrayList<List<Integer>>();
		
		Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++) {
        	int left = i+ 1;
            int right = nums.length -1; 
        	while(left < right) {
                int sumVal = nums[i] + nums[left] + nums[right];
        		if(sumVal == 0) {
                    List<Integer> bag = new ArrayList<Integer>();
        			bag.add(nums[i]);
        			bag.add(nums[left]);
        			bag.add(nums[right]);
        			sum.add(bag);
                    
        			int leftVal = nums[left];
        			int rightVal = nums[right];
        			while(left < nums.length && 
                       leftVal == nums[left]){
                        left++;
                    }
        			while(right > left && 
                          nums[right] == rightVal){
                        right--;
                    }
        		}
        		else if(sumVal < 0) {
        			left++;
        		}else {
        			right--;
        		}
        	}
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                i++;
            }
        }
		
		return sum;
    }
}