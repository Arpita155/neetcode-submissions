class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list =new ArrayList<>();
        sub(nums,res,list,0);

        return res;
    }

    public void sub(int[] arr, List<List<Integer>> res, List<Integer> currentSubset, int counter) {
        if (counter == arr.length) {
            res.add(new ArrayList<>(currentSubset));
            return;
        }

        sub(arr,res, currentSubset, counter + 1);
        currentSubset.add(arr[counter]);

        sub(arr,res, currentSubset, counter + 1);

        currentSubset.remove(currentSubset.size() - 1);
    }
}
