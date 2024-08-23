class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer>nump = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(nump.containsKey(complement)){
                return new int[] {nump.get(complement),i};
            }
            nump.put(nums[i],i);
        }
        throw new IllegalArgumentException("no match found");
    }
}