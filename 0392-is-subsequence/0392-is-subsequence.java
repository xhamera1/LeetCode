class Solution {
    public boolean isSubsequence(String s, String t) {

        int indStart=0;
        for (int i=0; i<s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (indStart == t.length()) {
                return false;
            }

            boolean found = false;
            for (int j=indStart; j<t.length(); j++) {
                if (t.charAt(j) == currentChar) {
                    indStart = j+1;
                    found = true;
                    break;
                }
            } 
            if (!found) return false;
        }
        return true;
        
    }
}