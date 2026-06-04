class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int arr[] = new int[nums.length];   

        int r = nums.length - 1;

        int p = nums.length - 1;

        int l = 0;

        while( l <= r){

            int ls = nums[l] * nums[l];
            int rs = nums[r] * nums[r];

            if(ls > rs){
                arr[p] = ls;
                l++;
            }
            else{
                arr[p] = rs;
                r--;
            }

            p--;
        }
        
        return arr;
    }
}