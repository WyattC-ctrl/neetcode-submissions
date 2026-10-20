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
        // store the parents iof each node and find out which ones overlap
        // BFS since want to find lowest common ancestor, each node has exactly one direct -parent
        // but many ancestors may not b parent taht connects

        Map<TreeNode, List<TreeNode>> ancestors = new HashMap<>();

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root); // root will have no ancestors
        ancestors.put(root, new ArrayList<>()); 

        // issue is going depth so if share same depth being added 
        // only get parent

        while (!queue.isEmpty()) {
            int size = queue.size(); 
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                System.out.println("tracing queue" + cur.val); 
                ancestors.get(cur).add(cur);

                if (cur.left != null) {
                    System.out.println(cur.left.val); 
                    //know node will be null since first time being visited
                    List<TreeNode> par = ancestors.get(cur);
                    ancestors.put(cur.left, new ArrayList<>(par)); 
                    queue.offer(cur.left); 
                }

                if (cur.right != null) {
                    System.out.println(cur.right.val); 
                    List<TreeNode> par = ancestors.get(cur);
                    ancestors.put(cur.right, new ArrayList<>(par)); 
                    queue.offer(cur.right); 
                }
            }
        }

        List<TreeNode> pAnc = ancestors.get(p); 
        List<TreeNode> qAnc = ancestors.get(q); 
        

        for (TreeNode ele : pAnc){
            System.out.println("parent of first: " + ele.val); 
        }
        for (TreeNode ele : qAnc){
            System.out.println("parent of second: " + ele.val); 
        }

        TreeNode match = root; 

        int min = Math.min(pAnc.size(), qAnc.size()); 

        for (int i = 0; i < min; i++){
            if (pAnc.get(i).val == qAnc.get(i).val){
                match = pAnc.get(i); // guarentee to be last node
            }
        }

        return match; 

        // first matching tree node
    }
}
