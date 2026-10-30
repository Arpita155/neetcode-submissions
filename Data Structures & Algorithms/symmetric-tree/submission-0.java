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
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode[]> stack=new ArrayDeque<>();
        stack.push(new TreeNode[]{root,root});
        while(!stack.isEmpty()){TreeNode[] pair=stack.pop();
        TreeNode a=pair[0],b=pair[1];
        if(a==null||b==null){if(a!=b)return false;continue;}if(a.val!=b.val)return false;
        stack.push(new TreeNode[]{a.left,b.right});
        stack.push(new TreeNode[]{a.right,b.left});
        }
        
        return true;
    }
}
