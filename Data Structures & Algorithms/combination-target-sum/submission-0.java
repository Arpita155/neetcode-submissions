class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        combination(0,target,al,result,nums);

        return result;
    }

    public void combination(int index, int target, List<Integer> p,List<List<Integer>> result, int[]a){
        // base case
        if(target==0){
            result.add(new ArrayList<>(p));
            return;
        }
        if(index==a.length){
            return;
        }
        if(a[index] <= target){
            p.add(a[index]);
            combination(index,target-a[index],p,result,a);
            p.remove(p.size()-1);
        }
        combination(index+1,target,p,result,a);
    }
}
