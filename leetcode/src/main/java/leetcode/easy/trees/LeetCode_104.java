package leetcode.easy.trees;

public class LeetCode_104 {

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * SOLVED: 23.12.15
     * https://leetcode.com/problems/maximum-depth-of-binary-tree/
     */
    public int maxDepth(TreeNode root) {
        return countDepth(root);
    }

    public int countDepth(TreeNode root) {
        // 만약 자기가 null이라면 0을 리턴한다.
        if (root == null) {
            return 0;
        }
        // 그렇지 않다면 우선 자기까지 들어왔으므로 1을 저장해둔다.
        int count = 1;
        // 왼쪽 자식과 오른쪽 자식에서의 depth를 비교한다.
        int left = countDepth(root.left);
        int right = countDepth(root.right);
        // 최종적으로 count와 (left, right) 중 큰 값을 더한 값을 반환한다. left와 right를 모두 더하게 하면 잘못된 값이 반환되며, 얻고자 하는 값은 가장 깊이 들어간 것의 깊이이기 때문이다.
        return count + Math.max(left, right);
    }
}
