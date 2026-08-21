class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(candidates);
        
        backtrack(res,tempList,candidates,target,0);

        return res;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int t, int index) {
        if(t == 0) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        if(index == cand.length){
            return;
        }
        for (int i = index; i < cand.length; i++) {
            if(i > index && cand[i] == cand[i-1]) continue; // skip duplicates
            if(cand[i] > t){
                break;
            }
            tempList.add(cand[i]);
            backtrack(list, tempList, cand, t - cand[i], i+1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
