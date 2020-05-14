/**
821. Shortest Distance to a Character
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.
**/

class ShortestToChar {
    public int[] shortestToChar(String S, char C) {
		if(S.isEmpty() || S == null) {
			return null;
		}
		
		int len  = S.length();
		int[] output = new int[len];
		int dis = Integer.MIN_VALUE/2;
		for(int i = 0; i< len; i++) {
			if(S.charAt(i) == C) {
				dis = i;
			}
			output[i] = i - dis;
		}
		dis = Integer.MAX_VALUE;
        for(int j = len-1; j>=0; j--) {
        	if(S.charAt(j) == C) {
        		dis = j;
        	}
        	output[j] = Math.min(output[j], dis - j);
        }
		return output;
    }
}