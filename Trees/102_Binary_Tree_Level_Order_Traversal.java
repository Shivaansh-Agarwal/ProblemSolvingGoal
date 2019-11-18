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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        //ArrayList<Integer> arr = new ArrayList<Integer>();
        List<List<Integer>> finalArray = new ArrayList<List<Integer>>();
        finalArray.add(new ArrayList<Integer>());
        int i=0;
        while(!q.isEmpty()){
            TreeNode currNode = q.poll();
            if(currNode!=null){
                //arr.add(currNode.val);
                finalArray.get(i).add(currNode.val);
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            } else{
                if(!q.isEmpty()){
                    finalArray.add(new ArrayList<Integer>());
                    q.add(null);
                    i+=1;
                }
            }
        }
        return finalArray;
    }
}