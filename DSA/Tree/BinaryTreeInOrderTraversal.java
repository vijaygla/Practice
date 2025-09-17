import java.util.*;

public class BinaryTreeInOrderTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrderHelper(root, list);
        return list;
    }

    public static void inOrderHelper(TreeNode root, List<Integer> list) {
        if(root != null) {
            inOrderHelper(root.left, list);
            list.add(root.val);
            inOrderHelper(root.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);   
        System.out.println("Inorder traversal of binary tree: " + inorderTraversal(root));
    }
}
