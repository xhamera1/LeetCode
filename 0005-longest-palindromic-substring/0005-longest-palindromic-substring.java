class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        
        String longestPalindrone = s.substring(0,1);


        for (int i = 0; i<n; i++) {
            int leftInd = i;
            int rightInd = i;
            
            while (leftInd >=0 && rightInd < n  && (s.charAt(leftInd) == s.charAt(rightInd))) {
                if (longestPalindrone.length() < rightInd-leftInd+1) {
                    longestPalindrone = s.substring(leftInd, rightInd+1);
                }
                leftInd--;
                rightInd++;
            }

            leftInd = i;
            rightInd = i+1;
            
            while (leftInd >=0 && rightInd < n  && (s.charAt(leftInd) == s.charAt(rightInd))) {
                if (longestPalindrone.length() < rightInd-leftInd+1) {
                    longestPalindrone = s.substring(leftInd, rightInd+1);
                }
                leftInd--;
                rightInd++;
            }

        }
        return longestPalindrone;

    }
}





// // brute-force:
// class Solution {
//     public String longestPalindrome(String s) {
//         int n = s.length();
//         String longestPalindrone = "";


//         for (int i=0; i<n; i++) {
//             for (int j=i+1; j<n+1; j++) {
//                 StringBuilder sb = new StringBuilder(s.substring(i,j));
//                 String substr = sb.toString();
//                 String reversed = sb.reverse().toString();
//                 if (substr.equals(reversed) && substr.length() > longestPalindrone.length()) {
//                     longestPalindrone = substr;
//                 }
//             }
//         }

//         return longestPalindrone;

//     }
// }