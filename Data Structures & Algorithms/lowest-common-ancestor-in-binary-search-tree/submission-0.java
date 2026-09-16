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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> p1 = new ArrayList<>();
        ArrayList<TreeNode> p2 = new ArrayList<>();
        
        boolean r1 = findlca(p1,p.val,root);
        boolean r2 = findlca(p2,q.val,root);
        
        if(r1==false || r2==false){
            return null;
        }
        
        int i = 0;
        while(i < p1.size() && i < p2.size()){
            if(p1.get(i) != p2.get(i)){
                break;
            }
            i++;
        }
        
        return p1.get(i-1);
    }
    
    boolean findlca(ArrayList<TreeNode> p, int n, TreeNode root){
        if(root == null){
            return false;
        }
        p.add(root);
        if(root.val == n){
            return true;
        }
        if(findlca(p,n,root.left) || findlca(p,n,root.right)){
            return true;
        }
        p.remove(p.size()-1);
        
        return false;
    }
}
