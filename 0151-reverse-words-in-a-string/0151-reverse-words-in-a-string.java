class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split(" ");


        StringBuilder sb = new StringBuilder();
        int len = words.length;
        sb.append(words[len-1]);
        for (int i=len-2; i>=0; i--) {
            sb.append(" " + words[i]);
        } 
        
        return sb.toString();
    }
}