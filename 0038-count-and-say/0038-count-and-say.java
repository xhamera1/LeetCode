// iterative

class Solution {
    public String countAndSay(int n) {
        if (n==1) {
            return "1";
        }

        String str = "1";
        for (int j=1; j<n; j++) {
            StringBuilder sb = new StringBuilder();
            int len = str.length();
            for (int i=0; i<len;) {
                char currentChar = str.charAt(i);
                int countCurrent = 0;
                while (i < len && currentChar == str.charAt(i)) {
                    countCurrent++;
                    i++;
                }
                sb.append(countCurrent);
                sb.append(currentChar);
            }
            str = sb.toString();
        }
        return str;
    }
}