class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;

        int[] temp = new int[len];

        for (int i=0; i<len; i++) {
            int toIncrement = (i+k)%len;
            temp[toIncrement] = nums[i];
        }

        for (int i=0; i<len; i++) {
            nums[i] = temp[i];
        }
        
    }
}