/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return -1;
        }

        Queue<TreeNode> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        q.add(root);
        pq.add(root.val);
        while(!q.isEmpty()){
            TreeNode temp = q.remove();
            if(temp.left != null){
                q.add(temp.left);
                pq.add(temp.left.val);
                if(pq.size() > k){
                    pq.poll();
                }
            }
            if(temp.right != null){
                q.add(temp.right);
                pq.add(temp.right.val);
                if(pq.size() > k){
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }
}
