/**
242. Valid Anagram
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
**/

class IsAnagram {
    public boolean isAnagram(String s, String t) {
        char[] st = s.toCharArray();
        Arrays.sort(st);
        char[] ts = t.toCharArray();
        Arrays.sort(ts);
        
        return Arrays.equals(st, ts);
    }
}