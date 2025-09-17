import java.util.*;

public class BinaryTreeLevelOrderTraversal {

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

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) {
            return ans;
        }

        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int n = q.size();

            for(int i=0; i<n; i++) {
                TreeNode curr = q.poll();
                list.add(curr.val);

                if(curr.left != null) {
                    q.add(curr.left);   
                }
                if(curr.right != null) {
                    q.add(curr.right);   
                }
            }
            ans.add(list);
        }
        return ans;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println("Level order traversal of binary tree: " + levelOrder(root));
    }
}
