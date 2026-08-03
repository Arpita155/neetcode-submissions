class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int upper = 0;
        int lower = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;

        while(left <= right && upper <= lower){
            for(int i=left;i<=right;i++){
                res.add(matrix[upper][i]);
            }
            upper++;

            for(int i=upper;i<=lower;i++){
                res.add(matrix[i][right]);
            }
            right--;

            for(int i=right;i>=left && upper<=lower;i--){
                res.add(matrix[lower][i]);
            }
            lower--;

            for(int i=lower;i>=upper && left<=right;i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        
        return res;
    }
}
