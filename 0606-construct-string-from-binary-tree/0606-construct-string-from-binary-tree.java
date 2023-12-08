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
    
    StringBuilder ans;
    
    public String tree2str(TreeNode root) {
        ans = new StringBuilder();
        ans.append(root.val);
        solve(root);
        return ans.toString();
    }
    
    
    public void solve(TreeNode root) {
        // ans += root.val;
        
        
        
        if(root.left != null) {
            ans.append("(");
            ans.append(root.left.val);
            solve(root.left);
            ans.append(")");
        } else if(root.right != null) {
            ans.append("()");
        }
        
        if(root.right != null) {
            ans.append("(");
            ans.append(root.right.val);
            solve(root.right);
            ans.append(")");
        }
    }
}