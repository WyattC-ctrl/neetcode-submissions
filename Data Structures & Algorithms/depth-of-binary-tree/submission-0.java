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
    public int maxDepth(TreeNode root) {
        // depth of the tree, will need a max to decide which is greater 

        //base case 

        if (root == null){
            return 0; 
        }

        // check how far kleft goes down then check how far rigfht goes down that take the max 

        int left = 1 + maxDepth(root.left); 
        int right = 1 + maxDepth(root.right); 

        if (left > right){
            return left; 
        }

        return right; 

        
    }
}
