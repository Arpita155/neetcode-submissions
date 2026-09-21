class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>(); 
        HashSet<Integer> hs2 = new HashSet<>(); 

        for(int i : nums1){
            hs1.add(i);
        }
        for(int i : nums2){
            hs2.add(i);
        }

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int i : hs1){
            if(!hs2.contains(i)){
                l1.add(i);
            }
        }

        res.add(l1);

        for(int i : hs2){
            if(!hs1.contains(i)){
                l2.add(i);
            }
        }
        res.add(l2);

        return res;
    }
}