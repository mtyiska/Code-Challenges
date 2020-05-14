/**
56. Merge Intervals
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
**/

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }
        
        Arrays.sort(intervals, (arr1, arr2)-> Integer.compare(arr1[0], arr2[0]));
        
        List<int[]> output = new ArrayList<>();
        int[] current = intervals[0];
        output.add(current);
        
        for(int [] interv : intervals){
            int current_begin = current[0];
            int current_end = current[1];
            int next_begin = interv[0];
            int next_end = interv[1];
            
            if(current_end >= next_begin){
                current[1] = Math.max(current_end, next_end);
            }else{
                current = interv;
                output.add(current);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}