class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        
        for (int num : nums) {
            intSet.add(num);
        }
        List<Integer> intList = new ArrayList<>(intSet);
        for (int i=0; i<intSet.size(); i++) {
            nums[i] = intList.get(i);
        }

        

        
        return intList.size();   
    }
}