public class BalancedBinaryTree {
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int x) {
            val = x;
        }
    }

    // Function to find height of tree
    public static int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // Function to check if tree is balanced
    public static boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        // Example tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(isBalanced(root)); // true
    }
}
