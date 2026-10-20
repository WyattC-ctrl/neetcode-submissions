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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // dont have to do all this O(n^2) time complexity 
        // can isntead use fact binary search
        // avoid using BFS and DFS when tree in binary search since faster

        TreeNode cur = new TreeNode(); 

        cur = root; 
        
        while(cur != null){
            if (p.val < cur.val && q.val < cur.val){
                cur = cur.left; 
            } else if (p.val > cur.val && q.val > cur.val){
                cur = cur.right; 
            } else {
                return cur; 
            }
        }

        return cur; 
    }
}
