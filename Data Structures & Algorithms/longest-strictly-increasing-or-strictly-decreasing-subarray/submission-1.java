class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxd = 1;
        int maxi = 1;
        int ci = 1;
        int cd = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                ci++;
                maxi = Math.max(maxi,ci);
            }else{
                ci = 1;
            }
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                cd++;
                maxd = Math.max(maxd,cd);
            }else{
                cd = 1;
            }
        }

        if(maxi > maxd){
            return maxi;
        }

        return maxd;
    }
}