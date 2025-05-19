class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        s = s.replaceAll("IV","IIII");
        s = s.replaceAll("IX", "VIIII");
        s = s.replaceAll("XL", "XXXX");
        s = s.replaceAll("XC", "LXXXX");
        s = s.replaceAll("CD", "CCCC");
        s = s.replaceAll("CM", "DCCCC");

        for (int i=0; i<s.length(); i++) {
            Character ch = s.charAt(i);
            Integer val = map.get(ch);
            result += val;
        }

        return result;

    }
}