class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        // sufixy
        answer[0] = 1;
        for (int i=1; i<len; i++) {
            answer[i] = answer[i-1]*nums[i-1];
        }

        int prefix = 1;
        for (int j=len-1; j>=0; j--) {
            answer[j] *= prefix;
            prefix  = prefix * nums[j];
        }


        return answer;


    }
}