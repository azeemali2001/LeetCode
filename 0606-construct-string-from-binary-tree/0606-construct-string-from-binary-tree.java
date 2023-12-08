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
    
    String ans;
    
    public String tree2str(TreeNode root) {
        ans = "";
        ans += root.val;
        solve(root);
        return ans;
    }
    
    
    public void solve(TreeNode root) {
        // ans += root.val;
        
        
        
        if(root.left != null) {
            ans += "(";
            ans += root.left.val;
            solve(root.left);
            ans += ")";
        } else if(root.right != null) {
            ans += "()";
        }
        
        if(root.right != null) {
            ans += "(";
            ans += root.right.val;
            solve(root.right);
            ans += ")";
        }
    }
}