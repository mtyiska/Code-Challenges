/**
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 

Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
**/

class ReverseString {
    public void reverseString(char[] s) {
        int m = s.length / 2;
		int l = 0;
		int r = s.length-1;
		while(l < m) {
			char temp = s[l];
			s[l++] = s[r];
			s[r--] = temp;
		}
        
    }
}