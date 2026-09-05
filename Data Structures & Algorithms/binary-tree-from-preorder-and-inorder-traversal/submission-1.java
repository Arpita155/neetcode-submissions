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
    
    public int i = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        i = 0;
        return createTree(inorder,preorder,0,inorder.length-1);
    }
    
    
    
    public TreeNode createTree(int[]inorder, int[]preorder, int st, int end){
        // base case
        if(st > end){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[i++]);
        if(st == end){
            return root;
        }
        
        // search the root.data in inorder array
        int j = st;
        for(int id=st;id<=end;id++){
            if(inorder[id] == root.val){
                j = id;
                break;
            }
        }
        
        root.left = createTree(inorder, preorder, st, j-1);
        root.right = createTree(inorder,preorder,j+1,end);
        
        return root;
    }
}
