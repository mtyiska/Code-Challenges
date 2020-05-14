/**
300. Longest Increasing Subsequence
Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:

Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
Note:

There may be more than one LIS combination, it is only necessary for you to return the length.
Your algorithm should run in O(n2) complexity.
Follow up: Could you improve it to O(n log n) time complexity?

Accepted
**/


class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int[] len = new int [nums.length];
		len[0] = 1;
		int max = 0;
		for(int i =0; i < nums.length; i++) {
			len[i] = 1;
			for(int j = 0; j < i; j++) {
				if(nums[j] < nums[i] && len[i] < len[j]+1) {
					len[i] = Math.max(len[i],len[j]+1); 
				}
			}
			max = Math.max(max, len[i]);
		}
       return max; 
    }
}