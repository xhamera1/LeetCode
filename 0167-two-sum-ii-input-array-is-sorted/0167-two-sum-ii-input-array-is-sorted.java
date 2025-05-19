class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new TreeMap<>();
        int len = numbers.length;
        int[] result = new int[2];

        for (int i = 0; i<len; i++) {
            int num = numbers[i];
            int remaining = target-num;
            if (map.containsKey(remaining)) {
                result[0] = map.get(remaining) + 1;
                result[1] = i + 1;
                return result;
            }
            map.put(num, i);
        }

        return result;
        
    }
}