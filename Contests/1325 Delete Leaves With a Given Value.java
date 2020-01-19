/*
    Leetcode
    https://leetcode.com/contest/weekly-contest-172/problems/delete-leaves-with-a-given-value/
    1325. Delete Leaves With a Given Value
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null)
            return null;
        root.left = removeLeafNodes(root.left,target);
        root.right = removeLeafNodes(root.right,target);
        if(root.left==null && root.right==null && root.val==target){
            return null;
        }
        return root;
    }
}