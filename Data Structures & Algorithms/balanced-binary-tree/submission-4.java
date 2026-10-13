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
    public boolean isBalanced(TreeNode root) {

        // go down every left and right subtree and make sure equal in length

        if (root == null){
            return true; 
        }

        int left = depth(root.left); 
        int right = depth(root.right); 

        boolean lftTree; 
        boolean rgtTree; 

        if (Math.abs(left - right) < 2) {
            lftTree = isBalanced(root.left);
            rgtTree = isBalanced(root.right);
        } else {
            System.out.println("faled since not equal size" + left + "  "  + right );
            return false; 
        }

        if (lftTree && rgtTree){
            return true;
        }

        return false; 
        
    }

    // need to return the length of both subtrees

    private int depth(TreeNode root){

        if (root == null) return 0; 

        int lft = 1 + depth(root.left); 

        int rgt = 1 + depth(root.right);

        if (lft > rgt){
            return lft; 
        }

        return rgt; 


    }
}
