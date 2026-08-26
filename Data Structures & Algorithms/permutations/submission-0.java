class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> dabba = new ArrayList<>();
        boolean[]track = new boolean[nums.length];

        permutation(nums,dabba,res,track);

        return res;
    }

    public static void permutation(int[]arr, ArrayList<Integer> dabba, List<List<Integer>> res,boolean[]track){
        if(dabba.size() == arr.length){
            res.add(new ArrayList<>(dabba));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!track[i]){
                dabba.add(arr[i]);
                track[i]=true;
                permutation(arr,dabba,res,track);
                dabba.remove(dabba.size()-1);
                track[i]=false;
            }
        }
    }
}
