/**
3. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
**/

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int right =0, left =0, res =0;
        while(right < s.length()){
            char a = s.charAt(right);
            if(set.contains(s.charAt(right))){
                char b = s.charAt(left++);
                set.remove(b);
            }else{
                a = s.charAt(right++);
                set.add(a);
                int size = set.size();
                res = Math.max(res, size);
            }
        }
        return res;
    }
}