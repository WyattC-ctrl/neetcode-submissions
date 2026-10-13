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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // check if there is a subtree within root that matches
        // checking if two trees are equal 
        // keep checking until we have travered enture tree 

        if (root == null && subRoot != null){
            return false; 
        }

        // dont start traversing until we find at least one repeated value 


        boolean left; 
        boolean right; 

        if (root.val == subRoot.val){
            left = equal (root.left, subRoot.left); 
            right = equal (root.right, subRoot.right); 
            if (left && right){
                return true; 
            }
        }
        

        boolean leftT = isSubtree(root.left, subRoot);
        boolean rightT = isSubtree(root.right, subRoot);

        if (leftT || rightT){
            return true; 
        }

        return false; 
    }

    

    private boolean equal(TreeNode root, TreeNode sub){
        
        if (root == null && sub == null){
            return true; 
        } 

        
        else if (sub == null && root != null || sub != null && root == null ){
            return false; 
        } 
        
        else if (root.val == sub.val && equal(root.left, sub.left) && equal(root.right, sub.right)){
            return true; 
            }
    
        
        return false; 
        }
    }
    
