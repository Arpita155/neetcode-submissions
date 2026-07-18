class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[]pse = new int[n];
        Stack<Integer> st = new Stack<>();
        int k = 0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[k++]=-1;
            }else{
                pse[k++]=st.peek();
            }
            st.push(i);
        }

        st.clear();
        int[]nse = new int[n];
        k = heights.length-1;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[k--]=n;
            }else{
                nse[k--]=st.peek();
            }
            st.push(i);
        }

        int largestArea = 0;
        for(int i=0;i<n;i++){
            int area = heights[i]*(nse[i]-pse[i]-1);
            largestArea = Math.max(area,largestArea);
        }

        return largestArea;
    }
}
