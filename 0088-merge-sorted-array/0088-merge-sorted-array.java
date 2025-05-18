class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        
        int[] resultArray = new int[m+n];

        int i = 0;
        while (index1<m && index2<n) {
            if (nums1[index1] < nums2[index2]) {
                resultArray[i] = nums1[index1];
                index1++;
            }
            else {
                resultArray[i] = nums2[index2];
                index2++;
            }
            i++;
        }
        

        if (index1 != m) {
            for (; index1<m; index1++) {
                resultArray[i] = nums1[index1];
                i++;
            } 
        }
        else if (index2 != n) {
            for (; index2<n; index2++) {
                resultArray[i] = nums2[index2];
                i++;
            } 
        }

        for (int j=0; j<resultArray.length; j++) {
            nums1[j] = resultArray[j];
        }


    }
}
