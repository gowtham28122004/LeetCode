import java.util.HashSet;

class FindElements {
    HashSet<Integer> node_values;

    private void recoverBinaryTree(TreeNode curr, int val) {
        if (curr == null) return;

        node_values.add(val);
        recoverBinaryTree(curr.left, 2 * val + 1);
        recoverBinaryTree(curr.right, 2 * val + 2);
    }

    public FindElements(TreeNode root) {
        node_values = new HashSet<>();
        if (root != null) {
            root.val = 0; // Root always starts with value 0
            node_values.add(0);
            recoverBinaryTree(root.left, 1);
            recoverBinaryTree(root.right, 2);
        }
    }

    public boolean find(int target) {
        return node_values.contains(target);
    }
}
