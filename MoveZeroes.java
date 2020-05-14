/**
283. Move Zeroes
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
**/

class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i =0;
        while(i< len){
            int j = i;
            if( nums[i] == 0){
                while(j < len -1){
                    nums[j] = nums[j+1];
                    j++;
                }
                nums[j] = 0;
                len--;
                i--;
            }
            i++;
        }
    }
}