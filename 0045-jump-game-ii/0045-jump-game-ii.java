class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int targetIndex = len-1;
        int minSteps = 0;

        if (len == 1) return 0;

        int furthest = 0;
        int currentEnd = 0;

        for (int i=0; i<len;i++) {
            furthest = Math.max(furthest, i+nums[i]);

            if (i == currentEnd) {
                minSteps++;
                currentEnd = furthest;
                if (currentEnd >= targetIndex) return minSteps;
            }
        }

        return minSteps;
        
    }
}