class Solution {
    public int reverse(int x) {
        int number = Math.abs(x);
        int result = 0;

        List<Integer> nums = new ArrayList<>();
        while (number > 0) {
            int rest = number%10;
            if ( result > Integer.MAX_VALUE/10) {
                return 0;
            }
            result = result*10 + rest;
            number /= 10;
        }
        
        if (x<0) {
            result *= -1;
        }
        return result;
    }
}