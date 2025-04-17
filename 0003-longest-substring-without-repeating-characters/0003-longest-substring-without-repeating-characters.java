class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestStreak = 0;
        int leftInd = 0;
        
        Set<Character> charSet = new HashSet<>();

        for (int i=0; i<s.length(); i++) {
            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
            }
            else {
                while (charSet.contains(s.charAt(i))) {
                    charSet.remove(s.charAt(leftInd));
                    leftInd++;
                }
                charSet.add(s.charAt(i));
            }
            longestStreak = Math.max(longestStreak, charSet.size());
        }

        return longestStreak;



    }
}