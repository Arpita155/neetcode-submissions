class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        Deque<Integer> dq = new ArrayDeque<>();
        int n = gas.length;
        int currPetrol = 0;
        int i = 0;
        int count = 0;

        while(i < n){
            dq.add(i);
            currPetrol += (gas[i] - cost[i]);

            if(currPetrol < 0){
                count++;
            }
            if(count == n){
                return -1;
            }
            while(currPetrol < 0 && !dq.isEmpty()){
                int j = dq.removeFirst();
                currPetrol -= (gas[j]-cost[j]);
            }

            i = (i+1)%n;
            if(!dq.isEmpty() && dq.peekFirst()==i){
                return i;
            }
        }

        return -1;
    }
}
