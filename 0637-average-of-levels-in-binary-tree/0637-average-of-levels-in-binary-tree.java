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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<Double>();
        Queue<TreeNode> lev = new LinkedList<>();
        if(root != null) {
            lev.add(root);
        }
        lev.add(null);
        
        while(lev.peek() != null) {
            double sum = 0;
            int nodes = 0;
            while(lev.peek() != null) {
                TreeNode node = lev.poll();
                sum += node.val;
                nodes++;
                if(node.left != null) {
                    lev.add(node.left);
                }
                if(node.right != null) {
                    lev.add(node.right);
                }
            }
            lev.add(lev.poll());
            avg.add(sum / nodes);
        }
        return avg;
    }
}