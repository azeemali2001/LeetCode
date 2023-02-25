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
    public static TreeNode getRightMostNode(TreeNode ln, TreeNode curr) {
      while(ln.right != null && ln.right != curr) {
          ln = ln.right;
      }
      
      return ln;
  }

  public static ArrayList<Integer> preorderTraversal(TreeNode node) {
    TreeNode curr = node;
    ArrayList<Integer> ans = new ArrayList<>();
    
    while(curr != null) {
        TreeNode ln = curr.left;
        
        if(ln == null) {
            ans.add(curr.val);
            curr = curr.right;
        } else {
            TreeNode rightMostNode = getRightMostNode(ln,curr);
            
            if(rightMostNode.right == null) {         //First Time Visit
                ans.add(curr.val);
                rightMostNode.right = curr;
                curr = curr.left;
            } else {                                //Thread already created destroy it
                rightMostNode.right = null;
                curr = curr.right;
            }
        }
    }
    
    return ans;
  }
}