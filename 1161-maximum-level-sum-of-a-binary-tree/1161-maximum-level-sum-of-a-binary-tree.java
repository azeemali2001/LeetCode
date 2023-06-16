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
    public int maxLevelSum(TreeNode root) {
        // using BFS
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        
        int level = 0;
        int ans = Integer.MIN_VALUE;
        int ansl = -1;
        while(que.size() != 0) {
            int size = que.size();
            int sum = 0;
            level++;
            
            while(size-->0) {
                TreeNode rem = que.remove();
                
                sum += rem.val;
                
                
                if(rem.left != null) { 
                    que.add(rem.left);
                } 
                
                if(rem.right != null) {
                    que.add(rem.right);
                }
            }
            
            if(sum > ans) {
                ans = sum;
                ansl = level;
            }
        }
        
        return ansl;
    }
}