class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        
        k = k % n;
        
        reverseArr(0, n-1, nums);
        
        reverseArr(0, k-1, nums);

        reverseArr(k, n-1, nums);

        System.out.print(nums);

    }

    public int[] reverseArr(int start, int end, int[] arr){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}