class Solution {
    public boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        StringBuilder sb = new StringBuilder(xString);
        String xStringReversed = sb.reverse().toString();

        if (xString.equals(xStringReversed)) {
            return true;
        }

        return false;
        
    }
}