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
        if (n <= 1 || k % n == 0) return; 
        
        k = k % n;
        if(n>1){
        int start=0,end=n-1;
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