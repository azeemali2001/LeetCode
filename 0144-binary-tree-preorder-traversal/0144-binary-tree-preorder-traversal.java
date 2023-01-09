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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        while(root != null){
            
            if(root.left == null){
                list.add(root.val);
                root = root.right;
            }else{
                TreeNode temp = root.left;
                while(temp.right != null && temp.right != root){
                    temp = temp.right;
                }
                
                if(temp.right == null){
                    list.add(root.val);
                    temp.right = root;
                    root = root.left;
                }else if(temp.right == root){
                    temp.right = null;
                    root = root.right;
                }
            }
        }  
        return list;
    }
}