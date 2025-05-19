class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        // s = s.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(s);

        int j = s.length()-1;

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);

            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(charRight)) {
                right--;
                continue;
            }
            if (charLeft != charRight) {
                return false;
            }
            left++;
            right--;
        }

        // String reversed = new StringBuilder(s).reverse().toString
        // if (!reversed.equals(s)) return false;


        return true;
        
    }
}