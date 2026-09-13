class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int result = nums[0];
        int max = nums[0];
        int min = nums[0];

        for(int i=1;i<nums.length;i++){
            int current = nums[i];
            int temp = max;

            max = Math.max(current,Math.max(temp*current,min*current));
            min = Math.min(current,Math.min(temp*current,min*current));

            result = Math.max(result,max);
        }

        return result;
    }
}
