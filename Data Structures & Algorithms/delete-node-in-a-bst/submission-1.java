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
    public TreeNode deleteNode(TreeNode root, int x) {
        if (root == null) {
            return null;
        }

        // Search for the node
        if (x < root.val) {
            root.left = deleteNode(root.left, x);
        } 
        else if (x > root.val) {
            root.right = deleteNode(root.right, x);
        } 
        else {
            // Case 1: No left child
            if (root.left == null) {
                return root.right;
            }else if (root.right == null) {  // Case 2: No right child
                return root.left;
            }else{    // Case 3: Two children
                TreeNode successor = getSuccessor(root);
                root.val = successor.val;
                root.right = deleteNode(root.right,successor.val);
            }
        }

        return root;
    }
    
    TreeNode getSuccessor(TreeNode root){
        TreeNode curr = root.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }
}