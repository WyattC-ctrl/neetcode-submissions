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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // BFS and group nodes of that list

        List<List<Integer>> lst = new ArrayList<>(); 

        if(root == null){
            return lst; 
        }

        Deque<TreeNode> queue = new ArrayDeque<>(); 

        queue.offer(root); 

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>(); 

            for (int i = 0; i < size; i++){
                TreeNode cur = queue.poll(); 
                tmp.add(cur.val); 

                if (cur.left != null) queue.offer(cur.left); 
                if (cur.right != null) queue.offer(cur.right); 
            }
            lst.add(tmp); 
        }

        return lst; 
        
    }
}
