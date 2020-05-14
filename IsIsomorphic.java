/**
205. Isomorphic Strings
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.
**/

class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        Map<Character, Character> inverseMap = new HashMap<Character, Character>();
        
        for(int i = 0; i< s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
    if((map.containsKey(sChar) && tChar != map.get(sChar)) || 
       (inverseMap.containsKey(tChar) && sChar != inverseMap.get(tChar))){ 
                return false;    
            }
            
            map.put(sChar, tChar);
            inverseMap.put(tChar, sChar);
        }
        return true;
    }
}