/**
125. Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
**/

class IsPalindrome {
	public boolean isPalindrome(String s) {
        s = s.trim();
		boolean isAnagram = true;
		char[] c = new char[s.length()];
		int index = 0;
		int l = 0;
		int r = 0;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i)) || 
					Character.isDigit(s.charAt(i))) {
				c[index++] = Character.toLowerCase(s.charAt(i)); 
			}
		}
		r = index -1;
		
		while (l <= r) {
			if(c[l++] != c[r--]) {
				isAnagram = false;
			}
		}
        return isAnagram;
    }
}