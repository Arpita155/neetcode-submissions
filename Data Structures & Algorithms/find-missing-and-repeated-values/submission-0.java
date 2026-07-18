class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                sum += grid[i][j];
                hm.put(grid[i][j],hm.getOrDefault(grid[i][j],0)+1);
            }
        }

        int missing = 0;
        int doubleEle = 0;
        int n = grid.length*grid[0].length;
        for(int i=1;i<=n;i++){
            if(!hm.containsKey(i)){
                missing = i;
            }
        }
        doubleEle = (sum+missing) - (n*(n+1)/2);
        int[]arr = {doubleEle,missing};

        return arr;
    }
}