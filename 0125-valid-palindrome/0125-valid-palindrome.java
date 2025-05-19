class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;


        // s = s.toLowerCase();
        // s = s.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(s);

        // int j = s.length()-1;
        
        // // for (int i=0; i<s.length()/2; i++) {
        // //     Character char1 = s.charAt(i);
        // //     Character char2 = s.charAt(j);
        // //     if (!char1.equals(char2)) return false;
        // //     j--;
        // // }

        // String reversed = new StringBuilder(s).reverse().toString();
        // if (!reversed.equals(s)) return false;


        // return true;
        
    }
}