class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;

        for(int i=1;i<n-1;i++){
            if((nums[i] >= nums[i-1] && nums[i] <= nums[i+1]) || (nums[i] <= nums[i-1] && nums[i] >= nums[i+1])){
                continue;
            }else{
                return false;
            }
        }

        if((nums[0] < nums[1] && nums[n-1]<nums[n-2]) || (nums[0] > nums[1] && nums[n-1]>nums[n-2])){
            return false;
        }

        return true;
    }
}