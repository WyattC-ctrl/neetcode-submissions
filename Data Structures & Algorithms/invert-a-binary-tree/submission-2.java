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

        // dont have to make a new tree instead rewrite the node 
        root.left = rightTree; 
        root.right = leftTree; 
        return root; 
        
    }
}
