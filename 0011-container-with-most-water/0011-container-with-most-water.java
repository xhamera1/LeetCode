class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = -1;

        int leftInd = 0;
        int rightInd = n-1;

        while ((leftInd < rightInd && rightInd>0) && leftInd<n-1) {
            int w = rightInd - leftInd;
            int h = Math.min(height[leftInd], height[rightInd]);

            int area = w*h;
            if (area > maxArea) {
                maxArea = area;
            }

            if (height[leftInd] < height[rightInd]) {
                leftInd++;
            }
            else {
                rightInd--;
            }
        }

        return maxArea;
        
    }
}