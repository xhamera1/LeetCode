class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int targetIndex = nums.length-1;
        int maxReach = 0;

        for (int i=0; i<len; i++) {
            if (maxReach < i) return false;

            maxReach = Math.max(maxReach, i+nums[i]);

            if (maxReach >= targetIndex) return true;
        }

        return false;        
    }
}