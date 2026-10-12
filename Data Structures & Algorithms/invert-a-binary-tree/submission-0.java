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
    public TreeNode invertTree(TreeNode root) {

        // switch left and right on each recursive call 

        if (root == null){
            return root;
        }

        int val = root.val; 
        TreeNode leftTree = invertTree(root.left);
        TreeNode rightTree = invertTree(root.right);

        TreeNode ans = new TreeNode(val, rightTree, leftTree);

        return ans; 
        
    }
}
