class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String firstStr = strs[0];
        boolean run = true;
        
        for (int j=0; j<firstStr.length(); j++) {
            Character ch = firstStr.charAt(j);

            for (int i=1; i<strs.length; i++) {
                if (j >= strs[i].length() || strs[i].charAt(j) != ch ) {
                    run = false;
                    break;
                }
            }

            if (!run) {
                break;
            }
            sb.append(ch);
        }

        return sb.toString();
        
    }
}