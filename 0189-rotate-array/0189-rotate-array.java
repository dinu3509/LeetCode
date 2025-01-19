class Solution {
        public static void reverseArray(int[] arr,int start,int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
         int n = nums.length;       
        k = k % nums.length;    
        int start=0,end=n-1;
        reverseArray(nums,start,end);
        reverseArray(nums,start,k-1);
        reverseArray(nums,k,end);
        
    
}}