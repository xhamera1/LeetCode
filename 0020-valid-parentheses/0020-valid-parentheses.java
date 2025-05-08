class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackChar = new Stack<Character>();

        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put(']', '[');
        bracketMap.put('}', '{');

        for (int i=0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if (bracketMap.containsValue(c)) {
                stackChar.push(c);
            }
            else if (bracketMap.containsKey(c)) {
                if (stackChar.empty()) {
                    return false;
                }
                Character peek = stackChar.pop();
                Character expectedPeek = bracketMap.get(c);
                if (!peek.equals(expectedPeek)) {
                    return false;
                }

            }
        }

        if (!stackChar.empty()){
            return false;
        }
        return true;
        
    }
}