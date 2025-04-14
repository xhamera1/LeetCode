class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer, Integer> indMap = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int rest = target - nums[i];
            if (indMap.containsKey(rest)) {
                indices[0] = indMap.get(rest);
                indices[1] = i;
                return indices;
            }
            indMap.put(nums[i], i);

        }
        return null;
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