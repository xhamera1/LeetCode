class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numberToIndexMap = new HashMap<>();
        int[] resultArray = new int[2];

        for (int i=0; i<nums.length; i++) {
            int number = nums[i];
            int remaining = target - number;
            if (numberToIndexMap.containsKey(remaining)) {
                resultArray[0] = numberToIndexMap.get(remaining);
                resultArray[1] = i;
                return resultArray;
            }
            numberToIndexMap.put(number, i);
        }
        return resultArray;


    }
}






// O(n^2)
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] indices = new int[2];
        
//         for (int i=0; i<nums.length; i++) {
//             for (int j=0; j<nums.length; j++) {
//                 if (i==j) {
//                     continue;
//                 }
//                 if ((nums[i] + nums[j]) == target) {
//                     indices[0] = i;
//                     indices[1] = j;
//                     return indices;
//                 }
//             }
//         }
//         return null;
//     }
// }