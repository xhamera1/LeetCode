class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        for (int i=0; i<len; i++) {
            int product = 1;
            for (int j=0; j<len; j++) {
                if (i == j) continue;
                if (nums[j] == 0) {
                    product = 0;
                    break;
                }
                product *= nums[j];
            }
            answer[i] = product;
        }

        return answer;


    }
}