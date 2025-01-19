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
        if(k>nums.length){
            k=k%nums.length;
        }
        if(nums.length>1){
        int start=0,end=nums.length-1;
        reverseArray(nums,start,end);
        reverseArray(nums,start,k-1);
        reverseArray(nums,k,end);}

    System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.print("]");
    }
        
    
}