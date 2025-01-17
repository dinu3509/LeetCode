class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0,i=0;
        while(i<nums.length){
            while(i<nums.length-1 && nums[i]==nums[i+1])i++;
            nums[j++] = nums[i++];
        }
        return j;
    }
}