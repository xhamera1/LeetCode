class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        
        for (int i=0; i<nums.length; i++) {
            if (k==0 || k==1 || nums[k-2] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}



// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int k = 0;
//         Map<Integer, Integer> numsMap = new HashMap<>();

//         int currentLength = nums.length;
//         for (int i=0; i<currentLength; i++) {
//             int currentNumber = nums[i];
            
//             if (numsMap.get(currentNumber) == null) {
//                 numsMap.put(currentNumber, 1);
//                 k++;

//             }
//             else if (numsMap.get(currentNumber) == 1) {
//                 numsMap.put(currentNumber, 2);
//                 k++;
//             }
//             else if (numsMap.get(currentNumber) == 2) {
//                 if (i != nums.length-1) {
//                     int x = i;
//                     while (x!=nums.length-1) {
//                         nums[x] = nums[x+1];
//                         x++;
//                     }
//                 }
//                 currentLength--;
//                 i--;
//             }
//         }
//         return k;
        
//     }
// }