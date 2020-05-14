/**
20. Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
**/
class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> map = new HashMap();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        s = s.trim();
        if(s == ""){
            return true;
        }
        if(s.length() == 1){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c =='(' || c =='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()) return false;
                Character c2 = stack.pop();
                if(!c2.equals(map.get(c))){
                   return false; 
                }
            }
        }
        return stack.isEmpty();
    }
}