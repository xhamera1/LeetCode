class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        List<String> strings = new ArrayList<>();
        int len = s.length();

        for (int i=0; i<numRows; i++) {
            strings.add("");
        }

        int direction = 1;
        int currentRow = 0;

        for (int i=0; i<len; i++) {
            String currStr = strings.get(currentRow);
            currStr += s.charAt(i);
            strings.set(currentRow, currStr);
            currentRow += direction;
            if (currentRow == 0 || currentRow == numRows-1) {
                direction *= -1;
            }


        }

        StringBuilder sb = new StringBuilder();

        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }
}