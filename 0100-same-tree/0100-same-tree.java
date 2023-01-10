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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null){
            if(q!=null){
                return false;
            }else{
                return true;
            }
        }           //Both lines are for Base case
        if(q==null){
            if(p!= null){
                return false;
            }else{
                return true;
            }
        }           //--we can't simply return when p||q == null
        
        
        
        if(p.left == null){
            if(q.left != null){
                return false;
            }
        }else{
            if(q.left != null){
                if(p.left.val != q.left.val){
                    return false;
                }
            }else{
                return false;
            }
        }
        
        if(p.right == null){
            if(q.right != null){
                return false;
            }
        }else{
            if(q.right != null){
                if(p.right.val != q.right.val){
                    return false;
                }
            }else{
                return false;
            }
        }
        
        if(p.val != q.val){
            return false;
        }
        
        
        if(!isSameTree(p.left,q.left)){
            return false;
        }
        if(!isSameTree(p.right,q.right)){
            return false;
        }
        
        return true;
    }
}