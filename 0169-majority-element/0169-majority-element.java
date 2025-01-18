class Solution {
    public int majorityElement(int[] nums) {
        int count=0,canditate=nums[0];
        for(int num : nums){
            if(count==0){
                count=1;
                canditate = num;
            }else if(canditate == num){
                count++;
            }else{count--;}
        }return canditate;
    }
}