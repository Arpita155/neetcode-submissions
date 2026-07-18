class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                res = Math.max(res,c);
            }else{
                c=0;
            }
        }

        return res;
    }
}