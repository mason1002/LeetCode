package FlattenBinaryTree2LinkedList;
/*
     Author:Mason
     2018/5/23 1:30

    1
   / \
  2   5
 / \   \
3   4   6      =>


1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
*/

public class Solution {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    public void flatten(TreeNode root) {
        flat(root);
    }

    private TreeNode flat(TreeNode root) {
        if (root == null) return null;
        TreeNode node = root;
        TreeNode right = flat(node.right);
        node.right = flat(node.left);
        node.left = null;
        while (node.right != null) node = node.right;
        node.right = right;

        return root;
    }


    // another straightforward sol.
    public void flatten(TreeNode root) {
        if (root == null) return;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;

        flatten(left);
        flatten(right);

        root.right = left;
        TreeNode cur = root;
        while (cur.right != null) cur = cur.right;
        cur.right = right;
    }


}
