/**
58. Length of Last Word
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty() || s ==null){
            return 0;
        }
        int len = 0;
        s = s.trim();
        for(int i = s.length() -1; i>=0; i--) {
        	if(s.charAt(i) ==' ') {
            	break;
            }
        	len++;
        }
        return len;
    }
}