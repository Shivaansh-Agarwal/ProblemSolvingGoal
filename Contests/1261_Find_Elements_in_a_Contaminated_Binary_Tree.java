/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class FindElements {
    
    public static void recover(TreeNode root){
        if(root.left==null && root.right==null)
            return;
        if(root.left!=null){
            root.left.val = 2*root.val+1;
            recover(root.left);
        }
        if(root.right!=null){
            root.right.val = 2*root.val+2;
            recover(root.right);
        }
    }
    
    public static ArrayList<Integer> arr = new ArrayList<Integer>();
    
    public static void addElements(TreeNode root){
        if(root==null)
            return;
        if(root.left!=null){
            arr.add(root.left.val);
            addElements(root.left);
        }
        if(root.right!=null){
            arr.add(root.right.val);
            addElements(root.right);
        }
    }
    
    public FindElements(TreeNode root) {
        root.val = 0;
        recover(root);
        //ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.clear();
        arr.add(root.val);
        addElements(root);
    }
    
    public boolean find(int target) {
        return arr.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */