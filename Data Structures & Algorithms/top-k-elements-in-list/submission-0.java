class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i : nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
                al.add(i);
            }
            else{
                hm.put(i,hm.get(i)+1);
            }
        }

        Collections.sort(al, (a, b) -> {
            int freqA = hm.get(a);
            int freqB = hm.get(b);
            if (freqA != freqB) {
                return freqB - freqA; 
            } else {
                return b - a;         
            }
        });
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = al.get(i);
        }
        
        return result; 

    }
}
