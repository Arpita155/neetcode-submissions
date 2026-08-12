class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate width between pointers
            int width = right - left;
            
            // Find the limiting height
            int currentHeight = Math.min(height[left], height[right]);
            
            // Calculate current area
            int currentArea = width * currentHeight;
            
            // Update max area found so far
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
