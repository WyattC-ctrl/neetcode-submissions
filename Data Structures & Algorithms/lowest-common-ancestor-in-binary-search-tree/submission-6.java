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

        Map<TreeNode, List<TreeNode>> ancestors = new HashMap<>();

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root); 
        ancestors.put(root, new ArrayList<>()); 

        while (!queue.isEmpty()) {
            int size = queue.size(); 
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                ancestors.get(cur).add(cur);
                List<TreeNode> par = ancestors.get(cur);

                if (cur.left != null) {
                    ancestors.put(cur.left, new ArrayList<>(par)); 
                    queue.offer(cur.left); 
                }

                if (cur.right != null) {
                    ancestors.put(cur.right, new ArrayList<>(par)); 
                    queue.offer(cur.right); 
                }
            }
        }

        List<TreeNode> pAnc = ancestors.get(p); 
        List<TreeNode> qAnc = ancestors.get(q); 

        TreeNode match = root; 

        int min = Math.min(pAnc.size(), qAnc.size()); 

        for (int i = 0; i < min; i++){
            if (pAnc.get(i) == qAnc.get(i)){
                match = pAnc.get(i); 
            }
        }
        return match; 
    }
}
