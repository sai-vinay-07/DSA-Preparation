class Solution {
    public int arrayPairSum(int[] nums) {
     Arrays.sort(nums);
     int m=0;
        for(int i=0;i<nums.length;i+=2){
            m+=nums[i];
        }return m;
    }
}