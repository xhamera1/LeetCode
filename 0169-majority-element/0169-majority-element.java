class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numberCount = new HashMap<>();

        int half = nums.length/2;
        
        for (int i=0; i<nums.length; i++) {
            int currentNumber = nums[i];
            if (numberCount.get(currentNumber) == null) {
                numberCount.put(currentNumber, 1);
            }
            else {
                numberCount.put(currentNumber, numberCount.get(currentNumber)+1);
            }

            if (numberCount.get(currentNumber) > half) {
                return currentNumber;
            }
        }
        return 1;
        
    }
}