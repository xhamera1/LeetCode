class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        int j = s.length()-1;
        
        for (int i=0; i<s.length()/2; i++) {
            Character char1 = s.charAt(i);
            Character char2 = s.charAt(j);
            if (!char1.equals(char2)) return false;
            j--;
        }


        return true;
        
    }
}