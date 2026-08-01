class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums1){
            hs.add(i);
        }

        ArrayList<Integer> al = new ArrayList<>();

        for(int i : nums2){
            if(hs.contains(i) && !al.contains(i)){
                al.add(i);
            }
        }

        int[]res = new int[al.size()];
        for(int i=0;i<al.size();i++){
            res[i]=al.get(i);
        }

        return res;
    }
}