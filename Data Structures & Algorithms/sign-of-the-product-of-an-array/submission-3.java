class Solution {
    public int arraySign(int[] nums) {
        int ans = 1;
        int ne = 0;

        for(int i : nums){
            if(i == 0){
                return 0;
            }else if(i < 0){
                ne++;
            }
        }

        if(ne%2 != 0){
            return -1;
        }else{
            return 1;
        }
    }
}