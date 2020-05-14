/**
643. Maximum Average Subarray I
Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 

Note:

1 <= k <= n <= 30,000.
Elements of the given array will be in the range [-10,000, 10,000].

**/

class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length <= 0){
            return 0.0;
        }
    
        int arrIndex = 0;
        double sum = 0;
        double maxAverage = Integer.MIN_VALUE;
        for(int end =0; end < nums.length; end++){
            sum += nums[end];
            if(end >= k-1){
                maxAverage = Math.max(maxAverage, sum/k);
                sum -= nums[arrIndex];
                arrIndex++;
            }
        }
        return maxAverage;
    }
}