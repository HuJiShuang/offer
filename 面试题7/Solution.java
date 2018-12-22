package leetcode;

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pre ={1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        solution.reConstructBinaryTree(pre,in);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}