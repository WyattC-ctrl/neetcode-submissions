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
    public int diameterOfBinaryTree(TreeNode root) {
        // number of edges in a tree

        if (root == null){
            return -1; // always one less edge then node in a tree so if reach end return -1 to account for loss still works if you have one noe because path is 0
        }

        // between any two nodes means you can combine paths left and right 


        int leftDepth = depthMaxRL(root.left);
        int rightDepth = depthMaxRL(root.right);

        int diam = leftDepth + rightDepth; 

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        return Math.max(diam, Math.max(left, right));
        
    }

    // return if left or right is larger
    private int depthMaxRL(TreeNode root){

        if (root == null) return 0; 

        int left = 1 + depthMaxRL(root.left); 
        int right = 1 + depthMaxRL(root.right); 

        if (left > right) return left; 

        return right; 

    }

}
