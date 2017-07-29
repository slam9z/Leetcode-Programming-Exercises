/**
 * Created by yongchizhang on 17/7/29.
 */
public class BinaryTree_PathSum {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if(root == null){
                return false;
            }
            if(root.left == null && root.right == null){
                return root.val == sum ? true : false;
            }
            if(hasPathSum(root.left, sum - root.val)){
                return true;
            }
            if(hasPathSum(root.right, sum - root.val)){
                return true;
            }
            return false;
        }
    }
}
