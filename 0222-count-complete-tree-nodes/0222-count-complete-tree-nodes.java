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
    static int count;
    public int countNodes(TreeNode root) {
        count = 0;
        solve(root);
        return count;
    }
    
    public static void solve(TreeNode node){
        if(node == null) return;
        
        count ++;
        
        solve(node.left);
        solve(node.right);
        
    }
}