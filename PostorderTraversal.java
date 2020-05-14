/**
145. Binary Tree Postorder Traversal
Given a binary tree, return the postorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]
***/




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PostorderTraversal {
    LinkedList<Integer> list = new LinkedList<>();
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     if(root == null){
    //         return list;
    //     }
    //     postorderTraversal(root.left);
    //     postorderTraversal(root.right);
    //     list.add(root.val);
    //     return list;
    // }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if(root == null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.poll();
            if(node.left != null)stack.push(node.left);
            if(node.right !=null)stack.push(node.right);
            list.addFirst(node.val);
        }
        return list;
        
    }
}