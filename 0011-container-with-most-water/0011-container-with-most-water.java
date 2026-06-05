class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;
        int maxWidth = 0;

        while(left < right){

            int width = right - left;

            int minHeight = Math.min(height[left], height[right]);

            int currentWidth = minHeight * width;

            maxWidth = Math.max(maxWidth, currentWidth);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }

        return maxWidth;

    }
}