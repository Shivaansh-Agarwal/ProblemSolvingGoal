/*
    993. Cousins in Binary Tree
    https://leetcode.com/problems/cousins-in-binary-tree/
    08/05/2020
    May LeetCoding Challenge
    Day-7
*/

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
    // Helprt function to find Level of a Node
    public int findLevelUtil(TreeNode node, int x, int level){
        if(node==null)
            return 0;
        if(node.val==x)
            return level;
        int leftLevel = findLevelUtil(node.left, x, level+1);
        if(leftLevel!=0)
            return leftLevel; 
        int rightLevel =  findLevelUtil(node.right, x, level+1);
        return rightLevel;
    }
    // Function to find Level of a Node
    public int findLevel(TreeNode node, int x){
        return findLevelUtil(node, x, 1);
    }
    public TreeNode findParent(TreeNode node, int x){
        if(node==null)
            return null;
        if(node.left!=null && node.left.val==x)
            return node;
        else if(node.right!=null && node.right.val==x)
            return node;
        TreeNode parent = findParent(node.left, x);
        if(parent!=null)
            return parent;
        parent = findParent(node.right, x);
        return parent;
    }
    public boolean areSiblings(TreeNode node, int x, int y){
        TreeNode xParent = findParent(node,x);
        TreeNode yParent = findParent(node,y);
        if(xParent.val!=yParent.val)
            return true;
        else
            return false;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int xLevel = findLevel(root, x);
        int yLevel = findLevel(root, y);
        boolean areCousins = true;
        if(xLevel != yLevel)
            areCousins = false;
        else 
            areCousins = areSiblings(root, x, y);
        return areCousins;
    }
}