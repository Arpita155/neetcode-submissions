class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[]res = new int[nums.length];
        int p = 1;
        int flag = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                flag++;
            }else{
                p *= nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(flag == 0){
                res[i] = (int)p/nums[i];
            }else if(flag == 1){
                if(nums[i]==0){
                    res[i]=p;
                }else{
                    res[i]=0;
                }
            }else{
                res[i]=0;
            }
        } 

        return res;
    }
}  
