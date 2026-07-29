class KthLargest {

    int k;
    List<Integer> res;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
        }
    }
    
    public int add(int val) {
        res.add(val);
        Collections.sort(res);
        return res.get(res.size()-k);
    }
}
